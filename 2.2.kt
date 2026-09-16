//2.2. Leia um valor e diga se ele é positivo, negativo ou zero.
fun main(){
    println("Digite um número: ")
    val n1: Int = readln().toInt()

    if (n1 >= 1){
        println("Positivo, $n1")
    }else if (n1 <= -1){
        println("negativo, $n1")
    }else{
        println("zero, $n1")
    }
}