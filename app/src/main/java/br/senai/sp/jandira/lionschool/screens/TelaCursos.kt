package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.lionschool.screens.components.CursosCard
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R


@Composable

fun TelaCursos(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_lion),
                    contentDescription = stringResource(R.string.school),
                    modifier = Modifier
                        .width(45.dp)
                        .height(56.dp)
                        .padding(vertical = 5.dp)
                )
                Text(
                    text = stringResource(R.string.school),
                    fontSize = 15.sp,
                    color = colorResource(R.color.blue),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier
                        .width(50.dp)
                        .padding(bottom = 10.dp)
                )
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.yellow)
                )
            ){}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.find_your),
                    color = colorResource(R.color.gray)
                )

                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = colorResource(R.color.gray)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.yellow),
                    unfocusedContainerColor = colorResource(R.color.gray_claro)
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
                Text(
                    text = stringResource(R.string.courses),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.blue),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row (
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    CursosCard(
                        Text1 = "DS",
                        Text2 = "Desenvolvimento de Sistemas",
                        Text3 = "Learn to develop web and mobile applications.",
                        Text4 = "3 semesters",
                        imagem = painterResource(R.drawable.ds)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    CursosCard(
                        Text1 = "RDS",
                        Text2 = "Redes de Computadores",
                        Text3 = "Learn to design communication networks.",
                        Text4 = "3 semesters",
                        imagem = painterResource(R.drawable.rede)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    CursosCard(
                        Text1 = "ELE",
                        Text2 = "Eletroeletrônica",
                        Text3 = "LLearn to design communication networks.",
                        Text4 = "3 semesters",
                        imagem = painterResource(R.drawable.ele)
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaCursosPreview(){
    TelaCursos()
}