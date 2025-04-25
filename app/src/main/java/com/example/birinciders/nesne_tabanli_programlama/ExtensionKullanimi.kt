package com.example.birinciders.nesne_tabanli_programlama

fun main() {

    var sonuc = 5 carp 3
    println("Sonuc : $sonuc")
}

infix fun Int.carp(sayi :Int) : Int {
    return this * sayi
}