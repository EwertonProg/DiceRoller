package br.exemple.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var imageDice:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageDice = findViewById(R.id.image_Dice)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.text = "Lets Roll!!"
        rollButton.setOnClickListener { diceRoller() }
    }

    private fun diceRoller() {
        imageDice.setImageResource(when(Random.nextInt(1..6)){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        })
    }
}
