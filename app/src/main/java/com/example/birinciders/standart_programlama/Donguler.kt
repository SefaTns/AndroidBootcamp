package com.example.birinciders.standart_programlama

fun main() {

    for(i in 1..3) {
        println("Döngü 1 : $i")
    }

    for(i in 10..20 step 5) {
        println("Döngü 2 : $i")
    }

    for(i in 20 downTo 10 step 5) { // until son değeri hariç tutmak için kullanılır.
        println("Döngü 3 : $i")
    }



}