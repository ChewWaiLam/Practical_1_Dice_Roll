package com.roes.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.btn_Roll)

            rollbutton.setOnClickListener(){
            RandomInt()
        }
    }

    private fun RandomInt() {
        val randomInt = (1..6).random()
        val txtResult: TextView = findViewById(R.id.txt_Result)
        txtResult.text = randomInt.toString()
    }

}
