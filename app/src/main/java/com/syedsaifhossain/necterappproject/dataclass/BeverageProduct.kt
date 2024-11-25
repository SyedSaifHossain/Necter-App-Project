package com.syedsaifhossain.necterappproject.dataclass

import com.syedsaifhossain.necterappproject.R

data class BeverageProduct(

    val productImage : Int,
    val productName:String,
    val label:String,
    val price : String
)

val beverageList = listOf<BeverageProduct>(
    BeverageProduct(R.drawable.dietcoke_can,"Diet Coke","355ml, Price","$1.99"),
    BeverageProduct(R.drawable.sprite_can,"Sprite Can","325ml, Price","$1.50"),
    BeverageProduct(R.drawable.apple_juice,"Apple & Grape Juice","2ml, Price","$15.99"),
    BeverageProduct(R.drawable.orange_juice,"Orange","2ml, Price","$15.99"),
    BeverageProduct(R.drawable.cocacola_can,"Coca Cola Can","325ml, Price","$4.99"),
    BeverageProduct(R.drawable.pepsi,"Pepsi Can","330ml, Price","$4.99"),
    BeverageProduct(R.drawable.dietcoke_can,"Diet Coke","355ml, Price","$1.99"),
    BeverageProduct(R.drawable.sprite_can,"Sprite Can","325ml, Price","$1.50"),
    BeverageProduct(R.drawable.apple_juice,"Apple & Grape Juice","2ml, Price","$15.99"),
    BeverageProduct(R.drawable.orange_juice,"Orange","2ml, Price","$15.99"),
    BeverageProduct(R.drawable.cocacola_can,"Coca Cola Can","325ml, Price","$4.99"),
    BeverageProduct(R.drawable.pepsi,"Pepsi Can","330ml, Price","$4.99"),
    BeverageProduct(R.drawable.dietcoke_can,"Diet Coke","355ml, Price","$1.99"),
    BeverageProduct(R.drawable.sprite_can,"Sprite Can","325ml, Price","$1.50"),
    BeverageProduct(R.drawable.apple_juice,"Apple & Grape Juice","2ml, Price","$15.99"),
    BeverageProduct(R.drawable.orange_juice,"Orange","2ml, Price","$15.99"),
    BeverageProduct(R.drawable.cocacola_can,"Coca Cola Can","325ml, Price","$4.99"),
    BeverageProduct(R.drawable.pepsi,"Pepsi Can","330ml, Price","$4.99"),
)