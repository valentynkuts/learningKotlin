package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// to have access to IDs as  buttonId, textView ...
// build.gradle (:app) → apply plugin: 'kotlin-android-extensions'
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button and says that type is Button
        //val btnClickMe = findViewById(R.id.buttonId) as Button    // Alt+Shift+Enter to import class
        // get reference to text
        //var myTextView = findViewById(R.id.textView) as TextView
        var timesClicking = 0
        // set on-click listener
        /*
        btnClickMe.setOnClickListener {
            // to change text after clicking
            //myTextView.text = "Test"
            timesClicking ++
            myTextView.text = timesClicking.toString()

            // to see message 'Hi, user' after clicking
            Toast.makeText(this@MainActivity, "Hi, User.", Toast.LENGTH_SHORT).show()
        }
         */

        // or it can be replace by id of the button

        buttonId.setOnClickListener {
            // to change text after clicking
            //myTextView.text = "Test"
            timesClicking ++
            textView.text = timesClicking.toString()

            // to see message 'Hi, user' after clicking
            Toast.makeText(this@MainActivity, "Hi, User.", Toast.LENGTH_SHORT).show()
        }


    }

}