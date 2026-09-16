//3.6. Leia 6 notas válidas (de 0 a 10), calcule e exiba a média simples.
fun main(){
    var valores = DoubleArray(6)
    var soma = 0.0

    for (i in valores.indices) {
        println("Digite um valor: ")
        valores[i] = readln().toDouble()
        while (valores[i] !in 0.0..10.0) {
            println("Valor invalido: ")
            valores[i] = readln().toDouble()
        }
    }
    for (i in valores.indices){
        soma += valores[i]
    }
    soma = soma/6
    println("Media: $soma")
}

