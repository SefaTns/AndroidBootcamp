package com.example.birinciders.nesne_tabanli_programlama

fun main() {

    var y1 = Yemekler(100, "Kofte", 249)

    println("---------------------")
    println("Id    : ${y1.getId()}")
    println("Ad    : ${y1.getAd()}")
    println("Fiyat : ${y1.getFiyat()}")

    var y2 = Yemekler(200, "Baklava", 300)

    println("---------------------")
    println("Id    : ${y2.getId()}")
    println("Ad    : ${y2.getAd()}")
    println("Fiyat : ${y2.getFiyat()}")

    y1.setAd("Akcabat Kofte")
    y1.bilgiAl()


}