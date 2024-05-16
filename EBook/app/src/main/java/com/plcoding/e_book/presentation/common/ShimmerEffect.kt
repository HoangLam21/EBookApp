package com.plcoding.e_book.presentation.common

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    this.then(background(color = colorResource(id = R.color.teal_700).copy(alpha = alpha)))
}


@Composable
fun YouMayLikeCardShimmerEffect(
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier.height(330.dp)
        .width(185.dp)
        , verticalArrangement = Arrangement.Center) {
        Box(
            modifier = Modifier
                .height(250.dp)
                .width(170.dp)
                .clip(MaterialTheme.shapes.medium)
                .shimmerEffect()
        )
        Spacer(modifier = Modifier.padding(Dimens.ExtraSmallPadding2))
        Box(
            modifier = Modifier
                .width(130.dp)
                .height(20.dp)
                .clip(MaterialTheme.shapes.medium)
                .shimmerEffect()
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ViewUnpaidBScreen() {
    EBookTheme(dynamicColor = false) {
        YouMayLikeCardShimmerEffect()
    }
}
