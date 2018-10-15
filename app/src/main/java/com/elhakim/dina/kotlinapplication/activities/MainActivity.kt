package com.elhakim.dina.kotlinapplication.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.elhakim.dina.kotlinapplication.R

class MainActivity : AppCompatActivity() {

    private var intVar = 9
    private var floatVar: Float = 0F
    private var strVar = "Hello"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: View = findViewById(R.id.text_view)

        floatVar = intVar.toFloat()  //explicit casting

        if (textView is TextView) {    //smart casting
            textView.text = String.format(getString(R.string.test_placeholder_str), strVar, floatVar)
        }
    }
}
