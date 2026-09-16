//1.3. Peça ao usuário nome e idade e exiba: Olá, [NomeDoUsuario], sua idade é [idade].
fun main(){
    var name: String = ""
    var idade: Int = 0

    println("Digite seu nome: ")
    name = readln()

    println("Digite sua idade: ")
    idade = readln().toInt()

    println("Olá, $name,${name.uppercase()}, sua idade é $idade")
}