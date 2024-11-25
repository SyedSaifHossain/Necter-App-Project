package com.syedsaifhossain.necterappproject.dataclass

import com.syedsaifhossain.necterappproject.R

data class OfferProduct(
    val id: Int,
    val image:Int,
    val name:String,
    val label:String,
    val price : String
)

val offerProductList = listOf<OfferProduct>(

    OfferProduct(id=1,R.drawable.banana,"Organic Banana","7Pcs, Price","$4.99"),
    OfferProduct(id=2,R.drawable.appleimage,"Red Apple","1kg, Price","$4.99"),
    OfferProduct(id=3,R.drawable.bellpapper_icon,"Bell peper Red","1kg, Price","$4.99"),
    OfferProduct(id=4,R.drawable.beverage,"Beverage","325ml, Price","$1.50"),
    OfferProduct(id=5,R.drawable.egg,"White","4Pcs, Price","$1.99"),
    OfferProduct(id=6,R.drawable.beef,"Beef","1kg, Price","$4.99"),
    OfferProduct(id=7,R.drawable.egg_red,"Eggs Red","4Pcs, Price","$1.99"),
    OfferProduct(id=8,R.drawable.fruitveg,"Fruit & Vegetable","5kg, Price","$10.99"),
    OfferProduct(id=9,R.drawable.oils,"Oils","1L, Price","$1.99"),
    OfferProduct(id=10,R.drawable.cream_product,"Dairy & Eggs","5kg, Price","$5.99")
)