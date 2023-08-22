package com.example.bps.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
    ) {
        Box(modifier = Modifier
            .padding(horizontal = 20.dp)
            .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Image(
                    painterResource(R.drawable.logo_login),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(20.dp))

                var user by remember { mutableStateOf("") }
                var pwd by remember { mutableStateOf("") }
                var pwdVisible by rememberSaveable { mutableStateOf(false) }
                val focusManager = LocalFocusManager.current
                TextField(
                    value = user,
                    onValueChange = { user = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(74.dp)
                        .padding(vertical = 8.dp)
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
                    placeholder = { Text("아이디를 입력해주세요.", color = Color(android.graphics.Color.parseColor("#979797"))) },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
                )
                TextField(
                    value = pwd,
                    onValueChange = { pwd = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(74.dp)
                        .padding(vertical = 8.dp)
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
                    placeholder = { Text("비밀번호를 입력해주세요.", color = Color(android.graphics.Color.parseColor("#979797"))) },
                    visualTransformation = if (pwdVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions( onDone = { focusManager.clearFocus() }),
                    trailingIcon = {
                        val image = if (pwdVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                        val description = if (pwdVisible) "Hide password" else "Show password"
                        IconButton(onClick = { pwdVisible = !pwdVisible }) {
                            Icon(imageVector = image, description)
                        }
                    }
                )
                Button(
                    onClick = { /*TODO*/ },
                    Modifier
                        .fillMaxWidth()
                        .height(74.dp)
                        .padding(vertical = 8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(android.graphics.Color.parseColor("#00A0E9"))),
                    shape = RoundedCornerShape(20),
                    ) {
                    Text(
                        text = "로그인",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Row(
                    Modifier
                        .height(40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "아이디 찾기",
                            color = Color.Gray
                        )
                    }
                    Divider(
                        color = Color.Black,
                        modifier = Modifier
                            .width(1.dp)
                            .height(10.dp)
                    )
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "비밀번호 찾기",
                            color = Color.Gray
                        )
                    }
                }
            }
        }
        Box(modifier = Modifier.height(40.dp)) {
            Text(
                text = "© 2023 OPENNOTE.  All rights reserved.",
                fontSize = 14.sp,
                color = Color(android.graphics.Color.parseColor("#979797"))
            )
        }
    }
}