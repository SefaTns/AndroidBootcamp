package com.example.birinciders.odev2

class Fonksiyonlar {

    fun fahrenihiet(derece : Double) : Double{
        return derece * 1.8 + 32
    }

    fun dikdortgenCevre(x : Int, y : Int) {
        var cevre = x * 2 + y * 2
        println("Dikdörtgenin Çevresi : $cevre")
    }

    fun faktoriyel(sayi : Int) : Int{

        if(sayi <= 0)
            return 0

        if(sayi == 1)
            return 1
        else
            return sayi * faktoriyel(sayi - 1)
    }

    fun harfBulma(kelime : String) {

        var sayac = 0

        for(i in kelime) {
            if(i == 'a')
                sayac++
        }
        println("Girilen kelime : $kelime")
        println("Girilen kelimede $sayac adet a harfi vardır.")
    }

    fun icAciHesapla(kenarSayisi : Int) : Int{
        return (kenarSayisi - 2) * 180
    }

    fun maasHesabi(gunSayisi : Int) : Int {

        var toplamCalismaSaati = gunSayisi * 8

        val calismaSaatUcret = 10
        val mesaiSaatUcret = 20

        var maas = 0
        var mesaiUcret = 0
        var normalUcret = 0

        if(toplamCalismaSaati > 160)
            mesaiUcret = (toplamCalismaSaati - 160) * mesaiSaatUcret

        normalUcret = 160 * calismaSaatUcret
        maas = normalUcret + mesaiUcret
        return maas
    }

    fun internetUcret(kota : Int) : Int {

        var kotaAsimUcreti = 0

        if(kota > 50)
            kotaAsimUcreti = (kota - 50) * 4

        var fatura = 100 + kotaAsimUcreti
        return fatura
    }
}