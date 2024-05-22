package com.plcoding.e_book.presentation.reading

import android.app.Application
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.Dimens.IconSize
import com.plcoding.e_book.ui.theme.EBookTheme
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import kotlinx.coroutines.launch


val chaptersData = listOf(
    Chapter(1,"KHÁM PHÁ NHIỀU ĐIỀU", "  Chúng tôi đi xuống phố, tay trong tay, chẳng có gì phải vội. Totoca " +
            "đang dạy tôi về cuộc sống. Và điều đó khiến tôi thực sự hạnh phúc, được anh " +
            "trai nắm tay và dạy nhiều điều. Nhưng là dạy về những điều thuộc thế giới " +
            "bên ngoài. Bởi vì ở nhà, tôi học hỏi bằng cách tự mày mò khám phá và tự " +
            "làm, tôi mắc lỗi nhiều và vì mắc lỗi, tôi thường bị ăn đòn. Cho tới tận trước " +
            "đây không lâu, tôi vẫn chưa bị ai đánh bao giờ. Nhưng rồi mọi người nghe " +
            "được chuyện này, chuyện nọ và bắt đầu nói tôi là quỷ, là quái vật, là tiểu yêu " +
            "tóc hung. Tôi không muốn biết về điều đó. Nếu không phải đang ở bên ngoài " +
            "thì tôi đã bắt đầu hát. Hát thú vị lắm. Ngoài ca hát, Totoca còn biết làm điều " +
            "khác nữa: anh có thể huýt sáo. Nhưng dù cố gắng đến mức nào tôi cũng " +
            "chẳng thể bắt chước anh huýt sáo được, chẳng âm thanh nào bật ra cả. Để an " +
            "ủi tôi, anh bảo chuyện đó cũng bình thường thôi, rằng tôi chưa có cái miệng " +
            "của người huýt sáo. Nhưng vì không thể hát thành lời, tôi hát thầm ở trong " +
            "lòng. Thoạt đầu điều đó thật kỳ cục, nhưng về sau tôi cảm thấy hát như thế " +
            "thực sự thú vị. Và lúc này, tôi đang nhớ lại một bài hát mẹ thường hát khi tôi " +
            "còn bé xíu. Mẹ đứng bên chậu giặt, mảnh khăn buộc quanh đầu để che nắng. " +
            "Với chiếc tạp dề ôm quanh thắt lưng, mẹ đứng đó hết giờ này đến giờ khác,dầm tay trong nước, khiến xà phòng nổi cơ man nào là bọt. Sau đó mẹ vắt" +
            "kiệt nước khỏi quần áo và đem ra dây, phơi lên, kẹp lại và kéo chiếc dây " +
            "phơi lên cao. Mẹ làm thế với tất cả quần áo. Mẹ giặt thuê cho nhà bác sĩ" +
            "Faulhaber để kiếm thêm chút ít giúp trang trải chi phí sinh hoạt. Mẹ cao, gầy, " +
            "nhưng rất đẹp. Da mẹ rám nắng, tóc thẳng và đen. Khi mẹ không cột tóc lên, " +
            "tóc mẹ xõa đến tận thắt lưng. Nhưng tuyệt nhất là khi mẹ hát, và tôi hay " +
            "quanh quẩn bên mẹ học lỏm.\n" +
            "   Chàng thủy thủ ơi, chàng thủy thủ ơi Chàng thủy thủ của nỗi buồn ơi Vì " +
            "chàng Ngày mai em sẽ chết...\n" +
            "   Những con sóng xô bờ Quăng mình lên bờ cát Chàng ra khơi rồi Chàng " +
            "thủy thủ ơi..." +
            "   Tình yêu của chàng Chẳng được nổi một ngày Tàu nhổ neo rồi Tàu ra " +
            "khơi...\n" +
            "   Những con sóng xô bờ...\n" +
            "   Bài hát đó luôn khiến lòng tôi dâng trào một nỗi buồn khó hiểu.\n" +
            "   Totoca giật tay tôi. Tôi bừng tỉnh. “Sao thế Zezé?” “Không sao ạ. Em" +
            "đang hát thôi mà.” “Hát ư?” “Vâng.” “Vậy chắc anh điếc rồi.”\n" +
            "   Anh ấy không biết con người ta có thể hát thầm ư? Tôi im lặng. Nếu" +
            "anh không biết thì tôi cũng chẳng định dạy anh đâu.\n" +
            "   Chúng tôi đã tới lề đường quốc lộ Rio-São Paulo. Trên đường quốc lộ," +
            "có đủ mọi loại xe. Xe tải, xe con, xe ngựa, xe đạp.\n"+
            "“  Này,Zezé, chuyện quan trọng đây này. Trước hết chúng ta phải quan" +
            "sát thật kỹ một chiều, sau đó nhìn chiều kia. Bây giờ sang đường nào.”" +
            "   Chúng tôi chạy sang đường.\n" +
            "“  Em có sợ không?”\n" +
            "   Tôi sợ, nhưng tôi lắc đầu.\n" +
            "“  Chúng mình cùng làm lại nào. Sau đó anh muốn xem em đã biết cách" +
            "hay chưa.”\n" +
            "   Chúng tôi chạy trở lại phía bên kia đường. “Bây giờ em sang đường đi." +
            "   Đừng ngập ngừng, bởi vì em lớn rồi mà.”" +
            "   Tim tôi đập nhanh hơn." +
            "   “Nào. Sang đi.\n”    Tôi chạy sang đường, gần như nín thở. Tôi đợi một chút và anh ra hiệu\n" +
            "cho tôi quay trở về chỗ anh.\n" +
            "   “Lần đầu mà làm được thế là tốt đấy. Nhưng em đã quên một điều. Em\n" +
            "phải nhìn cả hai phía xem có xe đang chạy tới không. Không phải lúc nào\n" +
            "anh cũng có mặt ở đây để ra hiệu cho em đâu. Chúng ta sẽ thực hành thêm\n" +
            "trên đường về nhà nhé. Nhưng giờ thì đi thôi, vì anh muốn chỉ cho em một\n" +
            "thứ.”" +
            "   Anh cầm tay tôi và chúng tôi lại bắt đầu bước đi, thong thả. Tôi không\n" +
            "cách nào thôi nghĩ về một cuộc trò chuyện cách đây ít lâu.\n" +
            "   \"Totoca.\" “Gì cơ?”\n" +
            "   “Anh đã cảm nhận được tuổi chín chắn chưa?” “Thứ vớ vẩn gì vậy?”\n" +
            "   “Bác Edmundo nói đấy. Bác nói em khôn trước tuổi và rằng chẳng bao\n" +
            "lâu nữa em sẽ đến tuổi chín chắn. Nhưng em chẳng cảm thấy có gì khác cả.”\n" +
            "   “Bác Edmundo bị ngớ ngẩn đấy. Bác ấy luôn nhồi những thứ vớ vẩn\n" +
            "vào đầu em.”\n" +
            "“Bác ấy không ngớ ngẩn đâu. Bác ấy khôn ngoan đấy chứ. Và khi lớn\n" +
            "lên em muốn trở nên khôn ngoan, thành nhà thơ và thắt nơ bướm. Một ngày\n" +
            "nào đó em sẽ được chụp ảnh chân dung thắt nơ hẳn hoi.”\n" +
            "“Tại sao lại thắt nơ?”\n" +
            "“Bởi vì anh không thể trở thành nhà thơ nếu không thắt nơ. Khi bác\n" +
            "Edmundo cho em xem ảnh các nhà thơ trong cuốn tạp chí đó, em thấy ai\n" +
            "cũng thắt nơ cả.”\n" +
            "“Zezé, em phải thôi đi, đừng tin mọi điều bác ấy nói với em nữa. Bác\n" +
            "Edmundo hơi biêng biêng đấy. Bác ấy còn hơi xạo nữa.”\n" +
            "“Bác ấy là đồ chó đẻ ư?”\n" +
            "“Em đã bị tát lệch mặt vì nói bậy quá nhiều mà chưa chừa à! Bác\n" +
            "Edmundo không như vậy. Anh nói biêng biệng cơ mà. Nghĩa là hơi hâm\n" +
            "hâm.”\n" +
            "   “Anh bảo bác ấy là kẻ nói xạo mà.”\n" +
            "   “Đó là hai chuyện hoàn toàn khác.”\n" +
            "   “Không, có khác gì đâu. Hôm nọ cha kể về ông Labonne với bác\n" +
            "   Severino, bạn chơi bài của cha, và cha nói, “Lão chó đẻ ấy là một kẻ nói xạotrời đánh thánh vật.” Và chẳng ai tát chả lệch mặt cả.”\n" +
            "   “Người lớn nói thế thì không sao.”\n" +
            "   Chúng tôi không nói gì trong vài phút.\n" +
            "   “Bác Edmundo không... Mà biêng biêng có nghĩa là gì, anh Totoca?”\n" +
            "   Anh giơ ngón tay chỉ lên đầu, quay quay ngón tay vẽ thành những vòng\n" +
            "tròn trong không khí.\n" +
            "   “Không, bác ấy không phải vậy. Bác ấy tốt lắm. Bác ấy dạy em nhiều\n" +
            "điều, và chỉ đánh em có mỗi một lần, lại còn chẳng đánh mạnh nữa.”\n" +
            "   Totoca giật mình.\n" +
            "   “Bác ấy đánh em à? Khi nào?”\n" +
            "   “Khi em hư thật và bị Gloria tống đến nhà bà. Bác ấy muốn đọc báo\n" +
            "nhưng không tìm thấy kính. Bác tìm hết chỗ cao đến chỗ thấp và nổi điên\n" +
            "thực sự. Bác hỏi bà kính của bác ở đâu nhưng bà không biết. Hai người lục\n" +
            "tung cả nhà lên để tìm. Thế rồi em nói em biết kính của bác ở đâu và nếu bác\n" +
            "cho em ít tiền để mua bi thì em sẽ nói cho bác biết. Bác đi đến chỗ để áo\n" +
            "khoác và lấy ra một ít tiền.\n" +
            "   “Mang kính ra đây thì bác đưa tiền cho mày.” “Em đến chỗ rương đựng\n" +
            "quần áo lấy cái kính ra. Bác nói, Ra là mày, đồ ranh con!” Bác phát vào lưng\n" +
            "em và cất béng tiền đi.”\n" +
            "   Totoca cười phá lên.\n" +
            "   “Em đến đó để khỏi bị ăn đòn ở nhà thế mà lại bị đánh ở đó. Đi nhanh\n" +
            "chân lên một chút, nếu không chúng ta sẽ chẳng bao giờ đến nơi được đâu.”\n" +
            "   Tôi vẫn đang nghĩ về bác Edmundo. “Totoca, trẻ con nghỉ hưu phải\n" +
            "không?” “Gì cơ?”\n" +
            "   “Bác Edmundo chẳng làm gì cả mà vẫn có tiền. Bác không làm việc,\n" +
            "nhưng Tòa Thị chính vẫn trả tiền cho bác hằng tháng.”\n" +
            "   “Thì sao?”\n" +
            "   “À thì, trẻ con chẳng làm gì. Trẻ con ăn, ngủ và được cha mẹ cho tiền.”\n" +
            "   “Nghỉ hưu khác chứ, Zezé. Người nghỉ hưu đã làm việc trong một thời\n" +
            "gian dài rồi, tóc đã ngả bạc, chân chậm mắt mờ như bác Edmundo rồi.\n" +
            "   Nhưng đừng nghĩ về những thứ khó nhằn ấy nữa. Nếu em muốn học nhiều\n" +
            "điều từ bác ấy thì tốt thôi. Nhưng khi đi với anh thì không nhé.",2),
    Chapter(2,"MỘT CÂY CAM NGỌT", " Trong gia đình tôi, mỗi đứa lớn đều phải trong một đứa em. Jandira " +
            "trông Gloria và một người em gái khác - đã bị đưa đến miền Bắc làm con " +
            "nuôi để được nuôi nấng cho tử tế. Totoca là đứa em cưng của Jandira. Lala " +
            "là người trông nom tôi, mãi cho đến dạo gần đây. Sau đó thì chị hết thích " +
            "tôi. Tôi nghĩ chị đã chán phát ớn tôi rồi hoặc đã yêu mê mệt bạn trai chị, " +
            "một anh chàng bảnh bao diện quần thụng áo khoác lửng giống như ca sĩ. " +
            "Cái thời anh chị còn thường đưa tôi đi dạo (bạn trai chị gọi là “tản bộ”) vào " +
            "các ngày Chủ nhật, anh thường mua cho tôi một ít kẹo thật ngon để tôi " +
            "không kể cho ai biết chuyện của hai người. Tôi thậm chí không thể hỏi bác " +
            "Edmundo xem “tản bộ” có nghĩa là gì, nếu không cả nhà sẽ phát hiện ra. " +
            "   Hai người anh chị nữa của tôi bị chết yểu và tôi chỉ nghe nói về họ mà " +
            "thôi. Mọi người kể anh chị là hai em bé người da đỏ thuộc bộ tộc Apinajé, " +
            "da đen lắm, có mái tóc đen thẳng. Bởi vậy nên anh chị mới được đặt cho " +
            "những cái tên của người da đỏ. Chị tên là Aracy, còn anh là Jurandyr.\n" +
            "   Sau đó em trai Luís của tôi ra đời. Gloria là người trông nom nó nhiều " +
            "nhất, sau đó đến tôi. Thằng bé thậm chí không cần ai phải trông, bởi vì trên " +
            "đời này chẳng có bé trai nào ngoan ngoãn, yên lặng và dễ thương hơn nó\n" +
            "   Chính vì thế, khi nó nói bằng giọng nhỏ nhẹ, sõi ơi là sõi, đúng lúc tôi " +
            "đang bước chân ra đường, tôi thay đổi ý định ngay tức thì." +
            "   “Zezé ơi, anh đưa em đi vườn thú nhé? Hôm nay có vẻ trời sẽ không " +
            "mua đâu, anh nhỉ?”" +
            "   Cưng quá đi mất. Nó nói sõi quá. Thằng bé đó sau này không phải của " +
            "vừa đâu; thể nào nó cũng sẽ tiến xa cho xem.\n" +
            "   Tôi ngắm nhìn ngày đẹp trời, nhìn bầu trời xanh thăm thẳm, chẳng nỡ " +
            "lòng nào nói dối. Bởi vì đôi khi, nếu đang không vui, tôi sẽ nói, “Luís, em " +
            "điên à. Nhìn xem, cơn dông sắp kéo đến kia kìa!”\n" +
            "   Lần này tôi cầm bàn tay nhỏ bé của nó và chúng tôi bước ra sân sau\n" +
            "bắt đầu cuộc phiêu lưu" +
            "   Sân sau được chia thành ba khu vui chơi. Một là vườn thú. Một khu là " +
            "châu Âu, kết thúc chỗ hàng rào nhỏ ngay ngắn của Julio. Tại sao lại là châu " +
            "Âu ư? Ngay cả chú chim nhỏ trong tôi cũng không biết. Chúng tôi chơi trò " +
            "đi cáp treo lên núi Sugarloaf. Chúng tôi mang cái hộp đựng cúc áo ra và xâu " +
            "hết cúc lại bằng một sợi dây. (Bác Edmundo gọi thứ dây đó là thừng. Tôi cứ " +
            "nghĩ “thừng” là đứa con trai, nhưng bác giải thích con trai là “thằng” cơ). " +
            "Sau đó chúng tôi buộc một đầu dây vào hàng rào và một đầu kia vào ngón " +
            "tay Luis. Chúng tôi đẩy hết cúc lên tít đầu dây và để chúng trượt từ từ, từng " +
            "chiếc từng chiếc một. Mỗi toa cáp treo đều chở đầy những người chúng tôi " +
            "biết. Có một cái đen sì chở Biriquinho. Chẳng có gì là lạ khi nghe thấy một " +
            "giọng nói vọng qua hàng rào, “Zezé, mày đang phá hàng rào của bà phải\n" +
            "không?”\n" +
            "   “Không đâu, bà Dimerinda. Bà cứ ra đây mà xem này.”\n" +
            "“Ồ, bà thích xem cảnh này đấy. Chơi ngoan với em trai mày. Như thế " +
            "chẳng hay hơn à?”\n" +
            "   Có lẽ như thế hay hơn thật, nhưng khi “cha đỡ đầu” là quỷ dữ của tôi " +
            "huých tôi một cái, thì chẳng có gì hay hơn chuyện giở trò tinh quái...\n" +
            "   “Bà sẽ cho cháu một cuốn lịch làm quà Giáng sinh như năm ngoái chứ\n" +
            "ạ?”\n" +
            "“Bà cứ vào trong mà xem, bà Dimerinda. Nó ở ngay phía trên túi bánh " +
            "mì đấy ạ.”\n" +
            "Bà bật cười và hứa sẽ sang xem. Chồng bà làm việc tại cửa hàng bách " +
            "hóa tổng hợp của ông Chico Franco.\n" +
            "Trò chơi còn lại là Luciano. Ban đầu Luis thực sự sợ nó, cứ túm lấy " +
            "quần tôi giật, đòi đi khỏi chỗ đó. Nhưng Luciano là bạn tôi. Mỗi khi nhìn " +
            "thấy tôi, nó đều rít lên rõ to. Gloria cũng không thích nó và bảo rằng loài " +
            "dơi là ma cà rồng hút máu trẻ con.\n" +
            "“Không phải vậy đâu, Gló. Luciano không giống như vậy đâu. Nó là " +
            "bạn em mà. Nó biết em.”\n" +
            "“Em và cái kiểu cuồng động vật của em, suốt ngày nói chuyện với con " +
            "nọ, con kia...”\n" +
            "Khó khăn lắm tôi mới thuyết phục được Luis tin rằng Luciano không " +
            "phải một con vật. Đối với chúng tôi, Luciano là một chiếc máy bay đang " +
            "bay đến căn cứ không quân Afonso.\n" +
            "“Nhìn này, Luis.”\n" +
            "Và Luciano thích thú bay quanh chúng tôi như thể nó hiểu chúng tôi " +
            "nói gì. Mà nó hiểu thật.\n" +
            "“Nó là một chiếc máy bay. Nó đang...”\n" +
            "Tôi ngừng lại. Tôi phải bảo bác Edmundo nói cho tôi nghe từ đó lần " +
            "nữa mới được. Tôi không biết từ đó là “nháo lộn”, “nhào lộn” hay “nhạo " +
            "lộn”. Một trong những từ đó. Nhưng tôi không thể dạy em mình một từ " +
            "không chính xác.\n" +
            "Nhưng bây giờ nó muốn sang vườn thú.\n" +
            "Chúng tôi đến gần cái chuồng gà cũ. Trong chuồng, hai con gà mái\n" +
            "lông sáng màu đang mổ mổ xuống đất, còn con gà mái đen già khụ thì lành\n" +
            "đến nỗi chúng tôi còn có thể gãi đầu nó.\n" +
            "“Trước tiên chúng mình mua vé đã. Nắm tay anh nào, bởi vì trẻ con dễ " +
            "bị lạc ở chỗ đông người như thế này lắm. Nhìn xem, ngày Chủ nhật ở đây " +
            "thật nhộn nhịp phải không?” " +
            "Luis nhìn quanh, thấy khắp nơi toàn người là người, bèn nắm chặt tay " +
            "tôi." +
            "   “Mày đã làm gì với cuốn lịch bà cho vậy hả?”",2),
    Chapter(3,"NHỮNG NGÓN TAY GẦY GUỘC CỦA NGHÈO TÚNG"
        , "Khi tôi tâm sự với bác Edmundo về rắc rối của mình, bác đăm chiêu\n" +
                "suy nghĩ một hồi.\n" +
                "“Vậy đó là chuyện khiến cháu lo lắng hả?”\n" +
                "“Vâng ạ. Cháu lo là khi chúng cháu chuyển nhà, Luciano sẽ không đi " +
                "theo chúng cháu.”\n" +
                "“Cháu có nghĩ rằng con dơi đó thực sự thích cháu không?”\n" +
                "“Tất nhiên rồi ạ.”\n" +
                "“Thích từ tận đáy lòng chứ?”\n" +
                "“Chắc chắn thế.”\n" +
                "“Vậy thì cháu cứ yên tâm, nó sẽ đi. Có thể nó sẽ mất một thời gian mới " +
                "xuất hiện ở nhà mới được, nhưng một ngày nào đó nó sẽ tìm ra đường đến " +
                "đấy thôi.”\n" +
                "“Cháu đã nói cho nó tên phố và số nhà rồi.”\n" +
                "“Ồ, vậy sẽ càng dễ hơn. Nếu không thể đến vì còn vướng bận chuyện\n" +
                "này chuyện kia, nó sẽ gửi một người anh em họ hàng nào đấy đến thay và " +
                "cháu thậm chí sẽ không bao giờ nhận ra sự khác biệt ấy chứ.”\n" +
                "Nhưng tôi vẫn không thấy thuyết phục cho lắm. Địa chỉ có ý nghĩa gì\n" +
                "đâu nếu Luciano không biết đọc? Có thể nó sẽ vừa đi vừa hỏi thăm chim\n" +
                "chóc, bọ ngựa hoặc lũ bướm.\n" +
                "“Đừng lo, Zezé. Dơi rất giỏi xác định phương hướng đấy.”\n" +
                "“Xác định cái gì cơ, bác?”\n" +
                "Bác giải thích cho tôi “phương hướng” nghĩa là gì và tôi càng bị ấn\n" +
                "tượng hơn trước khối kiến thức của bác.\n" +
                "Nhẹ bớt một nỗi lo, tôi lại đi khắp nơi để kể cho mọi người kế hoạch\n" +
                "chúng tôi đang ấp ủ: cuộc chuyển nhà. Hầu hết người lớn đáp lại với vẻ phấn\n" +
                "khởi, “Cháu sắp chuyển nhà sao, Zezé? Ôi tốt quá! Tuyệt vời! Thật nhẹ cả\n" +
                "người!”\n" +
                "Người duy nhất tỏ ra điềm nhiên là Biriquinho.\n" +
                "“Tin tốt là nhà mới của cậu chỉ cách đây vài con phố. Cậu sẽ vẫn ở gần\n" +
                "đây thôi. Thế còn chuyện tớ bảo cậu thì sao?”\n" +
                "“Nó diễn ra vào lúc nào ấy nhỉ?”\n" +
                "“Ngày mai, tám giờ, ở cửa sòng bài. Nghe đồn ông chủ nhà máy đã đặt\n" +
                "mang đến cả một xe tải đồ chơi. Cậu đi chứ?”\n" +
                "“Đi. Tớ sẽ đưa Luís theo. Cậu có nghĩ tớ cũng sẽ nhận được món gì đó\n" +
                "không?”\n" +
                "“Tất nhiên. Cậu cũng là một đứa nhóc như nó thôi mà. Sao thế? Cậu\n" +
                "nghĩ là mình lớn quá rồi à?”\n" +
                "Nó đến gần hơn và tôi có cảm giác mình vẫn bé xíu. Bé hơn tôi nghĩ.\n" +
                "“Bởi vì nếu tớ đến lấy một món quà thì... Thôi, giờ tớ còn có việc. Gặp\n" +
                "cậu ở đó nhé.”\n" +
                "Tôi về nhà, quanh quẩn bên Gloria.\n" +
                "“Có chuyện gì vậy, Zezé?”\n" +
                "“Ngày mai nếu chị có thể đưa chúng em đến sòng bài thì tuyệt. Có một\n" +
                "xe tải chất đầy đồ chơi từ thành phố về.”\n" +
                "“Ôi Zezé. Chị có cả núi việc phải làm. Chị phải là quần áo, chị phải\n" +
                "giúp chị Jandira chuẩn bị mọi thứ để chuyển nhà, chị phải canh mấy cái nồi\n" +
                "trên bếp...”\n" +
                "“Một nhóm học viên trường sĩ quan từ vùng Realengo sẽ đến đấy.”" +
                "Ngoài việc sưu tầm tranh của nam diễn viên Rudolph Valentino, hay\n" +
                "Rudy theo cách gọi của chị, và dán chúng vào một cuốn sổ tay, Gloria còn\n" +
                "mê mẩn các học viên trường sĩ quan.\n" +
                "“Em đang đùa chị hả Zezé. Gặp các học viên trường sĩ quan vào lúc\n" +
                "tám giờ sáng ư? Đừng hòng lừa chị! Đi chỗ khác chơi đi, Zezé.”\n" +
                "Nhưng tôi không dễ dàng bỏ đi như vậy.\n" +
                "“Chị biết mà, Gló, có phải vì em đâu. Em đã hứa với Luis là sẽ đưa nó\n" +
                "đi. Nó còn quá nhỏ. Ở vào tuổi nó thì bọn trẻ con có nghĩ đến cái gì khác\n" +
                "ngoài lễ Giáng sinh đâu.”\n" +
                "“Zezé, chị đã nói rồi, chị sẽ không đi. Và đừng có bịa chuyện: chính em\n" +
                "mới là đứa muốn đi. Em còn cả đời để kiếm quà Giáng sinh mà.”\n" +
                "“Nhưng nhờ em chết thì sao? Nhỡ em chết mà không nhận được món\n" +
                "quà Giáng sinh nào cho năm nay thì sao?”\n" +
                "“Em sẽ không chết sớm vậy được đâu, ông cụ non ạ. Em sẽ sống lâu\n" +
                "gấp đôi bác Edmundo hay ông Benedito. Nào, lằng nhằng đủ rồi đấy. Đi chơi\n" +
                "đi.”\n" +
                "Nhưng tôi vẫn không đi. Tôi đảm bảo rằng dù chị có đi đâu thì hình ảnh\n" +
                "tôi cũng đập vào mắt chị. Gloria đi đến chỗ tủ com mốt để lấy thứ gì đó và\n" +
                "thấy tôi đang ngồi trên ghế bập bênh, ngước nhìn chị với ánh mắt cầu xin.\n" +
                "Việc nhìn Gloria bằng ánh mắt đáng thương để năn nỉ quả thật ít nhiều có tác\n" +
                "dụng. Khi chị đi đến chỗ chậu lấy nước, tôi ngồi ở ngưỡng cửa nhìn chị. Khi\n" +
                "chị đi đến phòng ngủ để lấy quần áo đi giặt, tôi ngồi trên giường, tay chống\n" +
                "cằm, nhìn...\n" +
                "Chị không thể phớt lờ tôi được nữa.\n" +
                "“Đủ rồi, Zezé. Chị đã nói với em rồi, không là không. Chúa ơi, đừng\n" +
                "thách thức sức chịu đựng của chị. Đi chơi đi.”\n" +
                "Nhưng tôi vẫn không đi. Có nghĩa là tôi nghĩ tôi sẽ không đi. Nhưng\n" +
                "Gloria đã tóm lấy tôi, lôi ra cửa và ném phịch xuống sân sau. Rồi chị trở vào\n" +
                "trong, đóng cửa bếp và cửa phòng khách lại. Tôi không bỏ cuộc. Vì bây giờ\n" +
                "chị đang bắt đầu phủi bụi và dọn giường, tôi quyết định ngồi bên ngoài mọi\n" +
                "ô cửa sổ chị sẽ đi qua. Chị bắt gặp tôi đang nhìn trộm, bèn đóng cửa sổ lại" +
                "Cuối cùng thành ra chị phải đóng kín cả ngôi nhà để không phải nhìn thấy\n" +
                "tôi nữa.\n" +
                "“Đồ ích kỷ! Đồ phù thủy độc ác! Em cầu mong chị sẽ không bao giờ\n" +
                "lấy được một học viên trường sĩ quan. Em ước chị sẽ cưới phải một gã lính\n" +
                "trơn thậm chí chẳng đủ tiền để mà đánh bóng đôi bốt.”\n" +
                "Khi nhận ra mình chỉ đang phí thời gian, tôi đùng đùng lao ra đường.\n" +
                "Tôi tình cờ gặp Nardinho đang chơi. Nó ngồi chồm hổm, nhìn say mê\n" +
                "một cái gì đó đến mức quên hết mọi thứ xung quanh. Tôi bước đến. Nó đã\n" +
                "làm một cái xe kéo nhỏ bằng hộp diêm và buộc vào đó con bọ cánh cứng to\n" +
                "nhất trần đời.\n" +
                "“Ối chà chà!”\n" +
                "“Ta nhở?”\n" +
                "“Muốn đổi không?”\n" +
                "“Sao?” “Bao nhiêu cái?” “Hai.\"\n" +
                "“Nếu mày muốn vài cái thẻ bài...”\n" +
                "“Mày đùa hả. Con bọ cánh cứng lớn chừng này mà mày chỉ định đổi\n" +
                "cho tao hai cái thẻ?”\n" +
                "“Có cả đống bọ cánh cứng như con của mày ở cái mương sau nhà bác\n" +
                "Edmundo đấy.” bài.”\n" +
                "“Tao sẽ đổi lấy ba thẻ “Ba cái, nhưng mày không được chọn.”\n" +
                "“Không chơi thế. Tao sẽ phải được chọn ít nhất hai cái.”\n" +
                "“Được rồi.”\n" +
                "Tôi có vài cái thẻ hình nữ diễn viên Laura La Plante nên đưa cho nó\n" +
                "một cái. Còn nó chọn một cái hình diễn viên điện ảnh Hoot Gibson và một\n" +
                "cái khác hình Pansy Ruth Miller. Tôi bỏ con bọ cánh cứng vào túi quần và đi\n" +
                "tiếp.\n" +
                "“Nhanh lên nào Luis. Chị Gloria đi mua bánh mì rồi còn chị Jandira thì\n" +
                "đang ngồi đọc sách trên ghế bập bênh.”\n" +
                "Chúng tôi bò rạp qua hành lang đến nhà vệ sinh. Tôi giúp nó đi tè.\n" +
                "“Cố tè cho hết đi vì ban ngày chúng ta không được phép tè trên đường\n" +
                "phố đâu.”\n" +
                "Sau đó, tôi vốc nước từ trong chậu té lên mặt nó. Tôi cũng làm vậy với\n" +
                "chính mình rồi chúng tôi trở lại phòng ngủ.\n" +
                "Tôi mặc quần áo cho nó mà không gây ra bất kỳ tiếng động nào. Tôi đi\n" +
                "giày cho nó. Mấy cái tất chết tiệt! Chỉ tổ vướng chân. Tôi cài khuy chiếc áo\n" +
                "vét nhỏ màu xanh dương của nó rồi tìm lược. Nhưng tóc nó không chịu xẹp\n" +
                "xuống. Phải làm gì đó với mái tóc này mới được. Tôi lục lọi khắp mọi ngóc\n" +
                "ngách mà không tìm được gì hữu ích. Không sáp, không dầu. Thế là tôi vào\n" +
                "bếp và trở lại với một ít mỡ lợn dính trên đầu ngón tay. Tôi thoa mỡ vào lòng\n" +
                "bàn tay rồi thử ngửi.\n" +
                "“Không hề có mùi.”\n" +
                "Tôi vỗ vỗ bàn tay bôi mỡ lên tóc Luis và bắt đầu chải. Mái tóc quăn tít\n" +
                "của nó thật đẹp. Nó trông giống Thánh John Công chú cừu non trên vai.\n" +
                "“Bây giờ em đứng đây nhé, đừng làm nhăn bộ cánh đấy. Anh sẽ đi mặc\n" +
                "đồ.”\n" +
                "Trong lúc mặc quần dài và áo sơ mi trắng vào, tôi ngắm em trai mình.\n" +
                "Thật là một đứa trẻ xinh xắn! Không có đứa trẻ nào Bangu dễ thương\n" +
                "như nó.\n" +
                "Tôi xỏ chân vào đôi giày thể thao, đôi giày nhất thiết phải trụ được đến\n" +
                "khi tôi đi học. Trong lúc đó, tôi vẫn tiếp tục ngắm Luís.\n" +
                "Với dáng vẻ đáng yêu và gọn gàng này của thằng bé, mọi người có thể\n" +
                "nhầm nó với Chúa Hài Đồng ấy chứ. Tôi chắc chắn nó sẽ được tặng nhiều\n" +
                "quà. Khi mọi người nhìn thấy nó...\n" +
                "Tôi rùng mình. Chị Glória vừa trở về và đang đặt bánh mì lên bàn. Tôi\n" +
                "có thể nghe thấy tiếng chiếc túi giấy sột soạt.\n" +
                "Chúng tôi bước vào, tay trong tay và đứng trước mặt chị.\n" +
                "“Trông em ấy thật đáng yêu, chị Gló nhỉ? Em đã tự sửa soạn cho em ấy\n" +
                "đấy.”\n" +
                "Thay vì giận dữ, chị đứng tựa vào cánh cửa và ngước mắt lên. Khi chị\n" +
                "cúi đầu xuống, mắt chị ngấn lệ. “Trông em cũng đáng yêu lắm. Ôi, Zezé!”\n" +
                "Chị quỳ xuống và ôm ghì tôi vào lòng.\n" +
                "“Lạy Chúa lòng lành! Sao đối với một số người cuộc sống cứ nhất thiết\n" +
                "phải khó khăn thế?\n" +
                "Chị bình tĩnh lại và bắt đầu chỉnh trang quần áo cho chúng tôi.\n" +
                "“Chị đã nói rồi, chị không thể đưa em đi. Chị thực sự không thể, Zezé.\n" +
                "Chị có quá nhiều việc phải làm. Ăn sáng trước đã nhé, trong khi chị suy nghĩ\n" +
                "một chút. Kể cả khi muốn đưa em đi, chị cũng không có đủ thời gian để\n" +
                "chuẩn bị...”\n" +
                "Chị rót cà phê và cắt bánh mì cho chúng tôi. Chị vẫn tiếp tục nhìn hai\n" +
                "đứa tôi với ánh mắt tuyệt vọng.\n" +
                "“Quá vất vả chỉ vì vài món đồ chơi chẳng ra gì.\n" +
                "Nhưng có lẽ là ngoài kia có nhiều người nghèo khổ quá nên người ta\n" +
                "chẳng thể tặng những món đồ tốt hẳn hoi.” Chị ngừng lời một chút rồi tiếp\n" +
                "tục. “Đây có thể là cơ hội duy nhất của em. Chị sẽ không cấm em đi. Nhưng\n" +
                "Chúa ơi, em còn quá nhỏ...”\n" +
                "“Em sẽ đưa em ấy đi an toàn. Em sẽ luôn cầm tay em ấy, chị Gló.\n" +
                "Chúng em thậm chí còn chẳng cần sang đường.”\n" +
                "“Kể cả thế, chuyện này vẫn rất nguy hiểm.”\n" +
                "“Không, nó không nguy hiểm chút nào, em rất giỏi xác định phương\n" +
                "hướng.”\n" +
                "Chị cười buồn.\n" +
                "“Này, ai dạy em từ đó thế?”\n" +
                "“Bác Edmundo. Bác nói Luciano rất giỏi việc đó, mà Luciano thì nhỏ\n" +
                "hơn em, nên chắc hẳn em sẽ giỏi hơn nó...”\n" +
                "“Chị sẽ nói với chị Jandira.”\n" +
                "“Sao phải làm phiền chị ấy ạ? Chị ấy sẽ đồng ý thôi. Chị ấy có làm gì\n" +
                "ngoài đọc tiểu thuyết và mơ mộng về bạn trai của mình đâu ạ. Chị ấy chẳng\n" +
                "quan tâm đâu.”\n" +
                "“Hãy làm thế này nhé: em ăn nốt bữa sáng đi và chúng ta sẽ ra cổng.\n" +
                "Nếu có người quen nào cũng đi đường đó, chị sẽ nhờ họ đi cùng các em.”\n" +
                "Tôi không muốn ăn thêm một mẩu bánh mì nào nữa, vì như thế thật phí\n" +
                "phạm thời gian. Vậy nên chúng tôi đi ra cổng.\n" +
                "Chẳng có ma nào đi ngang qua. Thứ duy nhất vẫn đang chảy trôi là thời\n" +
                "gian. Nhưng cuối cùng một vị cứu tinh cũng xuất hiện. Bác Paixảo, người\n" +
                "đưa thư, bước tới. Bác vẫy tay chào chị Gloria, bỏ mũ xuống và xung phong\n" +
                "đi cùng chúng tôi",2)
)
@Composable
fun ChapterScreen(chapterIndex: Int,  navigateUp: ()-> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val chapterViewModel: ChapterViewModel = viewModel(
        factory = ChapterViewModelFactory(context.applicationContext as Application)
    )

    LaunchedEffect(Unit) {
        scope.launch {
            chapterViewModel.upsertInitialChapters(chaptersData)
            chapterViewModel.setChapterIndex(chapterIndex)
        }
    }

    val chapters = chapterViewModel.chapters.collectAsState(initial = emptyList()).value
    val currentChapterIndex = chapterViewModel.currentChapterIndex.collectAsState().value

    if (chapters.isNotEmpty()) {
        val currentChapter = chapters[currentChapterIndex]
        ChapterItem(
            chapter = currentChapter,
            onNextChapter = { chapterViewModel.nextChapter() },
            onPreviousChapter = { chapterViewModel.previousChapter() },
            onBackClick = navigateUp
        )
    }
}


