import Hotel.cadastrarHospedes
import Hotel.cadastrarQuartos

fun ini() {
    println("Escolha uma opção:")
    println("1 - Reservas de Quartos")
    println("2 - Cadastro de Hóspedes")
    println("3 - Eventos")
    println("4 - Ar-Condicionado")
    println("5 - Abastecimento")
    println("6 - Relatórios Operacionais")
    println("7 - Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> reservas()
        2 -> cadastrarHospedes()
        3 -> evento()
        4 -> ar()
        5 -> abastecimento()
        6 -> relatorio()
        7 -> sair()
        else -> erro()
    }
}