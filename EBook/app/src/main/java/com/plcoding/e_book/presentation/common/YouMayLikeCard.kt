package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import androidx.compose.ui.Modifier
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Result


@Composable
fun YouMayLikeCard(
   modifier: Modifier = Modifier,
    result: Result,
    onClick:()-> Unit
) {
    val context = LocalContext.current

    Column(
        modifier = modifier
            .clickable { onClick() }
            .height(330.dp)
            .width(Dimens.YouMaylikeCardSize),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        val imageRequest = if (result.galleryManage.isNotEmpty()) {
            ImageRequest.Builder(context).data(buildList<String> {
                for (gallery in result.galleryManage) {
                    if (gallery != null) {
                        add(gallery.thumbnail)
                    }
                }
            }.firstOrNull()).build()
        } else {
            // Nếu không có dữ liệu, sử dụng hình mặc định tại đây
            // Ví dụ: R.drawable.default_image
            ImageRequest.Builder(context).data(R.drawable.default_img).build()
        }
        AsyncImage(
            modifier = Modifier
                .width(160.dp)
                .height(250.dp)
                .clip(MaterialTheme.shapes.medium)
                .padding(top = Dimens.SmallIconSize),
            model = imageRequest,
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )



        Spacer(modifier = Modifier.padding(Dimens.ExtraSmallPadding2))
        Text(
            text = buildString {
                for (author in result.authors) {
                    if (author != null) {
                        append( "${result.title} " + " - " + "${author.author_name}")
                    } // Hiển thị tên của mỗi tác giả, có thể chỉnh sửa cách hiển thị tùy theo yêu cầu của bạn
                }
            },
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Medium),
            color = PrimaryKeyColor,

            modifier=Modifier.width(160.dp),
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun ViewyMLCard() {
//
//    EBookTheme {
//        YouMayLikeCard(
//            result = Result(
//                id =1,
//                title= "Lam Ban Voi Bau Troi",
//                num_pages= 100,
//                publication_date= "2024-05-15T12:40:57.775+00:00",
//                bookQuantity = 50,
//                price= 90000,
//                discount = 5000, // Sửa thành dấu '=' thay vì ':'
//                description= "string",
//                hot= 5,
//                total_pay= 85000,
//                available= 1,
//                createAt= "2024-05-15T12:41:41.543+00:00",
//                updateAt= "2024-05-15T12:41:41.543+00:00",
//                createBy = "https://i.pinimg.com/564x/e8/70/13/e87013a8fad26985bdaf8c072f126418.jpg",
//                updateBy= "admin",
//                authors= listOf(
//                    Author(
//                        createAt= "2024-05-15T12:28:20.477+00:00",
//                        updateAt= "2024-05-15T12:28:20.477+00:00",
//                        createBy= "admin",
//                        updateBy= "admin",
//                        id= 1,
//                        author_name= "Nguyen Nhat Anh"
//                    )
//                ),
//                publisher= Publisher(
//                    createAt= "2024-05-15T12:35:45.549+00:00",
//                    updateAt= "2024-05-15T12:35:45.549+00:00",
//                    createBy= "admin",
//                    updateBy= "admin",
//                    id= 1,
//                    publisher_name= "NXB Tuoi Tre"
//                ),
//                language= Language(
//                    createAt= "2024-05-15T12:30:01.647+00:00",
//                    updateAt= "2024-05-15T12:30:01.647+00:00",
//                    createBy= "admin",
//                    updateBy= "admin",
//                    id = 1, // Sửa thành dấu '=' thay vì ':'
//                    language_name= "Tieng Viet"
//                ),
//                galleryManage= listOf(
//                    Gallery(
//                        book_id = 1,
//                        thumbnail = "https://i.pinimg.com/564x/e8/70/13/e87013a8fad26985bdaf8c072f126418.jpg",
//                        description = "Tải Ebook Làm Bạn Với Bầu Trời PDF. Download ngay! Mua sách gốc tại đây. Một câu chuyện giản dị, chứa đầy bất ngờ cho tới trang cuối cùng. Và đẹp lộng lẫy, vì lòng vị tha và tình yêu thương, khiến mắt rưng rưng vì một nỗi mừng vui hân hoan. Cuốn sách như một đốm lửa thắp lên lòng khát khao sống tốt trên đời. Viết về điều tốt đã không dễ, viết sao cho người đọc có thể đón nhận đầy cảm xúc tích cực, và muốn được hưởng, được làm những điều tốt dù nhỏ bé mới thật là khó. Làm bạn với bầu trời của"
//                    ),
//
//
//                ),
//                provider = Provider(
//                    createAt= "2024-05-15T12:34:07.484+00:00",
//                    updateAt= "2024-05-15T12:34:07.484+00:00",
//                    createBy= "admin",
//                    updateBy= "admin",
//                    id= 1,
//                    providername= "Cong ty TNHH Tien Phong",
//                    address= "44, Hoang Mai, Hoang Kiem, Ha Noi",
//                    representativename= "Nguyen Tan Duc"
//                ),
//            ),
//            onClick = {}
//        )
//    }
//}