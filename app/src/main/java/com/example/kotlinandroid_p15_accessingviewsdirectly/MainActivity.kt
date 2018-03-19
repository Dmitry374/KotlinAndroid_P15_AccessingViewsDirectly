package com.example.kotlinandroid_p15_accessingviewsdirectly

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGreet.setOnClickListener {
            val name = edName.text.toString()
            tvGreet.text = "Hello $name"
            edName.text.clear()
        }


    }
}
