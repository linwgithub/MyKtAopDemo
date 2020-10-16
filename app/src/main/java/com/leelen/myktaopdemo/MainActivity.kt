package com.leelen.myktaopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.leelen.myktaopdemo.aop.AopOnclick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<TextView>(R.id.btn_main)
        btn.setOnClickListener{
            aopClick()
        }
    }

    @AopOnclick(2000)
    fun aopClick() {
        Log.e("main", "aopClick: 点击事件")
    }

}