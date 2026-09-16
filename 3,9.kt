//3.9. Leia 10 valores e informe quantos estão no intervalo de 24 a 42 (inclusive) e quantos estão fora.
fun main(){
        var valores = IntArray(10)
        var dentro = 0
        var fora = 0
            for (i in valores.indices) {
                println("Digite um valor: ")
                valores[i] = readln().toInt()
            }
            for (i in valores.indices) {
                if (valores[i] in 24 .. 42) {
                    dentro++
                }else {
                    fora++
                }
            }
    println("Dentro: $dentro, Fora: $fora")
    }
