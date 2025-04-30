package com.example.birinciders.nesne_tabanli_programlama.collections

fun main() {

    val meyveler = ArrayList<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    var f1 = Filmler(1, "Babam ve Oğlum", 50)
    var f2 = Filmler(2, "Neşeli Hayatlar", 30)
    var f3 = Filmler(3, "Kış Uykusu", 80)

    var filmlerListesi = ArrayList<Filmler>()

    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for(film in filmlerListesi) {
        println("${film.id} : ${film.ad} -> ${film.fiyat}TL")
    }

    println("---- Fiyat Artan ----- ")

    val siralama1 = filmlerListesi.sortedWith(compareBy{it.fiyat})

    for(film in siralama1) {
        println("${film.id} : ${film.ad} -> ${film.fiyat}TL")
    }

    println("---- Fiyat Azalan ----- ")

    val siralama2 = filmlerListesi.sortedWith(compareByDescending { it.fiyat })

    for(film in siralama2) {
        println("${film.id} : ${film.ad} -> ${film.fiyat}TL")
    }

    println("----- Filtreleme ------")

    val filtreleme1 = filmlerListesi.filter { it.fiyat > 40 }

    for(film in filtreleme1) {
        println("${film.id} : ${film.ad} -> ${film.fiyat}TL")
    }
}