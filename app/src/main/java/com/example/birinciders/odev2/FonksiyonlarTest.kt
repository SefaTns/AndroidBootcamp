package com.example.birinciders.odev2

fun main() {

    var fonksiyon = Fonksiyonlar()

    println("Girilen Derecenin Fahrenhiet Karşılığı : ${fonksiyon.fahrenihiet(30.0)}")

    fonksiyon.dikdortgenCevre(5,6)

    println("Girilen Sayının Faktöriyeli : ${fonksiyon.faktoriyel(5)}")

    var kelime = "Sabahat"
    fonksiyon.harfBulma(kelime)

    println("İç Açılar Toplamı : ${fonksiyon.icAciHesapla(4)}")

    println("Hesaplanan Maaş : ${fonksiyon.maasHesabi(25)}")
    println("Girilen Kota Karşılığındaki Fatura : ${fonksiyon.internetUcret(55)}")
}