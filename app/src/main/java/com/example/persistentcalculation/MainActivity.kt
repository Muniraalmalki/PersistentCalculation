package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etDouble:EditText
    private lateinit var etFloat:EditText
    private lateinit var multiplyButton:Button
    private lateinit var tvResult:TextView
    var answer = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etDouble = findViewById(R.id.etNumberD)
        etFloat = findViewById(R.id.etNunberF)
        multiplyButton = findViewById(R.id.mulButton)
        tvResult = findViewById(R.id.tvResult)

        multiplyButton.setOnClickListener {
            try {
                answer = etDouble.text.toString().toDouble() * etFloat.text.toString().toFloat()
                tvResult.text = answer.toString()
            }catch (e:Exception){
                Toast.makeText(this,"please enter only number ",Toast.LENGTH_LONG).show()
            }
        }
    }
}