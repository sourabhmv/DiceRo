package com.example.dicero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


import java.util.*

class MainActivity : AppCompatActivity() {
    var diceimage : ImageView ?  =null;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener  { rollDice() }
        diceimage = findViewById(R.id.imageView)
    }

      private fun  rollDice () {
        val randomInt = Random().nextInt (6) + 1;


          val drawaleResource = when (randomInt) {
              1-> R.drawable.one
              2-> R.drawable.two
              3-> R.drawable.three
              4-> R.drawable.four
              5-> R.drawable.five
              else -> R.drawable.six

          }

          diceimage?.setImageResource(drawaleResource)


    }
}
