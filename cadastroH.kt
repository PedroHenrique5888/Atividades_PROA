package Hotel

import ini
import kotlin.system.exitProcess
val listaHospedes = mutableListOf(Pair
    ("Carlos Villagran", "07/09/2026 14:30")
)
fun cadastrarHospedes() {


    while (true) {
        println("""Cadastro de Hóspedes
            Selecione uma opção:
            1. Cadastrar
            2. Pesquisar
            3. Pesquisar por Prefixo
            4. Listagem
            5. Atualizar
            6. Remover
            7. Voltar""")

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> cadastrarHospede(listaHospedes)
            2 -> pesquisarHospede(listaHospedes)
            3 -> pesquisarPrefixo(listaHospedes)
            4 -> listagem()
            5 -> atualizarHospede(listaHospedes)
            6 -> removerIndice(listaHospedes)
            7 -> return ini()
            else -> erroCadastroDeHospedes()
        }
    }
}

fun cadastrarHospede(listaHospedes: MutableList<Pair<String, String>>) {
    val hora = java.time.LocalDateTime.now().toString()
    if (Hotel.listaHospedes.size >= 15){
        println("Máximo de cadastros atingido")
        return
    }
    println("Cadastro de Hóspedes.\nPor favor, informe o nome da Hóspede:")
    val novoHospede = readln()

    if (novoHospede.lowercase() in Hotel.listaHospedes.map { it.first.lowercase() }){
        println("Hospede já cadastrado")
        return
    }else {
        listaHospedes.add(Pair(novoHospede, hora))
        println("$novoHospede cadastrado com sucesso!")
        println("Lista de Hóspedes atuais " + listaHospedes)
    }
}
fun pesquisarPrefixo(listaHospedes: MutableList<Pair<String, String>>){
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome do Hóspede:")
    val nomeHospede = readln()
    if (listaHospedes.any { it.first.startsWith(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s):")
        listaHospedes.filter { it.first.startsWith(nomeHospede, ignoreCase = true) }
            .forEach { println(it.first) }
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")
    }
}
fun pesquisarHospede(listaHospedes: MutableList<Pair<String, String>>) {
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome do Hóspede:")
    val nomeHospede = readln()

    if (listaHospedes.any { it.first.contains(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s):")
        listaHospedes.filter { it.first.contains(nomeHospede, ignoreCase = true) }
            .forEach { println(it.first) }
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")
    }
}
fun listagem(){
    val listaOrdenada = listaHospedes.sortedBy { it.first }

    for (i in listaOrdenada.indices){
        println("$i, ${listaOrdenada[i].first}, ${listaOrdenada[i].second}")
    }
}
fun atualizarHospede(listaHospedes: MutableList<Pair<String, String>>){
    listagem()
    val hora = java.time.LocalDateTime.now().toString()

    println("Qual indice deseja atualizar?")
    val numIndice = readln().toIntOrNull()

    if (numIndice==null || numIndice !in 0..listaHospedes.size -1){
        println("Erro")
        return cadastrarHospedes()
    }else{
    println("Informe o novo nome:")
        val novoNome = readln()
        listaHospedes[numIndice] = (Pair( novoNome, hora))
        println("$novoNome atualizado com sucesso")
    }
}
fun removerIndice(listaHospedes: MutableList<Pair<String, String>>){
    listagem()

    println("Qual indice deseja atualizar?")
    val numIndice = readln().toIntOrNull()

    if (numIndice==null || numIndice !in 0..listaHospedes.size -1){
        println("Erro")
        return cadastrarHospedes()
    }else{
        val nomeRemove = listaHospedes[numIndice].first
        listaHospedes.remove(listaHospedes[numIndice])
        println("$nomeRemove removido com sucesso")
    }
}


fun erroCadastroDeHospedes() {
    println("Por favor, informe um número entre 1 e 7.")
}