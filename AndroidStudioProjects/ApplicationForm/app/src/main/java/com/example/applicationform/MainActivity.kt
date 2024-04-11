package com.example.applicationform


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameTextBox=findViewById<TextView>(R.id.nameTextBox)
        val mySendButton=findViewById<Button>(R.id.mySendButton)
      var name = " "
        name =nameTextBox.text.toString()

        mySendButton.setOnClickListener{
            name=nameTextBox.text.toString()
            Toast.makeText(applicationContext, name, Toast.LENGTH_SHORT).show()
            val intent=Intent(this,MainActivity2::class.java).apply {
                putExtra("Refer-name",name)
            }
            startActivity(intent)
        }



    }
}





