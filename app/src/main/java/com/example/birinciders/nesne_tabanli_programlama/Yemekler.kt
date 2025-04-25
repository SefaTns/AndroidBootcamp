package com.example.birinciders.nesne_tabanli_programlama

data class Yemekler (private var id : Int, private var ad: String,private var fiyat: Int){

    public fun getId() : Int {
        return this.id
    }

    public fun getAd() : String {
        return this.ad
    }

    public fun getFiyat() : Int {
        return this.fiyat
    }

    public fun setAd(ad: String) : String {
        this.ad = ad
        return this.ad
    }

    fun bilgiAl() {
        println("---------------------")
        println("Id    : ${getId()}")
        println("Ad    : ${getAd()}")
        println("Fiyat : ${getFiyat()}")
    }
}