package com.plcoding.e_book.presentation.book

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.ui.theme.GrayText
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import com.plcoding.e_book.ui.theme.SecondaryKeyColor
import com.plcoding.e_book.domain.model.Books.Result

@Composable
fun PaidBookDetailsScreen(result: Result,
                          event: (DetailsEvent) -> Unit,
                          navigateUp: ()-> Unit,

) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        DetailsTopbar(
            onShareClick = {
                Intent(Intent.ACTION_SEND).also {
                    it.putExtra(Intent.EXTRA_TEXT, result.createBy)
                    it.type = "text/plain"
                    if(it.resolveActivity(context.packageManager) != null){

                        context.startActivity(it)
                    }
                }
            },
            onBookMarkClick = {
                event(DetailsEvent.UpsertDeleteBooks(result)) },
            onBackClick = navigateUp,

            )
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(
                start = Dimens.MediumPadding1,
                top = Dimens.MediumPadding1,
                end = Dimens.MediumPadding1
            )
        ) {
            item {
                Row (modifier = Modifier.fillMaxWidth()){
                    Column(modifier = Modifier
                        .weight(1f)
                        .padding(Dimens.ExtraSmallPadding2),
                        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        AsyncImage(model = ImageRequest.Builder(context=context).data(result.createBy).build(),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(Dimens.ThumbnailTemplate)
                                .clip(MaterialTheme.shapes.medium),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(Dimens.ExtraSmallPadding2))

                        AsyncImage(model = ImageRequest.Builder(context=context).data(result.createBy).build(),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(Dimens.ThumbnailTemplate)
                                .clip(MaterialTheme.shapes.medium),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Spacer(modifier = Modifier.width(Dimens.ExtraSmallPadding2))

                    Box(modifier = Modifier.weight(1f)){
                        AsyncImage(model = ImageRequest.Builder(context=context).data(result.createBy).build(),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(Dimens.BookImageSize)
                                .clip(MaterialTheme.shapes.medium),
                            contentScale = ContentScale.Crop
                        )
                    }
                }

                Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(size = Dimens.IndicatorSize)
                    )){
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .background(SecondaryKeyColor)
                        .padding(Dimens.SmallIconSize))
                    {
                        Column(modifier = Modifier


                        ){

                            Text(text = result.title,
                                style = MaterialTheme.typography.bodySmall,
                                color = PrimaryKeyColor,
                                fontWeight = FontWeight.Light,
                                fontSize = Dimens.BookName,
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.padding(start = Dimens.IndicatorSize, top =  Dimens.IndicatorSize)

                            )
                            Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = Dimens.MediumPadding2)) {
                                Column (modifier = Modifier.weight(1f),verticalArrangement = Arrangement.Center){
                                    Text(text = "Tác giả",
                                        color = GrayText,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = Dimens.NormalText
                                    )
                                    Spacer(modifier = Modifier.height(Dimens.ExtraSmallPadding))

                                    Text(text = buildString {
                                        for (author in result.authors) {
                                            append("${author?.author_name}")
                                        }},
                                        style = MaterialTheme.typography.bodySmall,
                                        color = PrimaryKeyColor,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    )
                                    Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

                                    Text(text = "Nhà xuất bản",
                                        color = GrayText,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = Dimens.NormalText
                                    )
                                    Spacer(modifier = Modifier.height(Dimens.ExtraSmallPadding))

                                    result.publisher?.let {
                                        Text(text = it.publisher_name,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = PrimaryKeyColor,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                        )
                                    }
                                }
                                Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
                                    Text(text = "Thể loại",
                                        color = GrayText,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = Dimens.NormalText
                                    )
                                    Spacer(modifier = Modifier.height(Dimens.ExtraSmallPadding))

                                    Text(text =buildString {
                                        for (gallery in result.galleryManage) {
                                            if (gallery != null) {
                                                append("${gallery.description}")
                                            }
                                        }},
                                        style = MaterialTheme.typography.bodySmall,
                                        color = PrimaryKeyColor,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    )
                                    Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

                                    Text(text = "Ngôn ngữ",
                                        color = GrayText,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = Dimens.NormalText
                                    )
                                    Spacer(modifier = Modifier.height(Dimens.ExtraSmallPadding))

                                    result.language?.let {
                                        Text(text = it.language_name,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = PrimaryKeyColor,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                        )
                                    }
                                }

                            }
                            Spacer(modifier = Modifier.height(Dimens.MediumPadding1))


                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically) {
                                Button(onClick = {},
                                    Modifier
                                        .padding(Dimens.ExtraSmallPadding2),
                                    colors = ButtonDefaults.buttonColors(PrimaryKeyColor)) {

                                    Text(text = "Đọc từ đầu",
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White,
                                        modifier = Modifier.padding(Dimens.ExtraSmallPadding2)
                                    )
                                }
                                Button(onClick = {},
                                    Modifier
                                        .padding(Dimens.ExtraSmallPadding2),
                                    colors = ButtonDefaults.buttonColors(PrimaryKeyColor)) {

                                    Text(text = "Đọc tiếp",
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White,
                                        modifier = Modifier.padding(Dimens.ExtraSmallPadding2)
                                    )
                                }
                            }

                        }
                    }
                }
                Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

                Row (horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Top, modifier = Modifier.fillMaxWidth()){

                    Column(modifier = Modifier
                        .height(50.dp)
                        .padding(end = 10.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically){
                            Text(text = "${result.hot.toFloat()}")
                            Spacer(modifier = Modifier.width(Dimens.ExtraSmallPadding2))

                            RatingBar(rating = result.hot.toFloat(), spaceBetween = 3.dp)

                            Spacer(modifier = Modifier.width(Dimens.ExtraSmallPadding2))


                            Text(text = "/ ${result.hot} Lượt đánh giá",color = GrayText, fontSize = Dimens.SmallText)


                        }


                    }


                }


                Text(text = "Thông tin chi tiết ",color = PrimaryKeyColor,fontWeight = FontWeight.Bold, fontSize = Dimens.MediumText )
                Spacer(modifier = Modifier.height(Dimens.IndicatorSize),)



                Row{
                    Text(text = "Nhà xuất bản:",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryKeyColor
                    )
                    Spacer(modifier = Modifier.width(Dimens.SmallIconSize))

                    result.provider?.let {
                        Text(text = it.providername,
                            style = MaterialTheme.typography.bodySmall,
                            color = PrimaryKeyColor
                        )
                    }
                }

                Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

                Row{
                    Text(text = "Ngày xuất bản:",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryKeyColor
                    )
                    Spacer(modifier = Modifier.width(Dimens.SmallIconSize))

                    Text(text = "${convertToDayMonthYear(result.publication_date)}",
                        style = MaterialTheme.typography.bodySmall,
                        color = PrimaryKeyColor
                    )
                }

                Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

                Row{
                    Text(text = "Số trang:",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryKeyColor
                    )
                    Spacer(modifier = Modifier.width(Dimens.SmallIconSize))

                    Text(text = "${result.num_pages} trang",
                        style = MaterialTheme.typography.bodySmall,
                        color = PrimaryKeyColor
                    )
                }

                Spacer(modifier = Modifier.height(Dimens.IndicatorSize))
                Text(
                    buildAnnotatedString {

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Trích dẫn: ")
                        }
                        Spacer(modifier = Modifier.width(Dimens.SmallIconSize))

                        append(result.description)

                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = PrimaryKeyColor,
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

//
//
            }

        }
    }
}

