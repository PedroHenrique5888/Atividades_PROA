fun main() {
    var estudantes = arrayOf<String>()
    var quantidade = 0

    while (true) {
        print("Digite o nome do estudante ou PARE para encerrar: ")
        val nome = readln()

        if (nome.equals("PARE", ignoreCase = true)) {
            break
        }
        val novoArray = arrayOfNulls<String>(quantidade + 1)

        for (i in estudantes.indices) {
            novoArray[i] = estudantes[i]
        }

        novoArray[quantidade] = nome

        estudantes = novoArray.filterNotNull().toTypedArray()

        quantidade++
    }

    println("\nQuantidade de estudantes cadastrados: $quantidade")

    println("\nLista de estudantes:")
    for (i in estudantes.indices) {
        println("${i + 1} - ${estudantes[i]}")
    }
}