package com.example.birinciders.nesne_tabanli_programlama.collections

fun main() {

    val iller = HashMap<Int, String>()

    iller[34] = "İSTANBUL"
    iller[6] = "ANKARA"
    iller[42] = "KONYA"

    println(iller)

    for((anahtar, deger) in iller) {
        println("$anahtar -> $deger")
    }

    iller.remove(42)

    println(iller)

}