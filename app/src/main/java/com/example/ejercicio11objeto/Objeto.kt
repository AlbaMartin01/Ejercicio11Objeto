package com.example.ejercicio11objeto

class Objeto(private var peso: Int, private var valor: Int, private var vida: Int){

    fun getPeso():Int{
        return peso
    }

    fun getValor():Int{
        return valor
    }

    fun getVida():Int{
        return vida
    }
}