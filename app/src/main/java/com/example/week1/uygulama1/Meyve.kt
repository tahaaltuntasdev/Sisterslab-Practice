package com.example.week1.uygulama1

open class Meyve (var meyveAdi :String, var tatlilikDerecesi: Int ){
    open fun tanimla(){
        println("$meyveAdi, tatlılık derecesi: $tatlilikDerecesi")
    }
}