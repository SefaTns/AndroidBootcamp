package com.example.birinciders.degiskenler

import kotlin.math.roundToInt

class Ornek {
    private var ad: String = "Sefa"

    constructor(ad : String) {
        this.ad = ad
    }

    fun getAd(): String {
        return this.ad
    }
}

fun main() {

    val id = 1
    val ad = "Mont"
    val puan = 4.7
    val fiyat = 4500
    val stokDurum = true

    println("id : $id")
    println("ad : $ad")
    println("puan : $puan")
    println("fiyat : $fiyat")
    println("stokdurum : $stokDurum")

    val c = 89.56
    println(c.toInt())
    println(c.roundToInt())

    val convert : String = "15"
    val x = convert.toIntOrNull()

    if(x == null)
        println("Hatalı sayı")
    else
        println("Sayi :  $x")


    var integer: Int = 100
    println(integer::class.java)

    val ornek = Ornek("Sude")
    println(ornek.getAd())

}
