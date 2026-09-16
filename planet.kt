fun main() {
    inicio()
}
fun inicio() {
    print("Deseja consultar planetas? (S/N)")
    val confirma = readln().uppercase()

    when (confirma) {
        "S" -> planetas()
        "N" -> println("Obrigado")
        else -> println("Obrigado")
    }
}
fun planetas(){
    var user = ""
    var usuar = ""
    var planetasNovo: String = ""

    val planetas = mutableSetOf("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")
    println(planetas)
    val minusculo = planetas.map { it.lowercase() }

    println("Qual planeta? ")
    val entrada = readln().lowercase()

    if(entrada in minusculo) {
        println("Planeta esta na lista, deseja remove-lo? (S/N)")
        user = readln().toString()
    } else {
        println("Planeta não esta na lista, deseja adiciona-lo? (S/N)")
        usuar = readln().toString()
    }
    if(user.lowercase() == "s"){
        planetasNovo = planetas.find { it.lowercase() == entrada }.toString()
        planetas.remove(planetasNovo)
        println("Planeta $entrada removido, planetas: $planetas")
    }else if (usuar.lowercase() == "s"){
        planetas.add(entrada)
        println("Planeta $entrada adicionado, planetas: $planetas")
    }
    inicio()
}