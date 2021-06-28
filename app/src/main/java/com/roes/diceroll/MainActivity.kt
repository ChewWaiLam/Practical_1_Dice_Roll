package com.roes.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var randomInt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.btn_Roll)
        val btnCountUp: Button = findViewById(R.id.buttonCountUp)
        val btnReset: Button = findViewById(R.id.buttonReset)

        rollbutton.setOnClickListener(){
            RandomInt()
        }

        btnCountUp.setOnClickListener(){
            Increment()
        }

        btnReset.setOnClickListener(){
            randomInt = 0
            ShowString()
        }

    }

    private fun RandomInt() {
        randomInt = (1..6).random()
        ShowString()

    }

    private fun Increment() {
        if (randomInt >= 6) {
            randomInt = 6
        } else {
            randomInt += 1
        }
        ShowString()
    }

    private fun ShowString() {
        val txtResult: TextView = findViewById(R.id.txt_Result)
        txtResult.text = randomInt.toString()
    }

}
