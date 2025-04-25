package com.example.birinciders.standart_programlama

fun main() {

    val yas = 19

    if(yas >= 18) {
        println("Reşitsiniz")
    }
    else {
        println("Reşit Değilsiniz")
    }

    val number = 9

    when {
        number > 0 && number < 10 -> println("Sayı bir rakamdır")
        else -> println("Rakam değildir")
    }


}