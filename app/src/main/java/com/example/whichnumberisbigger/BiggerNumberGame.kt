package com.example.whichnumberisbigger

import android.widget.Toast

class BiggerNumberGame(val lowerLimit : Int, val upperLimit: Int) {
    var leftNumber = 0
    var rightNumber = 0
    var score = 0

    //need fxn to generate random #s
    fun generateRandomNumber(){
        leftNumber = (lowerLimit..upperLimit).random()
        rightNumber = (lowerLimit..upperLimit).random()
    }
    //need fxn to check answer, update score, and return a message
    //kotlin: fun fxnName(parameterVar : parameterType) : returnType
    fun checkAnswer(answer : Int) : String {

        if(answer > rightNumber){
            score++
            generateRandomNumber()
            return "I guess you were paying attention in math class."
        }
        else if(answer > leftNumber){
            score++
            generateRandomNumber()
            return "I guess you were paying attention in math class."

        }
        else{
            generateRandomNumber()
            return "Please go back to school."
        }
    }
}