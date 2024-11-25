package com.syedsaifhossain.necterappproject.dataclass

import com.syedsaifhossain.necterappproject.R

data class SellingProduct(
    val id: Int,
    val image:Int,
    val name:String,
    val label:String,
    val price : String
)

val sellingProductList = listOf<SellingProduct>(

    SellingProduct(id=3,R.drawable.bellpapper_icon,"Bell peper Red","1kg, Price","$4.99"),
    SellingProduct(id=1,R.drawable.ginger,"ginger","1kg, Price","$4.99"),
    SellingProduct(id=2,R.drawable.appleimage,"Red Apple","1kg, Price","$4.99"),
    SellingProduct(id=4,R.drawable.beverage,"Beverage","325ml, Price","$1.50"),
    SellingProduct(id=5,R.drawable.egg,"White","4Pcs, Price","$1.99"),
    SellingProduct(id=6,R.drawable.beef,"Beef","1kg, Price","$4.99"),
    SellingProduct(id=7,R.drawable.egg_red,"Eggs Red","4Pcs, Price","$1.99"),
    SellingProduct(id=8,R.drawable.fruitveg,"Fruit & Vegetable","5kg, Price","$10.99"),
    SellingProduct(id=9,R.drawable.oils,"Oils","1L, Price","$1.99"),
    SellingProduct(id=10,R.drawable.cream_product,"Dairy & Eggs","5kg, Price","$5.99")
)