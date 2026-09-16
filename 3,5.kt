fun main()
    {
        var n1=0
        var n2=0
        var i=-1
        var c = 0
        var result=0
        var parar = "s"


        while (parar != "n")
        {
            println ("Deseja calcular uma média? (S/N) \n")
            parar = readln()

            if(parar == "s")
            {
                println("Digite o primeiro número: ")
                n1 = readln().toInt()
                println("Digite o segundo número: ")
                n2 = readln().toInt()

                result = (n1 + n2)/2
            }

            if(result >= 9.5)
            {
                i=i+1



                while (c<i)
                {
                    c++
                }
            }
            if(parar == "n")
            {
                println ("Número de alunos aprovados: $i")
            }
        }
    }