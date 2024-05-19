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
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Author
import com.plcoding.e_book.domain.model.Books.Category
import com.plcoding.e_book.domain.model.Books.Feedback
import com.plcoding.e_book.domain.model.Books.GalleryManage
import com.plcoding.e_book.domain.model.Books.Language
import com.plcoding.e_book.domain.model.Books.Provider
import com.plcoding.e_book.domain.model.Books.Publisher
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.ui.theme.EBookTheme

@Composable
fun YouMayLikeCard(
   modifier: Modifier = Modifier,
    result: com.plcoding.e_book.domain.model.Books.Result,
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


@Preview(showBackground = true)
@Composable
fun ViewyMLCard() {

    EBookTheme {
        YouMayLikeCard(
            result = Result(
                authors = listOf(
                    Author(
                        author_name = "Author Name 1",
                        createAt = "",
                        createBy = "",
                        id = 0,
                        updateAt = "",
                        updateBy = ""
                    ),
                    Author(
                        author_name = "Author Name 1",
                        createAt = "",
                        createBy = "",
                        id = 1,
                        updateAt = "",
                        updateBy = ""
                    ),
                ),
                available = 0,
                bookQuantity = 0.0,
                category =  Category(
                    avatar = "",
                    createAt = "",
                    createBy = "",
                    hot = 0,
                    id=0,
                    name="Truyen",
                    updateAt = "",
                    updateBy = "",
                ), // Assuming category is not provided in the given data
                createAt = "",
                createBy = "",
                description = "",
                discount = 0,
                feedback = Feedback(
                    createAt = "",
                    createBy = "",
                    feedback_comment="",
                    id=0,
                    rating = 1,
                    updateBy = "",
                    updateAt = "",
                ), // Assuming feedback is not provided in the given data
                galleryManage = listOf(
                    GalleryManage(
                        createBy = "",
                        createAt = "",
                        description = "",
                        id = 0,
                        thumbnail = "",
                        updateAt = "",
                        updateBy = "",
                    ),
                ),
                hot = 0,
                id = 0,
                isebook = false,
                isvip = false,
                language = Language(
                    createAt = "",
                    createBy = "",
                    id = 0,
                    language_name = "",
                    updateAt = "",
                    updateBy = ""
                ),
                num_pages = 0,
                price = 0,
                provider = Provider(
                    address = "",
                    createAt = "",
                    createBy = "",
                    id = 0,
                    providername = "",
                    representativename = "",
                    updateAt = "",
                    updateBy = ""
                ),
                publication_date = "",
                publisher = Publisher(
                    createAt = "",
                    createBy = "",
                    id = 0,
                    publisher_name = "",
                    updateAt = "",
                    updateBy = ""
                ),
                readingsession = 0,
                title = "LittleWomen",
                total_pay = 1,
                updateAt = "",
                updateBy = ""
            ),
            onClick = {}
        )
    }
}