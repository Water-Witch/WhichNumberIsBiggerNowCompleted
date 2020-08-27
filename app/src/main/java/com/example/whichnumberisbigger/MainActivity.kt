package com.example.whichnumberisbigger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var game = BiggerNumberGame(0, 100)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //do setup here
        //generate random #
        game.generateRandomNumber()
        update()
        //assign those numbers to the buttons
        //set up an initial score to 0
    }

    fun onLeftClick(view: View) {
        val scrererkaekf = game.checkAnswer(button_main_left.text.toString().toInt())
        Toast.makeText(this, scrererkaekf, Toast.LENGTH_SHORT).show()
        update()
        }

    fun onRightClick(view: View) {
        val ajkfd = game.checkAnswer(button_main_right.text.toString().toInt())
        Toast.makeText(this, ajkfd, Toast.LENGTH_SHORT).show()
        update()

    }
    fun update(){
        textView_main_score.text = game.score.toString()
        button_main_left.text = game.leftNumber.toString()
        button_main_right.text = game.rightNumber.toString()
    }
}