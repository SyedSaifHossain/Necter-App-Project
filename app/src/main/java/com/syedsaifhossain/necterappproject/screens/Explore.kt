package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.components.SearchScreenComponent
import com.syedsaifhossain.necterappproject.components.TextComponent
import com.syedsaifhossain.necterappproject.dataclass.BeverageProduct
import com.syedsaifhossain.necterappproject.dataclass.ExploreProduct
import com.syedsaifhossain.necterappproject.dataclass.beverageList
import com.syedsaifhossain.necterappproject.dataclass.exploreProductList

@Composable
fun ExploredScreen(navController: NavController,modifier: Modifier=Modifier) {

    Scaffold(
        bottomBar = { BottomNavbar() },
        content = {
            Box(modifier = modifier.fillMaxSize().padding(it)) {
                Column(modifier.fillMaxSize().padding(top=10.dp)
                )
                {
                    TextComponent(
                        Modifier
                            .fillMaxWidth().padding(start = 15.dp)
                            .height(30.dp),
                        text = "Find Products",
                        fontSize = 28.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Center
                    )
                    ExploreSearchSection()
                    ExploreProductList()
                }
            }
        }
    )
}

@Composable
fun ExploreSearchSection(modifier: Modifier=Modifier){
    var textState by remember { mutableStateOf("") }
    var activeState by remember{mutableStateOf(false)}
    SearchScreenComponent(modifier.height(105.dp).padding(start = 15.dp, bottom = 50.dp),
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

fun ExploreProductList(){
    ExploreProductListVerticalGrid(beverageList= beverageList)
}

@Composable
fun ExploreProductListVerticalGrid(beverageList:List<BeverageProduct>, modifier: Modifier=Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {

        items(items= exploreProductList){

            ExploreProductItem(exploreProduct=it)
        }
    }

}

@Composable
fun ExploreProductItem(exploreProduct: ExploreProduct, modifier: Modifier=Modifier){
    Column(modifier.padding(5.dp)) {
        Card(
            modifier
                .width(180.dp)
                .height(190.dp)
                .padding(3.dp)
                .border(BorderStroke(1.5.dp,Color(0xFFF2F3F2)),
                    shape = RoundedCornerShape(15.dp)
                ),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(containerColor=Color.White))
        {
            Column(modifier.fillMaxSize().padding(5.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(Modifier.height(8.dp))
                Image(
                    painter = painterResource(id = exploreProduct.image),
                    contentDescription = "",
                    modifier
                        .size(100.dp)
                        .align(Alignment.CenterHorizontally)
                )
                TextComponent(
                    modifier = modifier.height(50.dp).width(170.dp)
                        .padding(start = 8.dp, top = 5.dp),
                    text = exploreProduct.productName,
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewExploreScreen(){
    ExploredScreen(navController = rememberNavController())

}