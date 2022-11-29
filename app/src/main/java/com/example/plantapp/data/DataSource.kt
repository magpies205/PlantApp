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
package com.example.plantapp.data

import com.example.plantapp.constants.ItemType
import com.example.plantapp.model.PlantItem


object DataSource {
    val plantItems = mapOf(
        "javafern" to
                PlantItem(
                    name = "Java Fern",
                    price = 10.00,
                    type = ItemType.PLANT
                ),
        "luckybamboo" to
                PlantItem(
                    name = "Lucky Bamboo",
                    price = 15.00,
                    type = ItemType.PLANT
                ),
        "amazonsword" to
                PlantItem(
                    name = "Amazon Sword",
                    price = 9.50,
                    type = ItemType.PLANT
                ),
        "anubiusnana" to
                PlantItem(
                    name = "Anubius Nana",
                    price = 10.50,
                    type = ItemType.PLANT
                ),
        "salviniaminima" to
                PlantItem(
                    name = "Salvinia Minima",
                    price = 12.00,
                    type = ItemType.PLANT
                ),
        "moss" to
                PlantItem(
                    name = "Moss",
                    price = 6.00,
                    type = ItemType.PLANT
                ),
        "frogbit" to
                PlantItem(
                    name = "Frogbit",
                    price = 12.00,
                    type = ItemType.PLANT
                ),
        "dwarfgrass" to
                PlantItem(
                    name = "Dwarf Grass",
                    price = 7.50,
                    type = ItemType.PLANT
                ),
        "one" to
                PlantItem(
                    name = "1 Day Delivery",
                    price = 10.00,
                    type = ItemType.DELIVERY
                ),
        "five" to
                PlantItem(
                    name = "5 Day Delivery",
                    price = 5.00,
                    type = ItemType.DELIVERY
                ),
        "seven" to
                PlantItem(
                    name = "7+ Day Delivery",
                    price = 1.00,
                    type = ItemType.DELIVERY
                ),
        "free" to
                PlantItem(
                    name = "Pick Up in Store",
                    price = 0.00,
                    type = ItemType.DELIVERY
                ),

    )
}
