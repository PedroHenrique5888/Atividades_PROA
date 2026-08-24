package com.example.appdesorteio
import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    var entrada = ""
    val frutas = mutableListOf("MAÇÃ", "MELANCIA", "BANANA")
    println(frutas)

    println("Escolha uma das frutas")
    entrada = readln().lowercase()

    while (entrada != "PARE" && frutas.isNotEmpty()){
        val fruits = frutas.map { it.lowercase() }
        println("Escolha")
        entrada = readln().lowercase()

        if(entrada in frutas || entrada in fruits){
            val frutaNova = frutas.find { it.lowercase() == entrada }
            frutas.remove(frutaNova!!)
            println("Fruta removida da lista $frutas")
        }else{
            println("Fruta indiponínel")
        }
    }
    if (entrada == "PARE"){
        println(frutas)
    }else{
        println("Lista de compras finalizada")
    }

}