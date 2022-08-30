package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class temperature : AppCompatActivity() {
    lateinit var Txt_Deg:TextView
    lateinit var Edt_Num3:EditText
    lateinit var Btn_Convert1:Button
    lateinit var Txt_Ans1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature)
        Txt_Deg=findViewById(R.id.Txt_Deg)
        Edt_Num3=findViewById(R.id.Edt_Num3)
        Btn_Convert1=findViewById(R.id.Btn_Convert1)
        Txt_Ans1=findViewById(R.id.Txt_Ans1)

        Btn_Convert1.setOnClickListener {
            var num=Edt_Num3.text.toString()
            var deg=num.toDouble()
            var kelvin=273.00 + deg
            Txt_Ans1.text=kelvin.toString()
        }
    }
}