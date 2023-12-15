package com.example.myapplication.kiosk

class fishMeal {
    var name = ""
    var price = 0
    constructor(inputname:String,inputprice:Int){
        name = inputname
        price = inputprice
    }
    fun info() {
        println("${name}이고, ${price}원입니다")
    }
}


