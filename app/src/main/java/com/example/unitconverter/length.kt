package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class length : AppCompatActivity() {
    lateinit var Txt_Km:TextView
    lateinit var Edt_Num1:EditText
    lateinit var Btn_Convert1:Button
    lateinit var Txt_Ans1:TextView
    lateinit var Txt_Mtrs:TextView
    lateinit var Edt_Num3:EditText
    lateinit var Btn_Convert2:Button
    lateinit var Txt_Ans2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)
        Txt_Km=findViewById(R.id.Txt_Km)
        Edt_Num1=findViewById(R.id.Edt_Num1)
        Btn_Convert1=findViewById(R.id.Btn_Convert1)
        Txt_Ans1=findViewById(R.id.Txt_Ans1)
        Txt_Mtrs=findViewById(R.id.Txt_Mtrs)
        Edt_Num3=findViewById(R.id.Edt_Num3)
        Btn_Convert2=findViewById(R.id.Btn_Convert2)
        Txt_Ans2=findViewById(R.id.Txt_Ans2)

        Btn_Convert1.setOnClickListener {
            var num=Edt_Num1.text.toString()
            var km=num.toDouble()
            var miles=0.001 * km
            Txt_Ans1.text=miles.toString()
        }

        Btn_Convert2.setOnClickListener {
            var num=Edt_Num3.text.toString()
            var mtrs=num.toDouble()
            var km=0.001 * mtrs
            Txt_Ans2.text=km.toString()
        }
    }
}