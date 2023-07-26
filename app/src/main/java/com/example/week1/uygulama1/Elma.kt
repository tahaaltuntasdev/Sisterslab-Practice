package com.example.week1.uygulama1

class Elma(meyveAdi : String, tatlilikDerecesi : Int, val vitaminDegeri: String) : Meyve(meyveAdi, tatlilikDerecesi) {
    fun yiyebilir(){
        println("$meyveAdi, yenebilir")
    }
}