package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.presentation.book.Base64ImageList

@Composable
fun BookCard(book: com.plcoding.e_book.domain.model.Books.Result,
             onClick:()->Unit){
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .width(190.dp)
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

    ) {
        Column(modifier = Modifier.width(190.dp)) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(190.dp)
                    .align(Alignment.CenterHorizontally),
            ) {
                Box(modifier= Modifier
                    .height(160.dp)
                    .fillMaxWidth()
                    .clip(
                        MaterialTheme.shapes.medium
                    )){
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

            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = book.title,
                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .padding(start = 10.dp)

                    .width(175.dp).height(50.dp),
                fontSize = 19.sp, maxLines = 2,overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(5.dp))
            AuthorsText(authors = book.authors)
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "98 reads",
                fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .padding(start = 10.dp),
                fontSize = 15.sp
            )

            Text(
                text = book.price.toString()+ "đ",
                fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .padding(end = 5.dp).align(Alignment.End),
                fontSize = 18.sp
            )




            Spacer(modifier = Modifier.height(5.dp))
        }


    }
}
//@Preview(showBackground = true)
//@Composable
//fun BookCardPreview(){
//    EBookTheme{
//        BookCard(book = Result(
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
//                   createBy = "",
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
//
