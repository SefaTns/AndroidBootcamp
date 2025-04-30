package com.example.birinciders.nesne_tabanli_programlama

fun main() {
    ucretHesapla(EnumKullanimi.ORTA, 10)
}

fun ucretHesapla(boyut : EnumKullanimi, adet : Int) {
    when(boyut) {
        EnumKullanimi.KUCUK -> println("Ucret : " + adet * 104)
        EnumKullanimi.ORTA -> println("Ucret : " + adet * 207)
        EnumKullanimi.BUYUK -> println("Ucret : " + adet * 309)
    }
}