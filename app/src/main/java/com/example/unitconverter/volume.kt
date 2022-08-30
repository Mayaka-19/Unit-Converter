package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class volume : AppCompatActivity() {
    lateinit var Txt_M:TextView
    lateinit var Edt_Num1:EditText
    lateinit var Btn_Convert1:Button
    lateinit var Txt_Ans1:TextView
    lateinit var Txt_Cm:TextView
    lateinit var Edt_Num3:EditText
    lateinit var Btn_Convert2:Button
    lateinit var Txt_Ans2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)
        Txt_M=findViewById(R.id.Txt_M)
        Edt_Num1=findViewById(R.id.Edt_Num1)
        Btn_Convert1=findViewById(R.id.Btn_Convert1)
        Txt_Ans1=findViewById(R.id.Txt_Ans1)
        Txt_Cm=findViewById(R.id.Txt_Cm)
        Edt_Num3=findViewById(R.id.Edt_Num3)
        Btn_Convert2=findViewById(R.id.Btn_Convert2)
        Txt_Ans2=findViewById(R.id.Txt_Ans2)

        Btn_Convert1.setOnClickListener {
            var num=Edt_Num1.text.toString()
            var meters=num.toDouble()
            var litres=1000 * meters
            Txt_Ans1.text=litres.toString()
        }

        Btn_Convert2.setOnClickListener {
            var num=Edt_Num3.text.toString()
            var ct=num.toDouble()
            var meters=0.000001 * ct
            Txt_Ans2.text=meters.toString()
        }
    }
}