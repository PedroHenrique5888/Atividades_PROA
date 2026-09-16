//2.3. Leia 3 valores diferentes e mostre o maior.
fun main(){
    var n1 = 0 ;var n2 = 0; var n3 = 0 ;var n4 = 0; var maior = 0

    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    println("Digite o segundo número: ")
    n2 = readln().toInt()
    println("Digite o terceiro número: ")
    n3 = readln().toInt()
    println("Digite o primeiro número: ")
    n4 = readln().toInt()
    println("Digite o segundo número: ")


    if (n1 > n2 && n1 > n3 && n1 > n4){
        maior = n1
    }else if (n2 > n1 && n2 > n3 && n2 > n4){
        maior = n2
    }else if(n3 > n1 && n3 > n2 && n3 > n4){
        maior = n3
    }else{
        maior = n4
    }

    println ("A soma dos dois maiores numeros é:  $n1 , $n4, $maior ")


}