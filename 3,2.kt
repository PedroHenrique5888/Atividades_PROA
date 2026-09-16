fun main()
{

    var n1= 0
    var n2 = 0


    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()

        if(n2 <= 0)
        {
            while (n2 <= 0)
            {
                println ("Números menores ou iguais a zero não serão aceitos! \n")
                n2 = readln().toInt()
            }
        }else
        {
            var div = n1/n2
            println("Divisão dos valores: $div")
        }


    }

