package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Txt_Currency:TextView
    lateinit var Txt_Length:TextView
    lateinit var Txt_Weight:TextView
    lateinit var Txt_Volume:TextView
    lateinit var Txt_Area:TextView
    lateinit var Txt_Temp:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_Currency=findViewById(R.id.Txt_Currency)
        Txt_Length=findViewById(R.id.Txt_Length)
        Txt_Weight=findViewById(R.id.Txt_Weight)
        Txt_Volume=findViewById(R.id.Txt_Volume)
        Txt_Area=findViewById(R.id.Txt_Area)
        Txt_Temp=findViewById(R.id.Txt_Temp)

        Txt_Weight.setOnClickListener {
            val intent=Intent(this,weight::class.java)
            startActivity(intent)
        }

        Txt_Volume.setOnClickListener {
            val intent=Intent(this,volume::class.java)
            startActivity(intent)
        }

        Txt_Area.setOnClickListener {
            val intent=Intent(this,area::class.java)
            startActivity(intent)
        }

        Txt_Currency.setOnClickListener {
            val intent=Intent(this,currency::class.java)
            startActivity(intent)
        }

        Txt_Length.setOnClickListener {
            val intent=Intent(this,length::class.java)
            startActivity(intent)
        }

        Txt_Temp.setOnClickListener {
            val intent=Intent(this,temperature::class.java)
            startActivity(intent)
        }


    }
}