import kotlin.system.exitProcess

var saldo = 100.5 // Float
var dep = 0.0
var nome = ""
fun main() {
    name()
    inicio()
}

fun name(){
    println("Digite seu nome: ")
    nome = readln()
    println("Olá $nome é um prazer ter você por aqui!")
}
fun inicio() {
    println("Escolha uma opção:")
    println("1 - Ver saldo")
    println("2 - Ver extrato")
    println("3 - Fazer depósito")
    println("4 - Fazer saque")
    println("5 - Fazer transferência")
    println("6 - Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerDeposito()
        4 -> fazerSaque()
        5 -> transferencia()
        6 -> sair()
        else -> erro()
    }
}

fun verSaldo() {
    println("Digite sua senha:")
    var senha = readln().toInt()
    while (senha != 3589){
        println("Digite sua senha:")
        senha = readln().toInt()
    }
    println("Seu saldo atual é: $saldo")
    inicio()
}
fun verExtrato(){
    println("Digite sua senha:")
    var senha = readln().toInt()
    while (senha != 3589){
        println("Digite sua senha:")
        senha = readln().toInt()
    }
        println("Saldo inicial: R$ 150.00")
        println("Depósito realizado: R$ $dep")
        println("Compra no mercado: R$ -35.00")
        println("Compra na farmácia: R$ -20.00")
        println("Depósito: R$ 100.00")
        inicio()
}
fun fazerDeposito() {
    print("Qual o valor para depósito:")
    val deposito = readln().toFloatOrNull()
    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    } else {
        saldo += deposito
        dep += deposito
        verSaldo()
    }
}

fun fazerSaque() {
    var senha: Int
    println("Digite sua senha:")
    senha = readln().toInt()
    while (senha != 3589) {
        senha = readln().toInt()
        print("Qual o valor para saque? ")
        val saque = readLine()?.toFloatOrNull()
        if (saque == null) {
            println("Operação não autorizada.")
            fazerSaque()
        } else if (saque > saldo) {
            println("Operação não autorizada")
        } else {
            saldo -= saque
            println("Saque realizado com sucesso")
            verSaldo()
        }
    }
}
    fun transferencia(){
        println("Digite sua senha:")
        var senha = readln().toInt()
        while (senha != 3589){
            println("Digite sua senha:")
            senha = readln().toInt()
        }
            println("Qual o número da conta para transferência:")
            var trf = readln().toIntOrNull()
            while(trf == null) {
                println("Número de conta inválido.")
                println("Digite novamente o número da conta:")
                trf = readln().toIntOrNull()
            }
            println("Digite o valor que deseja transferir:")
            val valor = readln().toIntOrNull()
            if (valor == null) {
                println("Operação não autorizada")
                transferencia()
            } else if (valor > saldo) {
                println("Operação não autorizada")
                transferencia()
            } else {
                saldo = saldo - valor
                println("Transferência realizada com sucesso!")
                inicio()
            }
}

fun erro() {
    println("Por favor, informe um número entre 1 a 6")
    inicio()
}

fun sair() {
    print("Você deseja sair? (S/N)")
    // Usando readln e Elvis operator -> Operador de coalescência nula
    val confirma = readln().uppercase()
    // Locale -> Localização do usuário para converter para maiúsculo
    //val confirma = readLine()?.uppercase(Locale.getDefault())

    when (confirma) {
        "S" -> println("$nome foi um prazer ter você por aqui!") //Hasta la vista, baby
        "N" -> inicio() // Volta para o início
        else -> sair()
    }
}