@Composable
private fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Float,
    spaceBetween: Dp = 0.dp
) {

    val image = ImageBitmap.imageResource(id = R.drawable.star)
    val imageFull = ImageBitmap.imageResource(id = R.drawable.starfull)

    val totalCount = 5

    val height = LocalDensity.current.run { image.height.toDp() }
    val width = LocalDensity.current.run { image.width.toDp() }
    val space = LocalDensity.current.run { spaceBetween.toPx() }
    val totalWidth = width * totalCount + spaceBetween * (totalCount - 1)


    Box(
        modifier
            .width(totalWidth)
            .height(height)
            .drawBehind {
                drawRating(rating, image, imageFull, space)
            })
}

private fun DrawScope.drawRating(
    rating: Float,
    image: ImageBitmap,
    imageFull: ImageBitmap,
    space: Float
) {

    val totalCount = 5

    val imageWidth = image.width.toFloat()
    val imageHeight = size.height

    val reminder = rating - rating.toInt()
    val ratingInt = (rating - reminder).toInt()

    for (i in 0 until totalCount) {

        val start = imageWidth * i + space * i

        drawImage(
            image = image,
            topLeft = Offset(start, 0f)
        )
    }

    drawWithLayer {
        for (i in 0 until totalCount) {
            val start = imageWidth * i + space * i
            // Destination
            drawImage(
                image = imageFull,
                topLeft = Offset(start, 0f)
            )
        }

        val end = imageWidth * totalCount + space * (totalCount - 1)
        val start = rating * imageWidth + ratingInt * space
        val size = end - start

        // Source
        drawRect(
            Color.Transparent,
            topLeft = Offset(start, 0f),
            size = Size(size, height = imageHeight),
            blendMode = BlendMode.SrcIn
        )
    }
}

private fun DrawScope.drawWithLayer(block: DrawScope.() -> Unit) {
    with(drawContext.canvas.nativeCanvas) {
        val checkPoint = saveLayer(null, null)
        block()
        restoreToCount(checkPoint)
    }
}