@Composable
fun ChapterItem(chapter: Chapter, onNextChapter: () -> Unit, onPreviousChapter: () -> Unit, onBackClick: () -> Unit) {

    LazyColumn(modifier = Modifier.padding(8.dp)) {

        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()

            ) {
                IconButton(onClick = onBackClick) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, tint = PrimaryKeyColor,modifier = Modifier)
                }
                Spacer(modifier = Modifier.width(IconSize))
                Text(
                    text = "Chương ${chapter.id} ${chapter.title}",
                    color = PrimaryKeyColor,
                    fontSize = Dimens.MediumText,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                    fontWeight = FontWeight.Medium
                )

            }
            Text(text = chapter.content)
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = onPreviousChapter, colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = PrimaryKeyColor)
                }
                Button(onClick = onNextChapter, colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "", tint = PrimaryKeyColor)
                }
            }
        }
    }
}

@Preview(showBackground = true)

@Composable
fun PVChapter() {
    EBookTheme {
        ChapterItem(onBackClick = {}, chapter =
        Chapter(1,"KHÁM PHÁ NHIỀU ĐIỀU", "  Chúng tôi đi xuống phố, tay trong tay, chẳng có gì phải vội. Totoca " +
                "đang dạy tôi về cuộc sống. Và điều đó khiến tôi thực sự hạnh phúc, được anh " +
                "trai nắm tay và dạy nhiều điều. Nhưng là dạy về những điều thuộc thế giới " +
                "bên ngoài. Bởi vì ở nhà, tôi học hỏi bằng cách tự mày mò khám phá và tự " +
                "làm, tôi mắc lỗi nhiều và vì mắc lỗi, tôi thường bị ăn đòn. Cho tới tận trước " +
                "đây không lâu, tôi vẫn chưa bị ai đánh bao giờ. Nhưng rồi mọi người nghe " +
                "được chuyện này, chuyện nọ và bắt đầu nói tôi là quỷ, là quái vật, là tiểu yêu " +
                "tóc hung. Tôi không muốn biết về điều đó. Nếu không phải đang ở bên ngoài " +
                "thì tôi đã bắt đầu hát. Hát thú vị lắm. Ngoài ca hát, Totoca còn biết làm điều " +
                "khác nữa: anh có thể huýt sáo. Nhưng dù cố gắng đến mức nào tôi cũng " +
                "chẳng thể bắt chước anh huýt sáo được, chẳng âm thanh nào bật ra cả. Để an " +
                "ủi tôi, anh bảo chuyện đó cũng bình thường thôi, rằng tôi chưa có cái miệng " +
                "của người huýt sáo. Nhưng vì không thể hát thành lời, tôi hát thầm ở trong " +
                "lòng. Thoạt đầu điều đó thật kỳ cục, nhưng về sau tôi cảm thấy hát như thế " +
                "thực sự thú vị. Và lúc này, tôi đang nhớ lại một bài hát mẹ thường hát khi tôi " +
                "còn bé xíu. Mẹ đứng bên chậu giặt, mảnh khăn buộc quanh đầu để che nắng. " +
                "Với chiếc tạp dề ôm quanh thắt lưng, mẹ đứng đó hết giờ này đến giờ khác,dầm tay trong nước, khiến xà phòng nổi cơ man nào là bọt. Sau đó mẹ vắt" +
                "kiệt nước khỏi quần áo và đem ra dây, phơi lên, kẹp lại và kéo chiếc dây " +
                "phơi lên cao. Mẹ làm thế với tất cả quần áo. Mẹ giặt thuê cho nhà bác sĩ" +
                "Faulhaber để kiếm thêm chút ít giúp trang trải chi phí sinh hoạt. Mẹ cao, gầy, " +
                "nhưng rất đẹp. Da mẹ rám nắng, tóc thẳng và đen. Khi mẹ không cột tóc lên, " +
                "tóc mẹ xõa đến tận thắt lưng. Nhưng tuyệt nhất là khi mẹ hát, và tôi hay " +
                "quanh quẩn bên mẹ học lỏm.\n" +
                "   Chàng thủy thủ ơi, chàng thủy thủ ơi Chàng thủy thủ của nỗi buồn ơi Vì " +
                "chàng Ngày mai em sẽ chết...\n" +
                "   Những con sóng xô bờ Quăng mình lên bờ cát Chàng ra khơi rồi Chàng " +
                "thủy thủ ơi..." +
                "   Tình yêu của chàng Chẳng được nổi một ngày Tàu nhổ neo rồi Tàu ra " +
                "khơi...\n" +
                "   Những con sóng xô bờ...\n" +
                "   Bài hát đó luôn khiến lòng tôi dâng trào một nỗi buồn khó hiểu.\n" +
                "   Totoca giật tay tôi. Tôi bừng tỉnh. “Sao thế Zezé?” “Không sao ạ. Em" +
                "đang hát thôi mà.” “Hát ư?” “Vâng.” “Vậy chắc anh điếc rồi.”\n" +
                "   Anh ấy không biết con người ta có thể hát thầm ư? Tôi im lặng. Nếu" +
                "anh không biết thì tôi cũng chẳng định dạy anh đâu.\n" +
                "   Chúng tôi đã tới lề đường quốc lộ Rio-São Paulo. Trên đường quốc lộ," +
                "có đủ mọi loại xe. Xe tải, xe con, xe ngựa, xe đạp.\n"+
                "“  Này,Zezé, chuyện quan trọng đây này. Trước hết chúng ta phải quan" +
                "sát thật kỹ một chiều, sau đó nhìn chiều kia. Bây giờ sang đường nào.”" +
                "   Chúng tôi chạy sang đường.\n" +
                "“  Em có sợ không?”\n" +
                "   Tôi sợ, nhưng tôi lắc đầu.\n" +
                "“  Chúng mình cùng làm lại nào. Sau đó anh muốn xem em đã biết cách" +
                "hay chưa.”\n" +
                "   Chúng tôi chạy trở lại phía bên kia đường. “Bây giờ em sang đường đi." +
                "   Đừng ngập ngừng, bởi vì em lớn rồi mà.”" +
                "   Tim tôi đập nhanh hơn." +
                "   “Nào. Sang đi.\n”    Tôi chạy sang đường, gần như nín thở. Tôi đợi một chút và anh ra hiệu\n" +
                "cho tôi quay trở về chỗ anh.\n" +
                "   “Lần đầu mà làm được thế là tốt đấy. Nhưng em đã quên một điều. Em\n" +
                "phải nhìn cả hai phía xem có xe đang chạy tới không. Không phải lúc nào\n" +
                "anh cũng có mặt ở đây để ra hiệu cho em đâu. Chúng ta sẽ thực hành thêm\n" +
                "trên đường về nhà nhé. Nhưng giờ thì đi thôi, vì anh muốn chỉ cho em một\n" +
                "thứ.”" +
                "   Anh cầm tay tôi và chúng tôi lại bắt đầu bước đi, thong thả. Tôi không\n" +
                "cách nào thôi nghĩ về một cuộc trò chuyện cách đây ít lâu.\n" +
                "   \"Totoca.\" “Gì cơ?”\n" +
                "   “Anh đã cảm nhận được tuổi chín chắn chưa?” “Thứ vớ vẩn gì vậy?”\n" +
                "   “Bác Edmundo nói đấy. Bác nói em khôn trước tuổi và rằng chẳng bao\n" +
                "lâu nữa em sẽ đến tuổi chín chắn. Nhưng em chẳng cảm thấy có gì khác cả.”\n" +
                "   “Bác Edmundo bị ngớ ngẩn đấy. Bác ấy luôn nhồi những thứ vớ vẩn\n" +
                "vào đầu em.”\n" +
                "“Bác ấy không ngớ ngẩn đâu. Bác ấy khôn ngoan đấy chứ. Và khi lớn\n" +
                "lên em muốn trở nên khôn ngoan, thành nhà thơ và thắt nơ bướm. Một ngày\n" +
                "nào đó em sẽ được chụp ảnh chân dung thắt nơ hẳn hoi.”\n" +
                "“Tại sao lại thắt nơ?”\n" +
                "“Bởi vì anh không thể trở thành nhà thơ nếu không thắt nơ. Khi bác\n" +
                "Edmundo cho em xem ảnh các nhà thơ trong cuốn tạp chí đó, em thấy ai\n" +
                "cũng thắt nơ cả.”\n" +
                "“Zezé, em phải thôi đi, đừng tin mọi điều bác ấy nói với em nữa. Bác\n" +
                "Edmundo hơi biêng biêng đấy. Bác ấy còn hơi xạo nữa.”\n" +
                "“Bác ấy là đồ chó đẻ ư?”\n" +
                "“Em đã bị tát lệch mặt vì nói bậy quá nhiều mà chưa chừa à! Bác\n" +
                "Edmundo không như vậy. Anh nói biêng biệng cơ mà. Nghĩa là hơi hâm\n" +
                "hâm.”\n" +
                "   “Anh bảo bác ấy là kẻ nói xạo mà.”\n" +
                "   “Đó là hai chuyện hoàn toàn khác.”\n" +
                "   “Không, có khác gì đâu. Hôm nọ cha kể về ông Labonne với bác\n" +
                "   Severino, bạn chơi bài của cha, và cha nói, “Lão chó đẻ ấy là một kẻ nói xạotrời đánh thánh vật.” Và chẳng ai tát chả lệch mặt cả.”\n" +
                "   “Người lớn nói thế thì không sao.”\n" +
                "   Chúng tôi không nói gì trong vài phút.\n" +
                "   “Bác Edmundo không... Mà biêng biêng có nghĩa là gì, anh Totoca?”\n" +
                "   Anh giơ ngón tay chỉ lên đầu, quay quay ngón tay vẽ thành những vòng\n" +
                "tròn trong không khí.\n" +
                "   “Không, bác ấy không phải vậy. Bác ấy tốt lắm. Bác ấy dạy em nhiều\n" +
                "điều, và chỉ đánh em có mỗi một lần, lại còn chẳng đánh mạnh nữa.”\n" +
                "   Totoca giật mình.\n" +
                "   “Bác ấy đánh em à? Khi nào?”\n" +
                "   “Khi em hư thật và bị Gloria tống đến nhà bà. Bác ấy muốn đọc báo\n" +
                "nhưng không tìm thấy kính. Bác tìm hết chỗ cao đến chỗ thấp và nổi điên\n" +
                "thực sự. Bác hỏi bà kính của bác ở đâu nhưng bà không biết. Hai người lục\n" +
                "tung cả nhà lên để tìm. Thế rồi em nói em biết kính của bác ở đâu và nếu bác\n" +
                "cho em ít tiền để mua bi thì em sẽ nói cho bác biết. Bác đi đến chỗ để áo\n" +
                "khoác và lấy ra một ít tiền.\n" +
                "   “Mang kính ra đây thì bác đưa tiền cho mày.” “Em đến chỗ rương đựng\n" +
                "quần áo lấy cái kính ra. Bác nói, Ra là mày, đồ ranh con!” Bác phát vào lưng\n" +
                "em và cất béng tiền đi.”\n" +
                "   Totoca cười phá lên.\n" +
                "   “Em đến đó để khỏi bị ăn đòn ở nhà thế mà lại bị đánh ở đó. Đi nhanh\n" +
                "chân lên một chút, nếu không chúng ta sẽ chẳng bao giờ đến nơi được đâu.”\n" +
                "   Tôi vẫn đang nghĩ về bác Edmundo. “Totoca, trẻ con nghỉ hưu phải\n" +
                "không?” “Gì cơ?”\n" +
                "   “Bác Edmundo chẳng làm gì cả mà vẫn có tiền. Bác không làm việc,\n" +
                "nhưng Tòa Thị chính vẫn trả tiền cho bác hằng tháng.”\n" +
                "   “Thì sao?”\n" +
                "   “À thì, trẻ con chẳng làm gì. Trẻ con ăn, ngủ và được cha mẹ cho tiền.”\n" +
                "   “Nghỉ hưu khác chứ, Zezé. Người nghỉ hưu đã làm việc trong một thời\n" +
                "gian dài rồi, tóc đã ngả bạc, chân chậm mắt mờ như bác Edmundo rồi.\n" +
                "   Nhưng đừng nghĩ về những thứ khó nhằn ấy nữa. Nếu em muốn học nhiều\n" +
                "điều từ bác ấy thì tốt thôi. Nhưng khi đi với anh thì không nhé.",2), onNextChapter = {}, onPreviousChapter = {})
    }
}