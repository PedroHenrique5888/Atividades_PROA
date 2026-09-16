import Hotel.listaHospedes

fun relatorio(){
    var taxaOcupacao = 0.0
    var receitaTotal = 0.0
    taxaOcupacao = (quartosOcupados/20.0)*100
    receitaTotal = receitaEventos + receitaHospedagem

    val receitaHospedagemFormatado = "%.2f".format(receitaHospedagem).replace(".",",")
    val receitaEventosFormatado = "%.2f".format(receitaEventos).replace(".",",")
    val receitaTotalFormatado = "%.2f".format(receitaTotal).replace(".",",")

    println("Total de reservas de quartos confirmadas: $reservasConfirmadas\n" +
            "Taxa de ocupação atual ${taxaOcupacao.toInt()}%\n" +
            "Quantidade de hóspedes cadastrados: ${listaHospedes.size}\n" +
            "Quantidade de eventos confirmados: $eventosConfirmados\n" +
            "Receita acumulada:\n" +
            "hospedagem: R$$receitaHospedagemFormatado\n" +
            "eventos: R$$receitaEventosFormatado\n" +
            "total geral: R$$receitaTotalFormatado")
}