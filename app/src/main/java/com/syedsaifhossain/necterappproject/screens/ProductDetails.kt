package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
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
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent


@Composable
fun ProductDetails(modifier: Modifier=Modifier) {

    Box(modifier=modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.rectangle_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
            )

        Column(
            modifier.fillMaxSize().padding(top=10.dp)
        )
           {

            Row(modifier.fillMaxWidth().padding(top = 35.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null,

                    modifier.size(40.dp).clickable {  })

                Icon(painter = painterResource(id = R.drawable.file_icon), contentDescription = null,
                    modifier.size(40.dp).padding(end = 20.dp).clickable {  })

            }

            Spacer(modifier=modifier.height(10.dp))

            ProductImageSlider()
               Spacer(modifier=modifier.height(80.dp))

            Row(modifier.fillMaxWidth().padding(horizontal = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                TextComponent(modifier=Modifier,
                    text = "Natural Red Apple",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF030303),
                    textAlign = TextAlign.Center
                )
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null,
                    modifier.clickable {  })
            }
            Spacer(modifier = modifier.height(10.dp))
            TextComponent(
                Modifier
                    .fillMaxWidth().padding(start = 15.dp)
                    .height(30.dp),
                text = "1kg, Price",
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF030303),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = modifier.height(10.dp))
            Row(modifier.fillMaxWidth().padding(horizontal = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {

                CountNumber()
                    TextComponent(modifier=Modifier,
                        text = "$4.99",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF030303),
                        textAlign = TextAlign.Center
                    )
                }
               Spacer(modifier.height(20.dp))
               Divider()
               Spacer(modifier.height(20.dp))

               Row(modifier.fillMaxWidth().padding(horizontal = 15.dp),
                   verticalAlignment = Alignment.CenterVertically,
                   horizontalArrangement = Arrangement.SpaceBetween) {
                   TextComponent(modifier=Modifier,

                       text = "Product Details",
                       fontSize = 26.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color(0xFF030303),
                       textAlign = TextAlign.Center
                   )
                   Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null,
                       modifier.clickable {  }.size(30.dp))
               }


               Spacer(modifier = modifier.height(10.dp))

            TextComponent(
                Modifier
                    .fillMaxWidth().padding(horizontal = 10.dp),
                text = "Switch or your location to stay in tune with" +
                        "Switch or your location to stay in tune with"+
                        "Switch or your location to stay in tune with",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7C7C7C),

                textAlign = TextAlign.Start
            )

            Spacer(modifier = modifier.height(10.dp))
               Divider()
            Spacer(modifier = modifier.height(10.dp))

               Row(modifier.fillMaxWidth().padding(horizontal = 15.dp),
                   verticalAlignment = Alignment.CenterVertically,
                   horizontalArrangement = Arrangement.SpaceBetween) {
                   TextComponent(modifier=Modifier,

                       text = "Nutrition",
                       fontSize = 24.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color(0xFF030303),
                       textAlign = TextAlign.Center
                   )

                   Row(modifier.width(200.dp),
                       verticalAlignment = Alignment.CenterVertically,
                       horizontalArrangement = Arrangement.End){
                       Box(
                           modifier = Modifier
                               .height(30.dp)
                               .width(90.dp)
                               .padding(start = 20.dp)
                               .background(
                                   color = Color(0xFFE1E1E5),
                                   shape = RoundedCornerShape(10.dp)
                               )
                               .clickable { /* Your click action */ }
                       ) {
                           Text(
                               text = "100 gm",
                               fontSize = 14.sp,
                               fontWeight = FontWeight(600),
                               color = Color(0xFF7C7C7C),
                               textAlign = TextAlign.Start,
                               modifier = Modifier.align(Alignment.Center)                            )
                       }
                       Icon(
                           imageVector = Icons.Default.KeyboardArrowRight,
                           contentDescription = null,
                           modifier = Modifier.clickable { }.size(30.dp)
                       )

                   }
               }

               Spacer(modifier = modifier.height(15.dp))

               Divider()


               Spacer(modifier = modifier.height(5.dp))

               Row(modifier.fillMaxWidth().padding(horizontal = 15.dp),
                   verticalAlignment = Alignment.CenterVertically,
                   horizontalArrangement = Arrangement.SpaceBetween) {
                   TextComponent(modifier=Modifier,
                       text = "Review",
                       fontSize = 18.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color(0xFF030303),
                       textAlign = TextAlign.Center
                   )

                   Row(
                       horizontalArrangement = Arrangement.spacedBy(3.dp),
                       verticalAlignment = Alignment.CenterVertically
                   ) {

                       for (i in 1..5) {
                           Icon(
                               imageVector = Icons.Filled.Star,
                               contentDescription = "Rating Star",
                               tint = Color(0xFFF3CF17),
                               modifier = Modifier.size(18.dp)
                           )
                       }
                       Icon(
                           imageVector = Icons.Default.KeyboardArrowRight,
                           contentDescription = null,
                           modifier = Modifier.clickable { }.size(30.dp)
                       )
                   }
               }
               Spacer(modifier = modifier.height(5.dp))

            ButtonComponent(modifier.fillMaxWidth()
                .padding(15.dp, 15.dp),
                onClick = {},
                containerColor = Color(0xFF53b175),
                contentColor = Color(0xFFFFF9FF),
                text = "Add to basket",
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon={ }
            )
           }
    }
}

@Composable

fun ProductImageSlider() {
    val images = listOf(
        R.drawable.appleimage, // Replace with your actual images
        R.drawable.fruitveg, // Add more images as needed
        R.drawable.vegtable
    )

    // Create pagerState using rememberPagerState
    val pagerState = rememberPagerState(pageCount = {images.size})

    // HorizontalPager to allow swiping between images
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxWidth()
    ) { page ->
            Image(painter = painterResource(id = images[page]),
                contentDescription = "Image $page",
                modifier = Modifier.fillMaxWidth().size(200.dp)
            )
    }
}


@Composable
fun CountNumber(modifier: Modifier=Modifier){
    var count by remember{ mutableStateOf(1) }

    Row(modifier.width(200.dp),
        verticalAlignment = Alignment.CenterVertically) {

        TextComponent(modifier=Modifier.clickable { count-- },
            text = "-",

            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF030303),
            textAlign = TextAlign.Start
        )
        Spacer(modifier.width(8.dp))
        Box(
            modifier = Modifier
                .background(Color(0xFFE0E0E0),shape = RoundedCornerShape(10.dp))
                .height(40.dp).width(40.dp)
        ){
            TextComponent(modifier=Modifier.align((Alignment.Center)),
                text = "${count}",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF030303),
                textAlign = TextAlign.Start
            )
        }

        Spacer(modifier.width(8.dp))
        TextComponent(modifier=Modifier.clickable { count++ },
            text = "+",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF030303),
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun Divider(modifier: Modifier=Modifier){
    Spacer(modifier.fillMaxWidth().padding(horizontal = 20.dp).background(color=Color.Gray).height(1.dp))
}


@Preview(showBackground = true)
@Composable
fun ProductDetailPreview(){
    ProductDetails()
}