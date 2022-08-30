package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class area : AppCompatActivity() {
    lateinit var Txt_Acre:TextView
    lateinit var Edt_Num1:EditText
    lateinit var Btn_Convert1:Button
    lateinit var Txt_Ans1:TextView
    lateinit var Txt_Metres:TextView
    lateinit var Edt_Num3:EditText
    lateinit var Btn_Convert2:Button
    lateinit var Txt_Ans2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)
        Txt_Acre=findViewById(R.id.Txt_Acre)
        Edt_Num1=findViewById(R.id.Edt_Num1)
        Btn_Convert1=findViewById(R.id.Btn_Convert1)
        Txt_Ans1=findViewById(R.id.Txt_Ans1)
        Txt_Metres=findViewById(R.id.Txt_Metres)
        Edt_Num3=findViewById(R.id.Edt_Num3)
        Btn_Convert2=findViewById(R.id.Btn_Convert2)
        Txt_Ans2=findViewById(R.id.Txt_Ans2)

        Btn_Convert1.setOnClickListener {
            var num=Edt_Num1.text.toString()
            var acre=num.toDouble()
            var hectare=0.40468564224 * acre
            Txt_Ans1.text=hectare.toString()
        }

        Btn_Convert2.setOnClickListener {
            var num=Edt_Num3.text.toString()
            var meters=num.toDouble()
            var acres=0.0002471 * meters
            Txt_Ans2.text=acres.toString()
        }
    }
}