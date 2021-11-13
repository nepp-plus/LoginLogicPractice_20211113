package com.neppplus.loginlogicpractice_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogIn.setOnClickListener {

//            ID / PW에 입력된 내용 (text) -> 변수에 저장해두자.

            val inputId =  edtId.text.toString()
            val inputPw =  edtPassword.text.toString()

//            조건문으로 ID / PW이 맞는지? 질문
//            1. inputId 값이, "admin"인가?
//            2. 1과 동시에 만족,  inputPw의 값이, "qwer" 인가?

            if ( inputId == "admin" && inputPw == "qwer") {

                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()

            }
            else {
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }


        }

    }
}