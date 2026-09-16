import Hotel.cadastrarHospedes
import kotlin.system.exitProcess

fun formatarValor(parametro: Double): String {
    return "%.2f".format(parametro).replace(".", ",")
}
fun sair() {
            println("Muito obrigado e até logo, $nome.")
            exitProcess(0)
}