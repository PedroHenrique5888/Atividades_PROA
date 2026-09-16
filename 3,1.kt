fun main(){
    var i = 0

    println("Digite um número maior do que zero: ")
    i = readln().toInt()

    if (i <= 0){
        while (i <= 0){
            println("Digite um numero maior do que zero: ")
            i = readln().toInt()
        }
        }
    while(i > 0){
        i--
        println("EXPLOSÃO em: $i")

        if(i == 0)
        {
            println("EXPLOSÃO")
        }
    }
    }

