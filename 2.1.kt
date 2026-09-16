//2.1. Leia dois números e mostre o maior deles.
fun main(){
    var n1: Int = 0
    var n2: Int = 0

    println("Primeiro número: ")
    n1 = readln().toInt()
    println("Segundo número: ")
    n2 = readln().toInt()

    if (n1 > n2){
        println("Maior número: $n1, menor: $n2")
    }else{
        println("Maior número: $n2, menor: $n1")
    }
}