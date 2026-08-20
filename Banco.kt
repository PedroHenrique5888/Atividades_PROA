package com.example.appdesorteio
import java.util.Scanner
import kotlin.system.exitProcess

var saldo = 100.5
var valor: Double = 0.0
val senha = 3589
var escolha: Int = 0
var nome: String = ""
var dep = 0.0
var entradaUsuario = Scanner(System.`in`)

fun man(){
    inicio()
}

fun inicio() {

    println("Informe seu nome: ")
    nome = entradaUsuario.nextLine()

    println("Escolha uma opção:")
    println("1 - Ver saldo")
    println("2 - Ver extrato")
    println("3 - Fazer depósito")
    println("4 - Fazer saque")
    println("5 - Fazer transfrencia")
    println("6 - Sair")
    escolha = entradaUsuario.nextInt()

    //var lista = arrayOf("Saldo","Extrato","Deposito","Saque","Transferencia")

    when (escolha) {
        1 -> {
            verSaldo()
        }

        2 -> {
            verExtrato()
        }

        3 -> {
            fazerDeposito()
        }

        4 -> {
            fazerSaque()
        }

        5 -> {
            fazerTransferencia()
        }

        6 -> {
            sair()
        }

        else -> erro()
    }
}
    fun verSaldo() {
        println("Digite sua senha:")
        val senhaU = entradaUsuario.nextInt()
        if (senhaU != senha){
            verSaldo()
        }

    println("Seu saldo atual é: $saldo")
        inicio()
    }
    fun verExtrato(){

        println("Digite sua senha:")
        val senhaU = entradaUsuario.nextInt()
        if (senhaU != senha){
            verExtrato()
        }

        println("Seu último depósito foi de: $dep")
        inicio()
    }

    fun fazerDeposito() {
        val deposito: Double
        print("Qual o valor para depósito? ")
        deposito = entradaUsuario.nextDouble()

        if (deposito <= 0) {
            println("Por favor, informe um número válido.")
            fazerDeposito()
        } else {
            saldo = saldo + deposito
            dep = dep + deposito
            verSaldo()
        }
    }

    fun fazerSaque() {
        println("Digite sua senha:")
        val senhaU = entradaUsuario.nextInt()
        if (senhaU != senha){
            fazerSaque()
        }
        val saque: Double
        print("Qual o valor para saque? ")
        saque = entradaUsuario.nextDouble()

        if (saque <= 0) {
            println("Por favor, informe um número válido.")
            fazerSaque()
        }else if(saque > saldo){
            println("Por favor, informe um número válido.")
            fazerSaque()
        }
        else {
            saldo = saldo - saque
            verSaldo()
        }
    }
    fun fazerTransferencia() {

        println("Digite sua senha:")
        val senhaU = entradaUsuario.nextInt()
        if (senhaU != senha) {
            fazerTransferencia()
        }
        val trf: Double

        println("Qual o número da conta para transferência:")
        trf = entradaUsuario.nextDouble()

        if (trf <= -1) {
            println("Qual o número da conta para transferência:")
            var trf = entradaUsuario.nextDouble()
        }

        println("Digite o valor que deseja transferir: ")
        valor = entradaUsuario.nextDouble()

        if (valor <= 0) {
            println("Por favor, informe um número válido.")
            fazerTransferencia()
        } else if (valor > saldo) {
            println("Por favor, informe um número válido.(SEU POBRE LISO)")
            fazerTransferencia()
        } else {
            saldo = saldo - valor
            verSaldo()
        }
    }
    fun erro() {
        println("Por favor, informe um número entre 1 a 6.")
        inicio()
    }

    fun sair() {
        print("Você deseja sair? (S/N)")
        // Usando readln e Elvis operator -> Operador de coalescência nula
        val confirma = readln().uppercase()
        // Locale -> Localização do usuário para converter para maiúsculo
        //val confirma = readLine()?.uppercase(Locale.getDefault())

        when (confirma) {
            "S" -> exitProcess(0) //Hasta la vista, baby
            "N" -> inicio() // Volta para o início
            else -> sair()
        }

    }