//1.2. Peça ao usuário que informe o nome e exiba a mensagem: Olá, [NomeDoUsuario].
fun main(){
    var name: String = ""
    print("Digite seu nome: ")
    name = readln()

    println("Olá, $name,${name.uppercase()}")
}