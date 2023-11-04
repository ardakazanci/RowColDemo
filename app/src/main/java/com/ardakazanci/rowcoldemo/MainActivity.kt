package com.ardakazanci.rowcoldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ardakazanci.rowcoldemo.ui.theme.RowColDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColDemoTheme {

            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Row {
        TextCell("1", Modifier.weight(weight = 0.2f, fill = true))
        TextCell("2", Modifier.weight(weight = 0.4f, fill = true))
        TextCell("3", Modifier.weight(weight = 0.3f, fill = true))
    }


   /*Row {
       Text(modifier = Modifier.alignByBaseline(),text = "Large Text", fontSize = 40.sp, fontWeight = FontWeight.Bold)
       Text(modifier = Modifier.alignByBaseline(),text = "Small Text", fontSize = 32.sp, fontWeight = FontWeight.Bold)
   }*/

    /*Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextCell(text = "1")
        TextCell(text = "2")
        TextCell(text = "3")
    }*/

    /*    Column {
            TextCell(text = "1")
            TextCell(text = "2")
            TextCell(text = "3")
            TextCell(text = "4")
        }*/

}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {
    val cellModifier = Modifier
        .padding(4.dp)
        .size(100.dp, 100.dp)
        .border(4.dp, color = Color.Black)

    Text(
        text = text,
        cellModifier.then(modifier),
        fontSize = 70.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Preview(showSystemUi = true)
@Composable
private fun RowTextCellPreview() {
    RowColDemoTheme {
        MainScreen()
    }
}


@Composable
fun ColTextCellPreview() {

}
