package com.example.myapplication.kiosk

abstract open class Meunitem() {
    var name = ""
    var price = 0
    abstract fun displayinfo()
}