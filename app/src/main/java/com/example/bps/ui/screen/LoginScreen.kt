package com.example.bps.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bps.R

@Composable
fun LoginScreen(
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(android.graphics.Color.parseColor("#FFFFFF"))),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painterResource(R.drawable.logo_login),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(20.dp))

            var user by remember { mutableStateOf("") }
            var pwd by remember { mutableStateOf("") }
            TextField(
                value = user,
                { text -> user = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(74.dp)
                    .padding(horizontal = 20.dp, vertical = 8.dp)
                    .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(20)),
                shape = RoundedCornerShape(20),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                label = { Text("아이디", color = Color.Black, fontWeight = FontWeight.Bold) },
                placeholder = { Text("아이디를 입력해주세요.", color = Color(android.graphics.Color.parseColor("#979797"))) }
            )
            TextField(
                value = pwd,
                { text -> pwd = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(74.dp)
                    .padding(horizontal = 20.dp, vertical = 8.dp)
                    .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(20)),
                shape = RoundedCornerShape(20),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                label = { Text("비밀번호", color = Color.Black, fontWeight = FontWeight.Bold) },
                placeholder = { Text("비밀번호를 입력해주세요.", color = Color(android.graphics.Color.parseColor("#979797"))) }
            )
        }
        Text(
            text = "© 2023 OPENNOTE.  All rights reserved.",
            fontSize = 14.sp,
            color = Color(android.graphics.Color.parseColor("#979797"))
        )
    }
}