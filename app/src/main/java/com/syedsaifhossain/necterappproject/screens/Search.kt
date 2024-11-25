package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
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
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.SearchScreenComponent
import com.syedsaifhossain.necterappproject.components.TextComponent

@Composable
fun SearchScreen(navController: NavController,modifier: Modifier=Modifier) {
    Scaffold(
        bottomBar = { BottomNavbar() },
        content = {

            Box(modifier = modifier.fillMaxSize().padding(it)) {
                Column(modifier.fillMaxSize())
                {
                    TextComponent(
                        Modifier.fillMaxWidth().padding(start = 15.dp),
                        text = "Find Products",
                        fontSize = 28.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Center
                    )

                    SearchBarSection()

                    SearchVerticalGrid()

                }
            }

        }
    )
}


@Composable
fun SearchBarSection(modifier: Modifier=Modifier){
    var textState by remember { mutableStateOf("") }
    var activeState by remember{mutableStateOf(false)}
    Row(modifier.fillMaxWidth().padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {

        SearchScreenComponent(modifier.weight(9f).height(105.dp).padding(start = 15.dp, bottom = 50.dp),

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

            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Search",
                    modifier.border(BorderStroke(width = 1.dp,
                        color=Color(0xFF7C7C7C)),
                        shape = CircleShape).padding(3.dp)
                )
            },
            shape = RoundedCornerShape(8.dp)
        )
        Icon(painter = painterResource(id = R.drawable.filter),
            contentDescription = "Filter icon",

            modifier.size(30.dp).weight(1f).padding(start = 8.dp).clickable {  })
    }
}

@Composable
fun SearchVerticalGrid(modifier: Modifier=Modifier){
    val imageList = listOf(
        R.drawable.egg_red,
        R.drawable.egg,
        R.drawable.pasta,
        R.drawable.egg_noodle,
        R.drawable.mayonnaise,
        R.drawable.nodles,
        R.drawable.egg_red,
        R.drawable.egg,
        R.drawable.pasta,
        R.drawable.egg_noodle,
        R.drawable.mayonnaise,
        R.drawable.nodles,
        R.drawable.egg_red,
        R.drawable.egg,
        R.drawable.pasta,
        R.drawable.egg_noodle,
        R.drawable.mayonnaise,
        R.drawable.nodles,
    )

    LazyVerticalGrid(columns = GridCells.Fixed(2),
        modifier
            .padding(10.dp)
            .fillMaxWidth()){
        items(imageList.size) {
            Column(modifier.padding(5.dp)) {
                Card(
                    modifier
                        .width(180.dp)
                        .padding(5.dp)
                        .border(
                            BorderStroke(1.5.dp,Color(0xFFF2F3F2)),
                            shape = RoundedCornerShape(15.dp)
                        ),

                    colors = CardDefaults.cardColors(

                        containerColor = Color(0xFFFCFCFC)
                    ),
                    shape = RoundedCornerShape(15.dp),
                ) {

                    Box(modifier.fillMaxWidth()) {
                        Column(modifier.fillMaxWidth()) {
                            Spacer(Modifier.height(8.dp))
                            Image(
                                painter = painterResource(id = imageList[it]),
                                contentDescription = "",
                                modifier
                                    .size(70.dp)
                                    .align(Alignment.CenterHorizontally)
                            )

                            Spacer(Modifier.height(8.dp))
                            TextComponent(
                                modifier = modifier.padding(start = 8.dp),
                                text = "Eggs Chicken Red",
                                fontWeight = FontWeight(600),
                                fontSize = 18.sp,
                                color = Color(0xFF181725),
                                textAlign = TextAlign.Start
                            )

                            Spacer(Modifier.height(8.dp))
                            TextComponent(
                                modifier = modifier.padding(start = 8.dp),
                                text = "4 Pcs, Price",
                                fontWeight = FontWeight(600),
                                fontSize = 16.sp,
                                color = Color(0xFF181725),
                                textAlign = TextAlign.Start
                            )

                            Spacer(Modifier.height(8.dp))
                            Row(
                                modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                TextComponent(
                                    modifier = modifier,
                                    text = "$1.99",
                                    fontWeight = FontWeight(600),
                                    fontSize = 18.sp,
                                    color = Color(0xFF181725),
                                    textAlign = TextAlign.Start
                                )


                                FloatingActionButton(

                                    modifier = Modifier.size(40.dp),

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
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchScreenPreview() {
    SearchScreen(navController = rememberNavController())
}