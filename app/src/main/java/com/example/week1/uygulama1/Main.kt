package com.example.week1.uygulama1

fun main(){
    val elma = Elma("Elma",8,"C vitamini")
    elma.tanimla()

    println("Vitamin Değeri: ${elma.vitaminDegeri}")

    elma.yiyebilir()

}