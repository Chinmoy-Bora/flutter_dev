package com.example.applicationform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textview=findViewById<TextView>(R.id.textview)

        var obtainedName=""
        obtainedName= intent.getStringExtra("Refer-name").toString()
        textview.text="Welcome " + obtainedName
    }
}