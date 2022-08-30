package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class currency : AppCompatActivity() {
    lateinit var Txt_Ksh:TextView
    lateinit var Edt_Num1:EditText
    lateinit var Btn_Convert1:Button
    lateinit var Txt_Ans1:TextView
    lateinit var Txt_Euro:TextView
    lateinit var Edt_Num3:EditText
    lateinit var Btn_convert2:Button
    lateinit var Txt_Ans2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)
        Txt_Ksh=findViewById(R.id.Txt_Ksh)
        Edt_Num1=findViewById(R.id.Edt_Num1)
        Btn_Convert1=findViewById(R.id.Btn_Convert1)
        Txt_Ans1=findViewById(R.id.Txt_Ans1)
        Txt_Euro=findViewById(R.id.Txt_Euro)
        Edt_Num3=findViewById(R.id.Edt_Num3)
        Btn_convert2=findViewById(R.id.Btn_Convert2)
        Txt_Ans2=findViewById(R.id.Txt_Ans2)

        Btn_Convert1.setOnClickListener {
            var num=Edt_Num1.text.toString()
            var ksh=num.toDouble()
            var dollar=0.0083 * ksh
            Txt_Ans1.text=dollar.toString()
        }

        Btn_convert2.setOnClickListener {
            var num=Edt_Num3.text.toString()
            var euro=num.toDouble()
            var yens=136.43 * euro
            Txt_Ans2.text=yens.toString()
        }
    }
}