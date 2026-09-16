fun main(){
    var n1 = 0 ;var n2 = 0 ;var n3 = 0 ;var n4 = 0;var i=0

    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()
    println("Digite o terceiro número: ")
    n3 = readln().toInt()
    println("Digite o quarto número: ")
    n4 = readln().toInt()

    if(n1 !in 0..10)
    {
        while (n1 !in 0..10)
        {
            println ("Primeiro número invalido, digite outro número: \n")
            n1 = readln().toInt()
        }
    }

    if(n2 !in 0..10)
    {
        while (n2 !in 0..10)
        {
            println("Segundo número invalido, digite outro número: \n")
            n2 = readln().toInt()
        }
    }

    if(n3 !in 0..10)
    {
        while (n3 !in 0..10)
        {
            println ("Terceiro número invalido, digite outro número: \n")
            n3 = readln().toInt()
        }
    }

    if(n4 !in 0..10)
    {
        while (n4 !in 0..10)
        {
            println("Quarto número invalido, digite outro número: \n")
            n4 = readln().toInt()
        }
    }
    i = (n1+n2+n3+n4)/4

    if(i > 5)
    {
        println("Você passou no teste $i")
    }else
    {
        println("Tente novamente $i")
    }
}