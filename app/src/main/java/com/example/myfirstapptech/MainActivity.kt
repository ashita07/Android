package com.example.myfirstapptech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTech=findViewById<Button>(R.id.buttonTech)
        buttonTech.setOnClickListener{
    //open a new page using intents
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)


        }
    }
}




