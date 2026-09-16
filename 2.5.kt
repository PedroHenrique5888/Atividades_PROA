//2.3. Leia 3 valores diferentes e mostre o maior.
fun main(){
    var n1 = 0 ;var n2 = 0; var n3 = 0 ;var n4 = 0; var n5 = 0 ;var n6 = 0; var soma = 0

    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()
    println("Digite o terceiro número: ")
    n3 = readln().toInt()
    println("Digite o primeiro número: ")
    n4 = readln().toInt()
    println("Digite o segundo número: ")
    n5 = readln().toInt()
    println("Digite o terceiro número: ")
    n6 = readln().toInt()

    soma = (n1+n2+n3+n4+n5+n6)/6

    println("$n1 $n2 $n3 $n4 $n5 $n6 $soma")

}