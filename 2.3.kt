//2.3. Leia 3 valores diferentes e mostre o maior.
fun main(){
    var n1 = 0
    var n2 = 0
    var n3 = 0

    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()
    println("Digite o terceiro número: ")
    n3 = readln().toInt()

    if (n1 > n2 && n1 > n3){
        println("Maior: $n1")
    }else if (n2 > n1 && n2 > n3){
        println("Maior: $n2")
    }else{
        println("Maior: $n3")
    }
}