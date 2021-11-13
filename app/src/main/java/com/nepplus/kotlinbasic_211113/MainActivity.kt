package com.nepplus.kotlinbasic_211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {
            //            이 내부의 코드는, 로그찍기 버튼을 누를때마다 실행됨.

            Log.d("메인화면","로그찍기 버튼 누름")
            Log.e("메인화면", "e로 로그찍어보기")
            Log.
        }




    }
}