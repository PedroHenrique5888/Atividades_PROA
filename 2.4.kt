//2.4. Leia 3 valores diferentes e mostre a soma dos 2 maiores.
fun main(){
    var n1: Int = 0
    var n3: Int = 0
    var n2: Int = 0
    var soma: Int = 0

    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()
    println("Digite o terceiro número: ")
    n3 = readln().toInt()

    if (n1 < n2 && n1 < n3){
        soma = n2+n3
    }
    else if (n2 < n1 && n2 < n3){
        soma = n1+n3
    }
    else{
        soma = n1+n2

    }
    println(soma)
}