package com.ardadeniz.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increase(view : View){ // method for increase the counter
        val textView = findViewById<TextView>(R.id.textView) // assignment of textview ıd
        val button2 = findViewById<Button>(R.id.button2)     // assignment of button2 ıd
        counter++
        textView.setText(counter.toString()) //text update
        if(counter >= 1){
            button2.isEnabled = true // enabling of button2
        }
    }

    fun decrease(view : View){  // method for decrease the counter
        val button2 = findViewById<Button>(R.id.button2)  // assignment of button2 ıd
        if(counter < 1){
            button2.isEnabled = false //disabling of button2
        }
        if(button2.isEnabled){
            val textView = findViewById<TextView>(R.id.textView) // assignment of textview ıd
            counter--
            textView.setText(counter.toString()) // text update
        }
    }

}