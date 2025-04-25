package com.example.birinciders.nesne_tabanli_programlama

class Fonksiyonlar {

    fun selamla(isim : String) {
        val sonuc = "Merhaba $isim"
        println("Sonuc : $sonuc")
    }

    fun selamla2(isim: String) : String {
        return "Merhaba " + isim
    }
}