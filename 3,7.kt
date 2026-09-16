fun main() {
    var estudantes = arrayOf<String>()
    var quantidade = 0

    while (true) {
        print("Digite o nome do estudante ou PARE para encerrar: ")
        val nome = readln()

        if (nome.equals("PARE", ignoreCase = true)) {
            break
        }

        // Cria um novo array com uma posição a mais
        val novoArray = arrayOfNulls<String>(quantidade + 1)

        // Copia os estudantes já cadastrados
        for (i in estudantes.indices) {
            novoArray[i] = estudantes[i]
        }

        // Adiciona o novo estudante
        novoArray[quantidade] = nome

        // Atualiza o array
        estudantes = novoArray.filterNotNull().toTypedArray()

        quantidade++
    }

    println("\nQuantidade de estudantes cadastrados: $quantidade")

    println("\nLista de estudantes:")
    for (i in estudantes.indices) {
        println("${i + 1} - ${estudantes[i]}")
    }
}