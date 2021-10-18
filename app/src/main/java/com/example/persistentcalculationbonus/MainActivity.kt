package com.example.persistentcalculationbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etDoubleNumber:EditText
    lateinit var etFloatNumber:EditText
    lateinit var btMultiply:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etDoubleNumber=findViewById(R.id.etDoubleNumber)
        etFloatNumber=findViewById(R.id.etFloatNumber)
        btMultiply=findViewById(R.id.btMultiply)
        tvResult=findViewById(R.id.tvResult)

        btMultiply.setOnClickListener {
            val number1=etDoubleNumber.text.toString().toDouble()
            val number2=etFloatNumber.text.toString().toFloat()
            etDoubleNumber.setText("")
            etFloatNumber.setText("")
            tvResult.setText((number1*number2).toString())
        }
    }
}