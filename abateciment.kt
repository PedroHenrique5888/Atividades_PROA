fun abastecimento(){
    var melhorWayne = ""
    var melhorStark = ""
    var melhorPostoNome = ""
    var combustivelMelhor = ""

    println("Informe o preço da gasolina Wayne Oil:")
    val gasolinaWayne = readln().toDouble()
    println("Informe o preço do álcool Wayne Oil:")
    val alcoolWayne = readln().toDouble()
    println("Informe o preço da gasolina Stark Petrol:")
    val gasolinaStark = readln().toDouble()
    println("Informe o preço do álcool Stark Petrol:")
    val alcoolStark = readln().toDouble()

    if (alcoolWayne <= gasolinaWayne * 0.70){
        melhorWayne = "álcool"
    }else{
        melhorWayne = "gasolina"
    }
    if (alcoolStark <= gasolinaStark * 0.70){
        melhorStark = "álcool"
    }else{
        melhorStark = "gasolina"
    }
    val precoWayne = minOf(alcoolWayne, gasolinaWayne)
    val precoStark = minOf(alcoolStark, gasolinaStark)

    val custoWayne = precoWayne * 42
    val custoStark = precoStark * 42

if (custoStark < custoWayne){
    melhorPostoNome = "Stark Petrol"
    combustivelMelhor = melhorStark
}else{
    melhorPostoNome = "Wayne Oil"
    combustivelMelhor = melhorWayne
}
    val custoWayneFormatado = formatarValor(custoWayne)
    val custoStarkFormatado = formatarValor(custoStark)

println("    Wayne Oil: melhor opção = $melhorWayne | Total (42L) = R$$custoWayneFormatado\n" +
        "    Stark Petrol: melhor opção = $melhorStark | Total (42L) = R$$custoStarkFormatado\n" +
        "    \n" +
        "    $nome, é mais barato abastecer com $combustivelMelhor no posto $melhorPostoNome.")
}