package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button    // Alt+Shift+Enter to import class
        // get reference to text
        var myTextView = findViewById(R.id.textView) as TextView
        var timesClicking = 0
        // set on-click listener
        btn_click_me.setOnClickListener {
            // to change text after clicking
            //myTextView.text = "Test"
            timesClicking ++
            myTextView.text = timesClicking.toString()

            // to see message 'Hi, user' after clicking
            Toast.makeText(this@MainActivity, "Hi, User.", Toast.LENGTH_SHORT).show()
        }
    }

}