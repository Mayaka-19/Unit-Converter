package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class weight : AppCompatActivity() {
    lateinit var Txt_Kg:TextView
    lateinit var Edt_Num:EditText
    lateinit var Btn_Convert1:Button
    lateinit var Txt_Ans1:TextView
    lateinit var Txt_Gram:TextView
    lateinit var Edt_Num2:EditText
    lateinit var Btn_Convert2:Button
    lateinit var Txt_Ans2:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)
        Txt_Kg=findViewById(R.id.Txt_Kg)
        Edt_Num=findViewById(R.id.Edt_Num)
        Btn_Convert1=findViewById(R.id.Btn_Convert1)
        Txt_Ans1=findViewById(R.id.Txt_Ans1)
        Txt_Gram=findViewById(R.id.Txt_Gram)
        Edt_Num2=findViewById(R.id.Edt_Num2)
        Btn_Convert2=findViewById(R.id.Btn_Convert2)
        Txt_Ans2=findViewById(R.id.Txt_Ans2)

        Btn_Convert1.setOnClickListener {
            var num=Edt_Num.text.toString()
            var kg=num.toDouble()
            var pounds=2.20462 * kg
            Txt_Ans1.text=pounds.toString()
        }

        Btn_Convert2.setOnClickListener {
            var num=Edt_Num2.text.toString()
            var gram=num.toDouble()
            var kg=0.0001 * gram
            Txt_Ans2.text=kg.toString()
        }

    }
}

