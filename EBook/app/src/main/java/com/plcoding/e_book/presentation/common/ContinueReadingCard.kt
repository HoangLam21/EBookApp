package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.presentation.book.Base64ImageList

@Composable
fun ContinueReadingCard(book: com.plcoding.e_book.domain.model.Books.Result,
                        onClick:()->Unit){
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .width(235.dp)
            .height(150.dp)
            .zIndex(1f)

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
                .clickable { onClick() }
                .border(
                    width = 1.dp,
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = RoundedCornerShape(10.dp)
                )
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(10.dp),
                    clip = true
                )
                .background(
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = RoundedCornerShape(10.dp)
                )

            )
        }
        Row {
            Box(modifier = Modifier
                .fillMaxWidth(0.35f)
                .fillMaxHeight()
                .padding(start = 10.dp)
            ){
                Base64ImageList(
                    galleryManageList = book.galleryManage.filterNotNull(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens.ThumbnailTemplate)
                        .clip(MaterialTheme.shapes.medium),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
            }
            Column {
                Text(
                    text = book.title,
                    fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                    color = Color(android.graphics.Color.parseColor("#513820")),
                    modifier = Modifier
                        .padding(start = 10.dp, top =45.dp)
                        .width(150.dp),
                    fontSize = 16.sp, maxLines = 1,overflow = TextOverflow.Ellipsis
                )
                AuthorsText(authors = book.authors)
            }

        }


    }


}
//@Preview(showBackground = true)
//@Composable
//fun ContinueReadingCardPreview(){
//    EBookTheme{
//        ContinueReadingCard(book = Result(
//            authors = listOf(
//                Author(
//                    author_name = "Author Name 1",
//                    createAt = "",
//                    createBy = "",
//                    id = 0,
//                    updateAt = "",
//                    updateBy = ""
//                ),
//                Author(
//                    author_name = "Author Name 1",
//                    createAt = "",
//                    createBy = "",
//                    id = 1,
//                    updateAt = "",
//                    updateBy = ""
//                ),
//            ),
//            available = 0,
//            bookQuantity = 0.0,
//            category =  Category(
//                avatar = "",
//                createAt = "",
//                createBy = "",
//                hot = 0,
//                id=0,
//                name="Truyen",
//                updateAt = "",
//                updateBy = "",
//            ), // Assuming category is not provided in the given data
//            createAt = "",
//            createBy = "",
//            description = "",
//            discount = 0,
//            feedback = Feedback(
//                createAt = "",
//                createBy = "",
//                feedback_comment="",
//                id=0,
//                rating = 1,
//                updateBy = "",
//                updateAt = "",
//            ), // Assuming feedback is not provided in the given data
//            galleryManage = listOf(
//                GalleryManage(
//                    createBy = "",
//                    createAt = "",
//                    description = "",
//                    id = 0,
//                    thumbnail = "",
//                    updateAt = "",
//                    updateBy = "",
//                ),
//            ),
//            hot = 0,
//            id = 0,
//            isebook = false,
//            isvip = false,
//            language = Language(
//                createAt = "",
//                createBy = "",
//                id = 0,
//                language_name = "",
//                updateAt = "",
//                updateBy = ""
//            ),
//            num_pages = 0,
//            price = 0,
//            provider = Provider(
//                address = "",
//                createAt = "",
//                createBy = "",
//                id = 0,
//                providername = "",
//                representativename = "",
//                updateAt = "",
//                updateBy = ""
//            ),
//            publication_date = "",
//            publisher = Publisher(
//                createAt = "",
//                createBy = "",
//                id = 0,
//                publisher_name = "",
//                updateAt = "",
//                updateBy = ""
//            ),
//            readingsession = 0,
//            title = "LittleWomen",
//            total_pay = 1,
//            updateAt = "",
//            updateBy = ""
//        )
//        ) {
//
//        }
//    }
//}