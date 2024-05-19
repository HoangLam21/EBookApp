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
import com.plcoding.e_book.domain.model.Books.Category
import com.plcoding.e_book.domain.model.Books.Feedback
import com.plcoding.e_book.domain.model.Books.GalleryManage
import com.plcoding.e_book.domain.model.Books.Language
import com.plcoding.e_book.domain.model.Books.Provider
import com.plcoding.e_book.domain.model.Books.Publisher
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.ui.theme.EBookTheme

@Composable
fun AuthorsText(authors: List<Author?>) {
    val authorsString = authors.joinToString(separator = ", ") { it?.author_name ?: "" }

    Text(
        fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
        text = authorsString,
        color = Color(android.graphics.Color.parseColor("#7d6a58")),
        modifier = Modifier
            .padding(start = 5.dp)
            .fillMaxWidth(),
        fontSize = 14.sp
    )
}
@Composable
fun BookCardCategory(
    book: com.plcoding.e_book.domain.model.Books.Result,
    onClick:()->Unit){
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(130.dp)
            .padding(end = 10.dp)
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
        Row{
            Box(modifier= Modifier
                .height(160.dp)
                .fillMaxWidth(0.3f)
                .clip(
                    MaterialTheme.shapes.medium
                )){
                Image(painter = painterResource(id = R.drawable.little_women_vintage_classics_1_2018_11_20_22_04_53), contentDescription = null,
                    modifier = Modifier
                        .height(120.dp)
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
                Text(
                    text = book.title,
                    fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                    color = Color(android.graphics.Color.parseColor("#513820")),
                    modifier = Modifier
                        .padding(start = 5.dp)

                        .fillMaxWidth(),
                    fontSize = 19.sp, maxLines = 1,overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(2.dp))
                AuthorsText(authors = book.authors)
                Spacer(modifier = Modifier.height(2.dp))


                Row {
                    Text(
                        text = book.price.toString()+"đ",
                        fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                        color = Color(android.graphics.Color.parseColor("#513820")),
                        modifier = Modifier
                            .padding(end = 5.dp, start=5.dp),
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.width(115.dp))
                    Text(
                        text = "98 reads",
                        fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                        color = Color(android.graphics.Color.parseColor("#513820")),
                        modifier = Modifier
                            .padding(end = 5.dp),
                        fontSize = 15.sp
                    )

                }


                Spacer(modifier = Modifier.height(2.dp))
                Row {

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(android.graphics.Color.parseColor("#513820"))
                        ), modifier = Modifier
                            .height(45.dp)
                            .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp)
                            .fillMaxWidth(1f)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth(1f)
                            .padding(start = 70.dp)){
                            Text(
                                text = "Mua ngay",
                                fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                modifier = Modifier
                                    .fillMaxWidth(0.9f),
                                fontSize = 13.sp

                            )

                        }


                    }

                }

                Spacer(modifier = Modifier.height(3.dp))
            }

        }



    }
}
@Preview(showBackground = true)
@Composable
fun BookCardCategoryPreview(){
    EBookTheme{
        BookCardCategory(
            book = Result(
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
            )
        ) {

        }
    }
}