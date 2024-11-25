package com.syedsaifhossain.necterappproject.dataclass

import com.syedsaifhossain.necterappproject.R

data class GroceriesProduct(
    val id: Int,
    val image:Int,
    val name:String,
)

val groceriesProductList = listOf<GroceriesProduct>(

    GroceriesProduct(id=3,R.drawable.pulses_image,"Pulses"),
    GroceriesProduct(id=1,R.drawable.rice,"Rice"),
    GroceriesProduct(id=2,R.drawable.appleimage,"Red Apple"),
    GroceriesProduct(id=4,R.drawable.beverage,"Beverage"),
    GroceriesProduct(id=5,R.drawable.egg,"White"),
    GroceriesProduct(id=6,R.drawable.beef,"Beef"),
    GroceriesProduct(id=7,R.drawable.egg_red,"Eggs Red"),
    GroceriesProduct(id=8,R.drawable.fruitveg,"Fruit & Vegetable"),
    GroceriesProduct(id=9,R.drawable.oils,"Oils"),
    GroceriesProduct(id=10,R.drawable.cream_product,"Dairy & Eggs")
)