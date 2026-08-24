fun main() {

    val planetas = listOf("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")
    println(planetas)

    val minusculo = planetas.map { it.lowercase() }

    println("Qual planeta? ")
    val entrada = readln().lowercase()


    if(entrada in minusculo)
    {
        println("esta na lista")
    }
    else
    {
        println("nao esta na lista")
    }
}