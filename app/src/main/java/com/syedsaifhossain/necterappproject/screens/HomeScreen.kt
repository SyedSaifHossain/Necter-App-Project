package com.syedsaifhossain.necterappproject.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.SearchScreenComponent
import com.syedsaifhossain.necterappproject.components.TextComponent
import com.syedsaifhossain.necterappproject.dataclass.GroceriesProduct
import com.syedsaifhossain.necterappproject.dataclass.OfferProduct
import com.syedsaifhossain.necterappproject.dataclass.SellingProduct
import com.syedsaifhossain.necterappproject.dataclass.groceriesProductList
import com.syedsaifhossain.necterappproject.dataclass.offerProductList
import com.syedsaifhossain.necterappproject.dataclass.sellingProductList
import com.syedsaifhossain.necterappproject.navigation.NavigationGraph

@Composable
fun HomeScreen(navController: NavController,modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = { BottomNavbar() },
        content = {
            Box(modifier.fillMaxSize().padding(it)
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(

                        painter = painterResource(id = R.drawable.corrot_icon),
                        contentDescription = "Carrot image",
                        modifier
                            .size(40.dp)
                    )
                    Spacer(modifier.height(10.dp))

                    Row(
                        modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location icon",
                            modifier.size(30.dp)
                        )

                        Spacer(modifier.width(3.dp))

                        Text(
                            text = "Dhaka, Banasree",
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF4C4F4D)
                        )
                    }
                    HomeSearchSection()

                    ImageSlider()

                    Spacer(modifier.height(15.dp))
                    OfferSection()
                    SellingSection()
                    GroceriesSection()
                }
            }

        }
    )

}


@Composable
fun ImageSlider() {
    val images = listOf(
        R.drawable.banner_image, // Replace with your actual images
        R.drawable.banner_image, // Add more images as needed
        R.drawable.banner_image
    )

    // Create pagerState using rememberPagerState
    val pagerState = rememberPagerState(pageCount = {images.size})

    // HorizontalPager to allow swiping between images
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxWidth()
    ) { page ->
        // Card for each image in the pager
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Image(
                painter = painterResource(id = images[page]),
                contentDescription = "Image $page",
                modifier = Modifier
                    .width(370.dp)
                    .height(130.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun OfferSection(modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Exclusive offer",
            fontSize = 24.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF181725)
        )
        Text(
            text = "See all",
            fontSize = 18.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF53b175)
        )
    }

    OfferProductList()
}

@Composable
fun SellingSection(modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Best Selling",
            fontSize = 24.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF181725)
        )
        Text(
            text = "See all",
            fontSize = 18.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF53b175)
        )
    }

    SellingProductList()
}
@Composable
fun GroceriesSection(modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Groceries",
            fontSize = 24.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF181725)
        )
        Text(
            text = "See all",
            fontSize = 18.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF53b175)
        )
    }
    Spacer(modifier.height(10.dp))
    GroceriesProductList()
    Spacer(modifier.height(10.dp))

    OfferProductList()
}


@Composable
fun HomeSearchSection(modifier: Modifier=Modifier){
    var textState by remember { mutableStateOf("") }
    var activeState by remember{mutableStateOf(false)}
    SearchScreenComponent(modifier.height(105.dp).padding(bottom = 50.dp),
        query = textState,
        onQueryChanged = { textState = it },
        onSearched = { activeState = false },
        active = activeState,
        onActiveChanged = { activeState = it },
        placeholder = {
            Text(text = "Search Store", fontSize = 20.sp, fontWeight = FontWeight(600))
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search"
            )
        },
        shape = RoundedCornerShape(8.dp)
    )
}

@Composable
fun BottomNavbar(modifier: Modifier = Modifier) {
    var selectIndex by remember { mutableStateOf(0) }
    data class NavbarContent(
        val route: String,
        var label: String,
        var icon: @Composable ()-> Unit,
        var badgeCount: Int? = null,
    )

    val navBarList = listOf(
        NavbarContent(
            route = NavigationGraph.HomeScreen.route,
            label = "Store",
            icon = { Icon(painter = painterResource(id = R.drawable.store), contentDescription = null,

                modifier.size(20.dp)) }
        ),

        NavbarContent(
            route = NavigationGraph.Explore.route,
            label = "Explore",
            icon = { Icon(painter = painterResource(id = R.drawable.explore), contentDescription = null,

                modifier.size(20.dp)) }
        ),
        NavbarContent(
            route = NavigationGraph.MyCard.route,
            label = "Cart",
            icon = { Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null) }
        ),
        NavbarContent(
            route = NavigationGraph.Favorite.route,
            label = "Favourite",
            icon = { Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null) }
        ),
        NavbarContent(
            route = NavigationGraph.Account.route,
            label = "Account",
            icon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = null) }
        )
    )

    NavigationBar(modifier.fillMaxWidth()) {
        navBarList.forEachIndexed { index, navItem ->
            NavigationBarItem(
                selected = index == selectIndex,
                onClick = { selectIndex = index },
                modifier = Modifier,
                label = { Text(text = navItem.label) },
                icon = {
                    navItem.icon()
                }
            )
        }
    }
}


@Composable
fun OfferProductList(){
    OfferProductListVerticalGrid(offerList= offerProductList)
}

