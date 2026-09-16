//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
val hotel = "Terabithia"
var nome: String = ""
var limite = 0
var diaria = 0.0
var dias = 0
fun main() {
    println("Bem-vindo ao $hotel")

    println("Digite seu nome: ")
    nome = readln()

    println("Digite sua senha:")
    var senha = readln().toInt()

        while (senha != 2678){
            println("Digite sua senha:")
            senha = readln().toInt()
             limite++
            if (limite == 2){
                return bloqueado()
            }
        }
    println("Bem-vindo ao Hotel $hotel, $nome. É um imenso prazer ter você por aqui!")
    ini()
}
fun nomeCompleto(){
    var name: String = ""
    println("Digite seu nome completo: ")
    name = readln()
}
fun erro() {
    println("$nome foi um prazer ter você por aqui!")
}
fun bloqueado(){
    println("Acesso bloqueado!")
}

