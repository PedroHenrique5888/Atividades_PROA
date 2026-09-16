//2.3. Leia 3 valores diferentes e mostre o maior.
fun main(){
    var n1 = 0 ;var n2 = 0 ;var n3 = 0 ;var n4 = 0;var n5 = 0;var n6 = 0;var i=0

   println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()
    println("Digite o terceiro número: ")
    n3 = readln().toInt()
    println("Digite o quarto número: ")
    n4 = readln().toInt()
    println("Digite o quinto número: ")
    n5 = readln().toInt()
    println("Digite o sexto número: ")
    n6 = readln().toInt()

    if(n1 > 72)
    {
        i=i+n1
    }
    if(n2 > 72)
    {
        i=i+n2
    }
    if(n3 > 72)
    {
        i=i+n3
    }
    if(n4 > 72)
    {
        i=i+n4
    }
    if(n5 > 72)
    {
        i=i+n5
    }
    if(n6 > 72)
    {
        i=i+n6
    }

    println(", $i , $n1 , $n2 , $n3, $n4 , $n5, $n6")

}