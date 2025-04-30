package com.example.birinciders.nesne_tabanli_programlama.collections

fun main() {

    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    for(meyve in meyveler) {
        println(meyve)
    }

    for((index, meyve) in meyveler.withIndex()) {
        println("${index + 1}. meyve : $meyve")
    }

    
}