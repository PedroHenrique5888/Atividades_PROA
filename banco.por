programa {
	
   	real saldo = 150.00, dep = 0.0, valor
     inteiro senha
     cadeia nome
     
	funcao inicio() {

		escreva("Informe seu nome: \n")
		leia(nome)
		
		inteiro opcao 
	
		escreva("Por favor, informe um número entre 1 a 6:\n")
		escreva("1. Ver saldo\n")
		escreva("2. Ver extrato\n")
		escreva("3. Fazer depósito\n")
		escreva("4. Fazer saque\n")
		escreva("5. Fazer uma transferência\n")
		escreva("6. Sair\n")
		leia(opcao)

		escreva("A opção selecionada foi: " +opcao + "\n")

    		se (opcao == 1) {
    			verSaldo()
    		}senao se (opcao == 2){
    			verExtrato()
    		}senao se (opcao == 3) {
				fazerDeposito()
    		} senao se (opcao == 4) {
				fazerSaque()
    		}senao se (opcao == 5){
    				fazerTransferencia()
    		}senao se (opcao == 6) {
				sair()
    		} senao {
				erro()
    		}

	}

	funcao verSaldo(){

	    escreva("Digite sua senha: \n")
	    leia(senha)
		se (senha < 3589 ou senha > 3589){
			verSaldo()
		}
		
	    escreva("Seu saldo atual é: ", saldo, "\n")
	    inicio()
	}

	funcao verExtrato(){

	    escreva("Digite sua senha: \n")
	    leia(senha)
		se (senha < 3589 ou senha > 3589){
			verExtrato()
		}
		
	    escreva("Seu último depósito foi de: ", dep , "\n")
	    inicio()
	}
	
	funcao fazerDeposito() {

		real deposito
		escreva("Qual o valor para depósito? ")
		leia(deposito)
		
		se (deposito <= 0){
			escreva("Por favor, informe um número válido.(SEU POBRE)\n")
			fazerDeposito()
		} senao {
			saldo = saldo + deposito
			dep = dep + deposito
			verSaldo()
		}
	}
	
	funcao fazerSaque(){

	    escreva("Digite sua senha: \n")
	    leia(senha)
		se (senha < 3589 ou senha > 3589){
		fazerSaque()
		}
	
		real saque
	
		escreva("Qual o valor para saque? ")
		leia(saque)
	
		se (saque <= 0){
	        escreva("Por favor, informe um número válido.\n")
	        fazerSaque()
		}senao se(saque > saldo){
		   escreva("Por favor, informe um número válido.(SEU POBRE)\n")
	        fazerSaque() 
		}senao {
			saldo = saldo - saque
			verSaldo()
		}
	}
	funcao fazerTransferencia(){

	    escreva("Digite sua senha: \n")
	    leia(senha)
		se (senha < 3589 ou senha > 3589){
			fazerTransferencia()
		}

		inteiro trf
		
		escreva("Qual o número da conta para transferência: \n")
		leia(trf)

		enquanto (trf <= -1){
		escreva("Qual o número da conta para transferência: \n")
		leia(trf)
		}

		escreva("Digite o valor que deseja transferir: \n")
		leia(valor)
		
		se (valor <= 0){
	        escreva("Por favor, informe um número válido.\n")
	        fazerTransferencia()
		}senao se(valor > saldo){
		   escreva("Por favor, informe um número válido.(SEU POBRE LISO)\n")
	        fazerTransferencia() 
		}senao {
			saldo = saldo - valor
			verSaldo()
		}
	}

	funcao erro() {
		escreva("Opção Inválida")
		inicio()
	}

	funcao sair(){
		escreva("", nome, " foi um prazer ter você por aqui!")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */