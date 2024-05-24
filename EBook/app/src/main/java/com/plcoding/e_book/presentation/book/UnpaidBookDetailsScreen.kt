package com.plcoding.e_book.presentation.book

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Base64
import androidx.compose.foundation.Image
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.Dimens.MediumText
import com.plcoding.e_book.Dimens.SmallIconSize
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Feedback
import com.plcoding.e_book.domain.model.Books.GalleryManage
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.common.BooksList
import com.plcoding.e_book.ui.theme.GrayText
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import com.plcoding.e_book.ui.theme.SecondaryKeyColor
import java.text.SimpleDateFormat

@Composable
fun Base64Image(
    base64String: String,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.Crop
) {
    val decodedBytes = Base64.decode(base64String, Base64.DEFAULT)
    val bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
    bitmap?.let {
        Image(
            bitmap = it.asImageBitmap(),
            contentDescription = contentDescription,
            modifier = modifier,
            contentScale = contentScale
        )
    }
}
@Composable
fun Base64ImageList(
    galleryManageList: List<GalleryManage?>,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.Crop
) {
    Column(modifier = modifier) {
        if (galleryManageList.size >= 3) {
            val galleryManage1 = galleryManageList[0]
            val galleryManage2 = galleryManageList[1]
            val galleryManage3 = galleryManageList[2]

            Row(modifier = Modifier.fillMaxWidth()) {
                if (galleryManage1 != null) {
                    Base64Image(
                        base64String = galleryManage1.thumbnail,

                        )
                }

                if (galleryManage2 != null) {
                    Base64Image(
                        base64String = galleryManage2.thumbnail,

                        )
                }

                if (galleryManage3 != null) {
                    Base64Image(
                        base64String = galleryManage3.thumbnail,

                        )
                }
            }
        } else {
            if (galleryManageList.isNotEmpty()) {
                val galleryManage = galleryManageList[0]
                if (galleryManage != null) {
                    Base64Image(
                        base64String = galleryManage.thumbnail,
                        modifier = Modifier
                            .fillMaxWidth(),
                        //.padding(Dimens.ExtraSmallPadding2),
                        contentDescription = contentDescription,
                        contentScale = contentScale
                    )
                }
            }
        }
    }
}


@Composable
fun UnpaidBookDetailsScreen(
    result: Result,
    event: (DetailsEvent) -> Unit,
    navigateUp: ()-> Unit,
    resultitem: LazyPagingItems<Result>,
    navigateToDetail: (Result) -> Unit,
    navigateUpgrade: ()->Unit

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


                Row (modifier = Modifier.fillMaxWidth().height(300.dp), verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center){
                    Row(modifier = Modifier.height(300.dp)) {
                        Base64ImageList(
                            galleryManageList = result.galleryManage,
                            //modifier = Modifier.height(300.dp),
                            contentDescription = null,
                            contentScale = ContentScale.FillHeight
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
                        .padding(SmallIconSize))
                    {
                        Column(modifier = Modifier


                        ){

                            Text(text = result.title,
                                style = MaterialTheme.typography.bodySmall,
                                color = PrimaryKeyColor,
                                fontWeight = FontWeight.Medium,
                                fontSize = Dimens.BookName,
                                maxLines = 2,
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

                                    Text(text = "kinh di",
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



                            Button(onClick = navigateUpgrade,
                                Modifier
                                    .fillMaxWidth()
                                    .padding(Dimens.ExtraSmallPadding2),
                                colors = ButtonDefaults.buttonColors(PrimaryKeyColor)) {

                                Text(text = "Mua VIP",
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(Dimens.MediumPadding1))


                Row (horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Top, modifier = Modifier.fillMaxWidth()) {

                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .padding(end = 10.dp)
                    ) {
                        Row (horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Top, modifier = Modifier.fillMaxWidth()){

                            Column(modifier = Modifier
                                .height(50.dp)
                                .padding(end = 10.dp)) {
                                Row(verticalAlignment = Alignment.CenterVertically){

                                    Text(text =  "1.0")
                                    Spacer(modifier = Modifier.width(Dimens.ExtraSmallPadding2))

                                    RatingBar(rating = result.hot.toFloat(), spaceBetween = 3.dp)

                                    Spacer(modifier = Modifier.width(Dimens.ExtraSmallPadding2))


                                    Text(text =" 1 Lượt đánh giá",
                                        color = GrayText, fontSize = Dimens.SmallText)


                                }


                            }


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


                Text(text = "Có thể bạn sẽ thích: ",
                    style = MaterialTheme.typography.bodyMedium,
                    color = PrimaryKeyColor,
                    fontWeight = FontWeight.Bold,
                    fontSize =MediumText
                )

                Spacer(modifier = Modifier.height(Dimens.IndicatorSize))

                BooksList(

                    resultitem = resultitem,
                    onClick = {
                        navigateToDetail(it)
                    }
                )



            }

        }
    }
}

fun calculateAverageRating(feedbackList: List<Feedback?>): Double {
    val totalRating = feedbackList.filterNotNull().sumOf { it.rating }
    val numberOfRatings = feedbackList.filterNotNull().size
    return if (numberOfRatings > 0) {
        totalRating.toDouble() / numberOfRatings
    } else {
        0.0 // Nếu không có đánh giá nào, trả về 0
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

fun convertToDayMonthYear(dateString: String): String {
    val originalFormat = SimpleDateFormat("yyyy-MM-dd")

    // Định dạng của ngày tháng chỉ có ngày, tháng, năm
    val targetFormat = SimpleDateFormat("dd/MM/yyyy")

    val date = originalFormat.parse(dateString)

    return targetFormat.format(date)
}



//
//@Preview(showBackground = true)
//@Composable
//fun ViewUnpaidBScreen() {
//    UnpaidBookDetailsScreen(result = Result(
//        id =1,
//        title= "Lam Ban Voi Bau Troi",
//        num_pages= 100,
//        publication_date= "2024-05-15T12:40:57.775+00:00",
//        bookQuantity = 50,
//        price= 90000,
//        discount = 5000, // Sửa thành dấu '=' thay vì ':'
//        description = "Tải Ebook Làm Bạn Với Bầu Trời PDF. Download ngay! Mua sách gốc tại đây. Một câu chuyện giản dị, chứa đầy bất ngờ cho tới trang cuối cùng. Và đẹp lộng lẫy, vì lòng vị tha và tình yêu thương, khiến mắt rưng rưng vì một nỗi mừng vui hân hoan. Cuốn sách như một đốm lửa thắp lên lòng khát khao sống tốt trên đời. Viết về điều tốt đã không dễ, viết sao cho người đọc có thể đón nhận đầy cảm xúc tích cực, và muốn được hưởng, được làm những điều tốt dù nhỏ bé mới thật là khó. Làm bạn với bầu trời của"
//        ,
//        hot= 5,
//        total_pay= 85000,
//        available= 1,
//        createAt= "2024-05-15T12:41:41.543+00:00",
//        updateAt= "2024-05-15T12:41:41.543+00:00",
//        createBy = "https://i.pinimg.com/564x/e8/70/13/e87013a8fad26985bdaf8c072f126418.jpg",
//        updateBy= "admin",
//        authors= listOf(
//            Author(
//                createAt= "2024-05-15T12:28:20.477+00:00",
//                updateAt= "2024-05-15T12:28:20.477+00:00",
//                createBy= "admin",
//                updateBy= "admin",
//                id= 1,
//                author_name= "Nguyen Nhat Anh"
//            )
//        ),
//        publisher= Publisher(
//            createAt= "2024-05-15T12:35:45.549+00:00",
//            updateAt= "2024-05-15T12:35:45.549+00:00",
//            createBy= "admin",
//            updateBy= "admin",
//            id= 1,
//            publisher_name= "NXB Tuoi Tre"
//        ),
//        language= Language(
//            createAt= "2024-05-15T12:30:01.647+00:00",
//            updateAt= "2024-05-15T12:30:01.647+00:00",
//            createBy= "admin",
//            updateBy= "admin",
//            id = 1, // Sửa thành dấu '=' thay vì ':'
//            language_name= "Tieng Viet"
//        ),
//        galleryManage= listOf(
//            Gallery(
//                book_id = 1,
//                thumbnail = "https://i.pinimg.com/564x/e8/70/13/e87013a8fad26985bdaf8c072f126418.jpg",
//                description = "Tiểu thuyết"
//            ),
//
//
//            ),
//        provider = Provider(
//            createAt= "2024-05-15T12:34:07.484+00:00",
//            updateAt= "2024-05-15T12:34:07.484+00:00",
//            createBy= "admin",
//            updateBy= "admin",
//            id= 1,
//            providername= "Cong ty TNHH Tien Phong",
//            address= "44, Hoang Mai, Hoang Kiem, Ha Noi",
//            representativename= "Nguyen Tan Duc"
//        ),
//    ),
//        event = {},
//        navigateUp = { /*TODO*/ },
////        resultitem = {}
//    )
//}