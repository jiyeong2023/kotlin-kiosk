package com.example.myapplication.kiosk

class PorkCutletSet {
    var name = ""
    var price = 0
    constructor(inputname:String,inputPrice:Int){
        name = inputname
        price = inputPrice
    }
    fun info() {
        println("${name}이고, ${price}원입니다")
    }
}