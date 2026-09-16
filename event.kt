var eventosConfirmados = 0
var receitaEventos = 0.0
fun evento(){
    println("Digite o numero de convidados:")
    val convidados = readln().toInt()
    if (convidados !in 0..350){
        println("Número de convidados inválido")
        return evento()
    }
    if (convidados <= 150){
        println("Auditorio Laranja")
    }else if (convidados in 151..220){
        val cadeiras = convidados - 150
        println("Auditorio Laranja, com $cadeiras cadeiras extras")
    }else{
        println("Colorado")
    }
    println("Informe o dia da semana:")
    val opcao = readln().lowercase()
    println("Informe o horario de inicio:")
    val horarioInicio = readln().toInt()
    println("Informe horario de duração do evento:")
    val duracao = readln().toInt()

    val horarioDia = when (opcao) {
        "segunda", "terca", "quarta", "quinta", "sexta" -> 23
        "sabado", "domingo" -> 15
        else -> {return evento()}
    }
if (horarioInicio >= 7 && duracao in 1..12 && horarioInicio+duracao <= horarioDia){
println("Informe o nome da empresa:")
    val empresa = readln().toString()
    println("Auditório reservado para $empresa: $opcao às $horarioInicio hs.")
}else{
    println("Horário indisponível")
}
    val resultado = Math.ceil(convidados.toDouble() / 12.0)
    val reforco = Math.floor(duracao.toDouble() / 2)
    val totalGarcons = (resultado + reforco).toInt()
    val custoGarcons = totalGarcons * duracao * 10.50

    val cafeLitros = convidados * 0.2
    val cafeCusto = cafeLitros * 0.8
    val aguaLitros = convidados * 0.5
    val aguaCusto = aguaLitros * 0.4
    val salgadosQuantidade = convidados * 7
    val salgadosCusto = (salgadosQuantidade / 100.0) * 34.00

    val custoBuffet = cafeCusto + aguaCusto + salgadosCusto
    val totalGeral = custoBuffet + custoGarcons

    val cafeFormatado = formatarValor(cafeLitros)
    val aguaFormatado = formatarValor(aguaLitros)
    val buffetFormatado = formatarValor(custoBuffet)
    val garconsFormatado = formatarValor(custoGarcons)
    val geralFormatado = formatarValor(totalGeral)

    println("Garçons necessários: $totalGarcons\n" +
            "Custo com garçons: R$$garconsFormatado \n" +
            "\n" +
            "Buffet:\n" +
            "Café: $cafeFormatado L\n" +
            "Água: $aguaFormatado L\n" +
            "Salgados: $salgadosQuantidade un\n" +
            "Custo buffet: R$$buffetFormatado\n" +
            "\n" +
            "Total do evento: R$$geralFormatado\n" +
            "Confirmar reserva? (S/N):")
    val confirmacao = readln().uppercase()
    if (confirmacao == "S"){
        println("Reserva efetuada")
        eventosConfirmados++
        receitaEventos = receitaEventos + totalGeral
    }else{
        println("Reserva não efetuada")
        return ini()
    }
}