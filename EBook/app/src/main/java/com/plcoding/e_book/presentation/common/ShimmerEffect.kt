package com.plcoding.e_book.presentation.common

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.ui.theme.EBookTheme

fun Modifier.shimmerEffect(): Modifier = composed {
    val transition = rememberInfiniteTransition()
    val alpha = transition.animateFloat(
        initialValue = 0.2f, targetValue = 0.9f, animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000),
            repeatMode = RepeatMode.Reverse
        )
    ).value
    this.then(background(color = Color(android.graphics.Color.parseColor("#b9afa6")).copy(alpha=alpha)))
}


@Composable
fun BookCardShimmerEffect(){
    Box(
        modifier = Modifier
            .width(220.dp)
            .border(
                width = 1.dp,
                color = Color(android.graphics.Color.parseColor("#eeebe9")),
                shape = RoundedCornerShape(10.dp)
            )
            .background(
                color = Color(android.graphics.Color.parseColor("#eeebe9")),
                shape = RoundedCornerShape(10.dp)
            ),
    ) {
        Column {
            Spacer(modifier = Modifier.height(5.dp))
            Row(

            ) {
                Box(
                    modifier = Modifier
                        .height(160.dp)
                        .fillMaxWidth(1f)
                        .padding(start = 5.dp, end = 5.dp)
                        .shimmerEffect()
                        .clip(RoundedCornerShape(4.dp))

                )

            }
            Spacer(modifier = Modifier.height(5.dp))
            Box(

                modifier = Modifier
                    .padding(start = 5.dp)
                    .height(20.dp)
                    .width(210.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .align(Alignment.Start)
                    .shimmerEffect(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Box(

                modifier = Modifier
                    .padding(start = 5.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .height(20.dp)
                    .width(210.dp)
                    .align(Alignment.Start)
                    .shimmerEffect(),
            )
            Spacer(modifier = Modifier.height(5.dp))


            Row {
                Box(

                    modifier = Modifier
                        .padding(end = 5.dp, start=5.dp)
                        .height(20.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .width(70.dp)
                        .shimmerEffect(),

                    )
                Spacer(modifier = Modifier.width(80.dp))
                Box(

                    modifier = Modifier
                        .padding(end = 5.dp)
                        .height(20.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .width(70.dp)
                        .shimmerEffect(),

                    )
            }


            Spacer(modifier = Modifier.height(5.dp))
        }

    }



}
@Composable
fun CategoryCardShimmerEffect(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .shimmerEffect()
                .background(
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = CircleShape
                )
        )
        Box( modifier = Modifier
            .padding(start = 5.dp, top = 5.dp)
            .clip(RoundedCornerShape(4.dp))
            .height(20.dp)
            .width(50.dp)
            .align(Alignment.Start)
            .shimmerEffect(),
        )
    }
}
@Composable
fun ContinueReadingShimmerEffect(){
    Box(
        modifier = Modifier
            .width(230.dp)
            .height(150.dp)

    ) {
        Column {
            Box(modifier = Modifier
                .width(230.dp)
                .height(35.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Box(modifier = Modifier
                .width(230.dp)
                .height(110.dp)
                .border(
                    width = 1.dp,
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = RoundedCornerShape(10.dp)
                )
                .background(
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = RoundedCornerShape(10.dp)
                )
            )
        }
        Row {
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Column {

                    Spacer(modifier = Modifier.height(20.dp))
                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(85.dp)
                            .shimmerEffect()

                    )
                }
            }




            Column {
                Spacer(modifier = Modifier.height(45.dp))
                Box(modifier = Modifier
                    .height(20.dp)
                    .padding(start = 10.dp)
                    .width(120.dp)
                    .shimmerEffect()
                )
                Spacer(modifier = Modifier.height(5.dp))
                Box(
                    modifier = Modifier
                        .height(20.dp)
                        .padding(start = 10.dp)
                        .width(120.dp)
                        .shimmerEffect()
                )
            }

        }


    }


}

@Composable
fun HotBookCardShimmerEffect(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 14.dp, start = 16.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier
            .fillMaxWidth(0.7f)
        ) {
            Text(text = "Hot",

                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                color = Color(android.graphics.Color.parseColor("#513820")),
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(modifier = Modifier.height(30.dp).width(150.dp).shimmerEffect()

            )
            Spacer(modifier = Modifier.height(5.dp))
            Box(modifier = Modifier.height(30.dp).width(150.dp).shimmerEffect()
            )
            Spacer(modifier = Modifier.height(3.dp))
            Box( modifier = Modifier.padding(start=0.dp).align(Alignment.CenterHorizontally).shimmerEffect())
            Box( modifier = Modifier
                    .padding(top = 30.dp, start = 50.dp)
                    .height(37.dp).width(70.dp).shimmerEffect()

            )
        }
        Box(
            contentAlignment = Alignment.Center
        ){
            Box(
                modifier = Modifier
                    .height(145.dp)
                    .width(80.dp)
                    .padding(top = 10.dp, bottom = 10.dp)
                    .shimmerEffect()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BookCardShimmerEffectReview(){
    EBookTheme {
        BookCardShimmerEffect()
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryCardShimmerEffectReview(){
    EBookTheme {
        CategoryCardShimmerEffect()
    }
}

@Preview(showBackground = true)
@Composable
fun ContinueReadingCardShimmerEffectReview(){
    EBookTheme {
        ContinueReadingShimmerEffect()
    }
}

@Preview(showBackground = true)
@Composable
fun HotBookCardShimmerEffectReview(){
    EBookTheme {
        HotBookCardShimmerEffect()
    }
}

@Composable
fun BookCardCategoryShimmerEffect(){
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(130.dp)
            .border(
                width = 1.dp,
                color = Color(android.graphics.Color.parseColor("#eeebe9")),
                shape = RoundedCornerShape(10.dp)
            )
            .background(
                color = Color(android.graphics.Color.parseColor("#eeebe9")),
                shape = RoundedCornerShape(10.dp)
            ),
    ) {
        Row{
            Box(modifier= Modifier
                .height(160.dp)
                .fillMaxWidth(0.3f)
                .clip(
                    MaterialTheme.shapes.medium
                )){
                Box(
                    modifier = Modifier
                        .height(120.dp)
                        .width(70.dp)
                        .align(Alignment.Center)
                        .shimmerEffect()
                        .padding(top = 5.dp, bottom = 5.dp)
                )
//                    AsyncImage(model = ImageRequest.Builder(context).data(book.).build(), contentDescription = null,
//                        modifier= Modifier
//                            .height(160.dp)
//                            .clip(
//                                MaterialTheme.shapes.medium
//                            )
//                    )
            }
            Column(modifier = Modifier.width(250.dp)) {
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(160.dp)
                        .align(Alignment.CenterHorizontally),
                ) {


                }
                Spacer(modifier = Modifier.height(2.dp))
                Box(
                    modifier = Modifier
                        .padding(start = 5.dp)
                        .height(20.dp)
                        .shimmerEffect()
                        .width(180.dp),

                    )
                Spacer(modifier = Modifier.height(2.dp))
                Box(
                    modifier = Modifier
                        .padding(start = 5.dp)
                        .height(20.dp)
                        .shimmerEffect()
                        .width(180.dp),

                    )
                Spacer(modifier = Modifier.height(2.dp))



                Box(

                    modifier = Modifier
                        .align(Alignment.End)
                        .width(40.dp)
                        .shimmerEffect()
                        .height(20.dp)
                        .padding(end = 5.dp),
                )
                Spacer(modifier = Modifier.height(2.dp))
                Row(modifier = Modifier.fillMaxWidth(1f)) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp)
                            .fillMaxWidth(0.5f)
                            .shimmerEffect()
                    )


                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp)
                            .fillMaxWidth(0.5f)
                            .shimmerEffect()
                    )

                }

                Spacer(modifier = Modifier.height(3.dp))
            }

        }



    }


}

@Preview(showBackground = true)
@Composable
fun BookCardCategoryShimmerEffectReview(){
    EBookTheme {
        BookCardCategoryShimmerEffect()
    }
}
