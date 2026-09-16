fun ar(){
    val totais = mutableListOf<Double>()
    val empresas = mutableListOf<String>()
    var fixoDeslocamento = 0.0
    var qtMinimaDesconto = 0
    var percentualDesconto = 0.0
    var qtAparelho = 0
    var valorAparelho = 0.0
    var mini = 0

    while (true){
        println("Informe a empresa:")
        var empresa = readln()
        empresas.add(empresa)
        println("Informe valor por aparelho:")
        valorAparelho = readln().toDouble()
        println("Informe quantidade de aparelhos:")
        qtAparelho = readln().toInt()
        println("Informe percentual de desconto:")
        percentualDesconto = readln().toDouble()
        println("Informe quantidade minima para desconto:")
        qtMinimaDesconto = readln().toInt()
        println("Informe valor fixo de deslocamento:")
        fixoDeslocamento = readln().toDouble()

        var desconto = 0.0
        val bruto = valorAparelho * qtAparelho
        if (qtAparelho >= qtMinimaDesconto){
            desconto = bruto * (percentualDesconto/100)
        }
        val total = bruto - desconto + fixoDeslocamento
        totais.add(total)
        mini++
        if (mini >= 2){
            println("Deseja informar mais empresas? (S/N):")
            val confirmacao = readln().uppercase()
            if (confirmacao == "S"){

            }else{
                break
            }
        }
    }
    for (i in empresas.indices) {
        println("O serviço de ${empresas[i]} custará R$${totais[i]}")
    }
    val maiorValor = (totais.max())
    val menorValor = (totais.min())
    val posicaoMenor = totais.indexOf(menorValor)
    val posicaoMaior = totais.indexOf(maiorValor)
    val nomeMaior = empresas[posicaoMaior]
    val nomeMenor = empresas[posicaoMenor]

    val diferenca = ((maiorValor - menorValor) / menorValor) * 100

    val maiorFormatado = formatarValor(maiorValor)
    val menorFormatado = formatarValor(menorValor)
    val diferencaFormatada = formatarValor(diferenca)

    println("Melhor orçamento: $nomeMenor — R$$menorFormatado\n" +
            "Pior orçamento: $nomeMaior — R$$maiorFormatado\n" +
            "Diferença percentual entre melhor e pior proposta: $diferencaFormatada%")
}
