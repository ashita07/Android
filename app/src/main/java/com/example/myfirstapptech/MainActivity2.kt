package com.example.myfirstapptech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.net.Uri

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Android =findViewById<CardView>(R.id.card1)
        val devops=findViewById<CardView>(R.id.card2)
        val ios=findViewById<CardView>(R.id.card3)
        val FrontEnd=findViewById<CardView>(R.id.card4)
        val AIML=findViewById<CardView>(R.id.card6)
        val BackEnd =findViewById<CardView>(R.id.card5)

        Android.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.geeksforgeeks.org/best-way-to-become-android-developer-a-complete-roadmap/")
      startActivity(intent)}
            devops.setOnClickListener{
                val intent =Intent(Intent.ACTION_VIEW)
                intent.data=Uri.parse("https://github.com/milanm/DevOps-Roadmap")
                startActivity(intent)
            }
        ios.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://github.com/canopas/iOS-developer-roadmap")
        startActivity(intent)
        }
        FrontEnd.setOnClickListener{
          val intent=Intent(Intent.ACTION_VIEW)
          intent.data=Uri.parse("https://www.geeksforgeeks.org/frontend-developer-roadmap/")
          startActivity(intent)
        }
        AIML.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://cops-iitbhu.github.io/IG-website/beginnersRoadmap")
            startActivity(intent)
        }
        BackEnd.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://roadmap.sh/backend")
            startActivity(intent)
        }
        }
    }
