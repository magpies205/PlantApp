
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
    fun setPlant(plant: String) {
        // if _plant.value is not null,the previous plant price will be set to the current plant price.
        previousPlantPrice = _plant.value?.price ?: 0.0

        _subtotal.value = (_subtotal.value ?: 0.0) - previousPlantPrice

        // this sets the current plant value to the plant item corresponding to the passed in string
        _plant.value = plantItems[plant]
        // this updates the subtotal to reflect the price of the selected plant.
        updateSubtotal(plantItems[plant]?.price ?:0.0)
    }

    fun setDelivery(delivery: String) {
        previousDeliveryPrice = _delivery.value?.price ?: 0.0
        _subtotal.value = (_subtotal.value ?: 0.0) - previousDeliveryPrice

        _delivery.value = plantItems[delivery]
        updateSubtotal(plantItems[delivery]?.price ?:0.0)
    }

    private fun updateSubtotal(itemPrice: Double) {
        if (_subtotal.value != null){
            _subtotal.value = (_subtotal.value)?.plus(itemPrice)
        }
        else{
            _subtotal.value = itemPrice
        }



    }

    fun resetOrder() {
        previousPlantPrice = 0.0
        previousDeliveryPrice = 0.0
        _plant.value = null
        _delivery.value = null
        _subtotal.value = 0.0
        _total.value = 0.0
    }
}
