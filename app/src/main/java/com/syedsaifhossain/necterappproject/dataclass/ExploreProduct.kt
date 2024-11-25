package com.syedsaifhossain.necterappproject.dataclass

import com.syedsaifhossain.necterappproject.R

data class ExploreProduct(

    val id : Int,
    val image : Int,
    val productName: String
)


val exploreProductList = listOf<ExploreProduct>(

    ExploreProduct(id = 1, image = R.drawable.fruitveg, productName = "Frash Fruit & Vegtable"),
    ExploreProduct(id = 2, image =  R.drawable.oils, productName = "Cooking Oils & Ghee"),
    ExploreProduct(id = 3, image =  R.drawable.fish, productName = "Meat & Fish"),
    ExploreProduct(id = 4, image = R.drawable.cream_product, productName = "Bakery & Snacks"),
    ExploreProduct(id = 5, image = R.drawable.cream_product, productName = "Dairy & Eggs"),
    ExploreProduct(id = 6, image = R.drawable.beverage, productName = "Beverages"),
    ExploreProduct(id = 7, image = R.drawable.fruitveg, productName = "Frash Fruit & Vegtable"),
    ExploreProduct(id = 8, image =  R.drawable.oils, productName = "Cooking Oils & Ghee"),
    ExploreProduct(id = 9, image =  R.drawable.fish, productName = "Meat & Fish"),
    ExploreProduct(id = 10, image = R.drawable.cream_product, productName = "Bakery & Snacks"),
    ExploreProduct(id = 11, image = R.drawable.cream_product, productName = "Dairy & Eggs"),
    ExploreProduct(id = 12, image = R.drawable.beverage, productName = "Beverages"),
    ExploreProduct(id = 13, image = R.drawable.fruitveg, productName = "Frash Fruit & Vegtable"),
    ExploreProduct(id = 14, image =  R.drawable.oils, productName = "Cooking Oils & Ghee"),
    ExploreProduct(id = 15, image =  R.drawable.fish, productName = "Meat & Fish"),
    ExploreProduct(id = 16, image = R.drawable.cream_product, productName = "Bakery & Snacks"),
    ExploreProduct(id = 17, image = R.drawable.cream_product, productName = "Dairy & Eggs"),
    ExploreProduct(id = 18, image = R.drawable.beverage, productName = "Beverages"),
)

