package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Author
import com.plcoding.e_book.domain.model.Books.Gallery
import com.plcoding.e_book.domain.model.Books.Language
import com.plcoding.e_book.domain.model.Books.Provider
import com.plcoding.e_book.domain.model.Books.Publisher
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.ui.theme.EBookTheme

@Composable
fun BookCard(book: com.plcoding.e_book.domain.model.Books.Result,
             onClick:()->Unit){
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .width(160.dp)
            .clickable { onClick() }
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
        Column(modifier = Modifier.width(160.dp)) {
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(160.dp)
                    .align(Alignment.CenterHorizontally),
            ) {
                Box(modifier= Modifier
                    .height(160.dp)
                    .fillMaxWidth()
                    .clip(
                        MaterialTheme.shapes.medium
                    )){
                    Image(painter = painterResource(id = R.drawable.little_women_vintage_classics_1_2018_11_20_22_04_53), contentDescription = null,
                        modifier = Modifier
                            .height(160.dp)
                            .align(Alignment.Center)
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

            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = book.title,
                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .padding(start = 5.dp)

                    .width(150.dp),
                fontSize = 14.sp, maxLines = 1,overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                text = book.createAt,
                color = Color(android.graphics.Color.parseColor("#7d6a58")),
                modifier = Modifier
                    .padding(start = 5.dp),
                fontSize = 10.sp
            )
            Spacer(modifier = Modifier.height(5.dp))



            Text(
                text = "98 reads",
                fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 5.dp),
                fontSize = 15.sp// Căn trái
            )
            Spacer(modifier = Modifier.height(5.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(android.graphics.Color.parseColor("#513820"))
                ), modifier = Modifier
                    .height(45.dp)
                    .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp)
                    .width(150.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Upgrade now",
                    fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                    color = Color(android.graphics.Color.parseColor("#ffffff")),
                    modifier = Modifier
                        .width(70.dp),
                    fontSize = 13.sp

                )

            }
            Spacer(modifier = Modifier.height(3.dp))
        }


    }
}
@Preview(showBackground = true)
@Composable
fun BookCardPreview(){
    EBookTheme{
        BookCard(book = Result(
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
            bookQuantity = 0,
            createAt = "",
            createBy = "",
            description = "",
            discount = 0,
            galleryManage = listOf(
                Gallery(
                    book_id = 1,
                    thumbnail = "https://i.pinimg.com/564x/e8/70/13/e87013a8fad26985bdaf8c072f126418.jpg",
                    description = "Tải Ebook Làm Bạn Với Bầu Trời PDF. Download ngay! Mua sách gốc tại đây. Một câu chuyện giản dị, chứa đầy bất ngờ cho tới trang cuối cùng. Và đẹp lộng lẫy, vì lòng vị tha và tình yêu thương, khiến mắt rưng rưng vì một nỗi mừng vui hân hoan. Cuốn sách như một đốm lửa thắp lên lòng khát khao sống tốt trên đời. Viết về điều tốt đã không dễ, viết sao cho người đọc có thể đón nhận đầy cảm xúc tích cực, và muốn được hưởng, được làm những điều tốt dù nhỏ bé mới thật là khó. Làm bạn với bầu trời của"
                ),
            ),
            hot = 0,
            id = 0,
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
            title = "LittleWomen",
            total_pay = 1,
            updateAt = "",
            updateBy = ""
        )
        ) {

        }
    }
}

