fun main()
    {
        var n1=0
        var n2=0
        var media1=0
        var i=1
        var c=1
        var f=1

        println("Digite o primeiro número: ")
        n1 = readln().toInt()
        println("Digite o segundo número: ")
        n2 = readln().toInt()

        if(n1 > n2)
        {
            while (n1 > n2)
            {
                println("Digite um número que seja menor que o segundo: \n")
                n1 = readln().toInt()
            }
        }

        while (n1<n2)
        {
            n1++
            if(f <= n1 && c <= n2)
            {
                while (f<=n1){
                    f++
                }
                while (c<=n2)
                {
                    c++
                }
            }
        }
        i=n1
        media1 = (n1+n2)/2
        val media2 = (c+i)/f
        println("media1: $media1, media2: $media2 , n1: $n1, total: $i")
    }
