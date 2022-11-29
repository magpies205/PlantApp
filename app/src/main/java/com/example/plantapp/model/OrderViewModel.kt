/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.plantapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.plantapp.data.DataSource
import java.text.NumberFormat

class OrderViewModel : ViewModel() {

    //map of plants
    val plantItems = DataSource.plantItems

    private var previousPlantPrice = 0.0
    private var previousDeliveryPrice = 0.0

    // plant order
    private val _plant = MutableLiveData<PlantItem?>()
    val plant: LiveData<PlantItem?> = _plant

    // delivery order
    private val _delivery = MutableLiveData<PlantItem?>()
    val delivery: LiveData<PlantItem?> = _delivery

    // Subtotal for the order
    private val _subtotal = MutableLiveData(0.0)
    val subtotal: LiveData<String> = Transformations.map(_subtotal) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    // Total cost of the order
    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = Transformations.map(_total) {
        NumberFormat.getCurrencyInstance().format(it)
    }


    /**
     * Set the entree for the order.
     */
    fun setPlant(plant: String) {
        // TODO: if _entree.value is not null, set the previous entree price to the current
        //  entree price.
        previousPlantPrice = _plant.value?.price ?: 0.0

        // TODO: if _subtotal.value is not null subtract the previous entree price from the current
        //  subtotal value. This ensures that we only charge for the currently selected entree.
        _subtotal.value = (_subtotal.value ?: 0.0) - previousPlantPrice

        // TODO: set the current entree value to the menu item corresponding to the passed in string
        _plant.value = plantItems[plant]
        // TODO: update the subtotal to reflect the price of the selected entree.
        updateSubtotal(plantItems[plant]?.price ?:0.0)
    }

    /**
     * Set the side for the order.
     */
    fun setDelivery(delivery: String) {
        // TODO: if _side.value is not null, set the previous side price to the current side price.
        previousDeliveryPrice = _delivery.value?.price ?: 0.0

        // TODO: if _subtotal.value is not null subtract the previous side price from the current
        //  subtotal value. This ensures that we only charge for the currently selected side.
        _subtotal.value = (_subtotal.value ?: 0.0) - previousDeliveryPrice

        // TODO: set the current side value to the menu item corresponding to the passed in string
        _delivery.value = plantItems[delivery]
        // TODO: update the subtotal to reflect the price of the selected side.
        updateSubtotal(plantItems[delivery]?.price ?:0.0)
    }

    /**
     * Set the accompaniment for the order.
     */


    /**
     * Update subtotal value.
     */
    private fun updateSubtotal(itemPrice: Double) {
        // TODO: if _subtotal.value is not null, update it to reflect the price of the recently
        //  added item.
        //  Otherwise, set _subtotal.value to equal the price of the item.
        if (_subtotal.value != null){
            _subtotal.value = (_subtotal.value)?.plus(itemPrice)
        }
        else{
            _subtotal.value = itemPrice
        }

        // TODO: calculate the tax and resulting total

    }

    /**
     * Calculate tax and update total.
     */


    /**
     * Reset all values pertaining to the order.
     */
    fun resetOrder() {
        // TODO: Reset all values associated with an order
        previousPlantPrice = 0.0
        previousDeliveryPrice = 0.0
        _plant.value = null
        _delivery.value = null
        _subtotal.value = 0.0
        _total.value = 0.0
    }
}
