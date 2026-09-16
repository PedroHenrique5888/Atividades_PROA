import Hotel.cadastrarQuartos
var receitaHospedagem = 0.0
var reservasConfirmadas = 0
var quartosOcupados = 0

fun reservas() {
    var subtotal = 0.0
    var taxaServico = 0.0
    var totalFinal = 0.0
    println("Digite o valor da diaria: ")
    diaria = readln().toDouble()
    println("Digite a quantidade de diarias: ")
    dias = readln().toInt()

    if (diaria <= 0) {
        println("Valor inválido, $nome")
        return ini()
    }
    if (dias !in 1..30) {
        println("Valor inválido, $nome")
        return ini()

    }
    nomeCompleto()

    println("Escolha uma das tres opcões: (S/E/L)")
    val opcao = readln().uppercase()

    val resultado = when (opcao) {
        "S" -> 1.00
        "E" -> 1.35
        "L" -> 1.65
        else -> return cadastrarQuartos()
    }
    val tipo = when(opcao){
        "S" -> "Standard"
        "E" -> "Executivo"
        "L" -> "Luxo"
        else -> return cadastrarQuartos()
    }

    var escolha = ""
    val quartos = mutableListOf(
        "Quarto 1",
        "Quarto 2",
        "Quarto 3",
        "Quarto 4",
        "Quarto 5",
        "Quarto 6",
        "Quarto 7",
        "Quarto 8",
        "Quarto 9",
        "Quarto 10",
        "Quarto 11",
        "Quarto 12",
        "Quarto 13",
        "Quarto 14",
        "Quarto 15",
        "Quarto 16",
        "Quarto 17",
        "Quarto 18",
        "Quarto 19",
        "Quarto 20"
    )
    println("Quartos disponiveis: $quartos")
    val quarto = quartos.map { it.lowercase() }
    println("Escolha um quarto disponivel")
    escolha = readln().lowercase()




    if (escolha in quartos || escolha in quarto) {
        val quartonew = quartos.find { it.lowercase() == escolha }
        quartos.remove(quartonew!!)
        println("Quarto obtido $quartos")
        subtotal = diaria * dias * resultado
        taxaServico = subtotal * 0.10
        totalFinal = subtotal + taxaServico
    } else {
        while (quartos.isNotEmpty()) {
            val quarto = quartos.map { it.lowercase() }
            println("Quarto já está ocupado, escolha outro: ")
            escolha = readln().lowercase()

            if (escolha in quartos || escolha in quarto) {
                val quartonew = quartos.find { it.lowercase() == escolha }
                quartos.remove(quartonew!!)
                println("Quarto obtido $quartos")
                subtotal = diaria * dias * resultado
                taxaServico = subtotal * 0.10
                totalFinal = subtotal + taxaServico
                break
            } else {
                println("Quarto indiponínel")
            }

        }
    }
    val subtotalFormatado = formatarValor(subtotal)
    val taxaFormatado = formatarValor(taxaServico)
    val totalFormatado = formatarValor(totalFinal)
    println("Resumo:\n" +
            "Hóspede: $nome\n" +
            "Quarto: $escolha ($tipo)\n" +
            "Subtotal: R$$subtotalFormatado\n" +
            "Taxa de serviço (10%): R$$taxaFormatado\n" +
            "Total: R$$totalFormatado\n" +
            "\n" +
            "$nome, confirma a reserva? (S/N):")
    val confirmacao = readln().uppercase()
    if (confirmacao == "S"){
        println("Reserva efetuada, quarto ocupado")
        reservasConfirmadas++
        quartosOcupados++
        receitaHospedagem = receitaHospedagem + totalFinal
    }else{
        println("Reserva não efetuada, quarto não ocupado")
        return ini()
    }
    var numero = 0
    for (linha in 1..4) {
        for (coluna in 1..5) {
            numero++
            val nomeQuarto = "Quarto $numero"
            if (nomeQuarto in quartos){
                print("L ")
            }else{
                print("O ")
            }
        }
        println()
    }
}