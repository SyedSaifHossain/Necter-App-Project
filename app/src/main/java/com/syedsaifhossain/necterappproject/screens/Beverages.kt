package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
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
import com.syedsaifhossain.necterappproject.dataclass.BeverageProduct
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.dataclass.beverageList
import com.syedsaifhossain.necterappproject.components.TextComponent
import com.syedsaifhossain.necterappproject.screens.BeverageProductList as BeverageProductList

@Composable
fun BeverageScreen(navController: NavController,modifier: Modifier=Modifier){
    Box(modifier.fillMaxSize()){
        Column(modifier.fillMaxWidth().padding(top = 40.dp)) {

            BeverageHeaderSection(navController)


            BeverageProductList()
        }
    }


}


@Composable
fun BeverageHeaderSection(navController: NavController,modifier: Modifier=Modifier){
Row(modifier.fillMaxWidth().padding(horizontal = 10.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Center){
    IconButton(onClick = {}, modifier=Modifier.weight(1f)) {
        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null,
            modifier.size(50.dp))
    }

    TextComponent(modifier=Modifier.weight(8f),
        text = "Beverages",
        fontSize = 28.sp,
        fontWeight = FontWeight(600),
        color = Color(0xFF181725),
        textAlign = TextAlign.Center
    )
    IconButton(onClick = {}, modifier=Modifier.weight(1f)) {
        Icon(painter = painterResource(id = R.drawable.filter), contentDescription = null,
            modifier = Modifier.weight(1f).size(45.dp).padding(end = 10.dp))
    }
}
}

@Composable
fun BeverageProductList(){
    BeverageProductListVerticalGrid(beverageList= beverageList)
}

@Composable
fun BeverageProductListVerticalGrid(beverageList:List<BeverageProduct>, modifier: Modifier=Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {

        items(items=beverageList){ beverage ->

            BeverageProductItem(beverageProduct=beverage)
        }
    }

}

@Composable
fun BeverageProductItem(beverageProduct: BeverageProduct, modifier: Modifier=Modifier){
    Column(modifier.padding(5.dp)) {
        Card(
            modifier
                .width(180.dp)
                .height(235.dp)
                .padding(3.dp)
                .border(BorderStroke(1.5.dp,Color(0xFFF2F3F2)),
                    shape = RoundedCornerShape(15.dp)
                ),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(containerColor=Color.White))
        {


                Column(modifier.fillMaxSize().padding(5.dp),
                    verticalArrangement = Arrangement.Center) {
                    Spacer(Modifier.height(8.dp))
                    Image(
                        painter = painterResource(id = beverageProduct.productImage),
                        contentDescription = "",
                        modifier
                            .size(70.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Spacer(Modifier.height(10.dp))
                    TextComponent(
                        modifier = modifier.height(50.dp).width(140.dp)
                            .padding(start = 8.dp, top = 5.dp),
                        text = beverageProduct.productName,
                        fontWeight = FontWeight(600),
                        fontSize = 18.sp,
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Start
                    )
                    TextComponent(
                        modifier = modifier.padding(start = 8.dp),
                        text = beverageProduct.label,
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

                            text = beverageProduct.price,
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBeverageScreen() {
    BeverageScreen(navController = rememberNavController())
}