@Composable
fun OfferProductListVerticalGrid(offerList:List<OfferProduct>, modifier: Modifier=Modifier) {
    LazyRow(
        modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        items(items=offerList){
            OfferProductItem(offerProduct=it)
        }
    }
}

@Composable
fun OfferProductItem(offerProduct: OfferProduct, modifier: Modifier=Modifier){
    Column(modifier.padding(5.dp)) {
        Card(
            modifier
                .width(180.dp)
                .height(200.dp)
                .padding(3.dp)
                .border(
                    BorderStroke(1.5.dp,Color(0xFFF2F3F2)),
                    shape = RoundedCornerShape(15.dp)
                ),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(containerColor=Color.White))
        {


            Column(modifier.fillMaxSize().padding(5.dp),
                verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = offerProduct.image),
                    contentDescription = "",
                    modifier
                        .size(70.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Spacer(Modifier.height(10.dp))
                TextComponent(
                    modifier = modifier.height(30.dp).width(140.dp)
                        .padding(start = 8.dp, top = 5.dp),
                    text = offerProduct.name,
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Start
                )
                TextComponent(
                    modifier = modifier.padding(start = 8.dp),
                    text = offerProduct.label,
                    fontWeight = FontWeight(600),
                    fontSize = 14.sp,

                    color = Color(0xFF7C7C7C),
                    textAlign = TextAlign.Start
                )

                Spacer(modifier.height(5.dp))
                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextComponent(
                        modifier = modifier,

                        text = offerProduct.price,
                        fontWeight = FontWeight(600),
                        fontSize = 18.sp,
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Start
                    )


                    FloatingActionButton(

                        modifier = Modifier.size(35.dp,35.dp),
                        shape = RoundedCornerShape(10.dp),

                        onClick = {},
                        containerColor = Color(0xFF53b175),
                        contentColor = Color(0xFFfcfcfc)

                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "")
                    }
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}


@Composable
fun SellingProductList(){
    SellingProductListVerticalGrid(sellingList= sellingProductList)
}

@Composable
fun SellingProductListVerticalGrid(sellingList:List<SellingProduct>, modifier: Modifier=Modifier) {
    LazyRow(
        modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {

        items(items=sellingList){
            SellingProductItem(sellingProduct=it)
        }
    }
}

@Composable

fun SellingProductItem(sellingProduct: SellingProduct, modifier: Modifier=Modifier){
    Column(modifier.padding(5.dp)) {
        Card(
            modifier
                .width(180.dp)
                .height(200.dp)
                .padding(3.dp)
                .border(
                    BorderStroke(1.5.dp,Color(0xFFF2F3F2)),
                    shape = RoundedCornerShape(15.dp)
                ),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(containerColor=Color.White))
        {


            Column(modifier.fillMaxSize().padding(5.dp),
                verticalArrangement = Arrangement.Center) {
                Spacer(Modifier.height(8.dp))
                Image(
                    painter = painterResource(id = sellingProduct.image),
                    contentDescription = "",
                    modifier
                        .size(70.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(Modifier.height(10.dp))
                TextComponent(
                    modifier = modifier.height(30.dp).width(140.dp)
                        .padding(start = 8.dp),
                    text = sellingProduct.name,
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Start
                )
                TextComponent(
                    modifier = modifier.padding(start = 8.dp),
                    text = sellingProduct.label,
                    fontWeight = FontWeight(600),
                    fontSize = 14.sp,

                    color = Color(0xFF7C7C7C),
                    textAlign = TextAlign.Start
                )

                Spacer(modifier.height(5.dp))
                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextComponent(
                        modifier = modifier,
                        text = sellingProduct.price,
                        fontWeight = FontWeight(600),
                        fontSize = 18.sp,
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Start
                    )


                    FloatingActionButton(

                        modifier = Modifier.size(35.dp,35.dp),
                        shape = RoundedCornerShape(10.dp),

                        onClick = {},
                        containerColor = Color(0xFF53b175),
                        contentColor = Color(0xFFfcfcfc)

                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "")
                    }
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}

@Composable
fun GroceriesProductList(){
    GroceriesProductListVerticalGrid(groceriesList= groceriesProductList)
}

@Composable
fun GroceriesProductListVerticalGrid(groceriesList:List<GroceriesProduct>, modifier: Modifier=Modifier) {
    LazyRow(
        modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        items(items=groceriesList){

            GroceriesProductItem(groceriesProduct=it)
        }
    }
}

@Composable
fun GroceriesProductItem(groceriesProduct: GroceriesProduct, modifier: Modifier=Modifier){
    Column(modifier.padding(5.dp)) {
        Card(
            modifier
                .width(250.dp)
                .height(100.dp)
                .padding(3.dp)
                .border(
                    BorderStroke(1.5.dp,Color(0xFFF2F3F2)),
                    shape = RoundedCornerShape(15.dp)
                ),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(containerColor=Color.White))
        {

            Row(modifier.fillMaxSize().padding(5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Spacer(Modifier.height(8.dp))
                Image(
                    painter = painterResource(id = groceriesProduct.image),
                    contentDescription = "",
                    modifier
                        .size(80.dp).padding(start = 15.dp),
                )
                TextComponent(

                    modifier = modifier.fillMaxWidth(),
                    text = groceriesProduct.name,
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())

}