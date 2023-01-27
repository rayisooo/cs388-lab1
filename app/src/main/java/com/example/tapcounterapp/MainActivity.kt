package com.example.tapcounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count: Int = 90
        val button = findViewById<Button>(R.id.button)
        val button_two = findViewById<Button>(R.id.button2)
        var my_textView = findViewById<TextView>(R.id.textView2)
        button_two.isInvisible

        button.setOnClickListener{
            //change count value
            count = count + 1

            if(count == 99){
                count = count + 1
                button_two.isVisible
            }else if(count == 100){
                count = count + 1
            }
            else if(count > 100){
                button.text = "Plus 2"
                count = count + 2
            }

            //redisplay 
            my_textView.text = count.toString()

        }
    }



}