programa {
    real saldo = 150.00
    real dep = 0.0
    real valor
    inteiro senha
    cadeia nome
    funcao inicio() {
        inteiro opcao
        escreva("Informe seu nome: \n")
        leia(nome)
        escreva("Olá ", nome, " é um prazer ter você por aqui!\n\n")
        escreva("Por favor, informe um número entre 1 a 6:\n")
        escreva("1. Ver saldo\n")
        escreva("2. Ver extrato\n")
        escreva("3. Fazer saque\n")
        escreva("4. Fazer depósito\n")
        escreva("5. Fazer uma transferência\n")
        escreva("6. Sair\n")
        leia(opcao)
        escreva("A opção selecionada foi: ", opcao, "\n")
        escolha(opcao) {
            caso 1:
                verSaldo()
                pare
            caso 2:
                verExtrato()
                pare
            caso 3:
                fazerSaque()
                pare
            caso 4:
                fazerDeposito()
                pare
            caso 5:
                fazerTransferencia()
                pare
            caso 6:
                sair()
                pare
            caso contrario:
                erro()
        }
    }funcao verSaldo() {
        escreva("Digite sua senha: \n")
        leia(senha)
        se (senha != 3589) {
            escreva("Senha incorreta!\n")
            verSaldo()
        } senao {
            escreva("Seu saldo atual é: R$ ", saldo, "\n")
            inicio()
        }
    }funcao verExtrato() {
        escreva("Digite sua senha: \n")
        leia(senha)
        se (senha != 3589) {
            escreva("Senha incorreta!\n")
            verExtrato()
        } senao {
            escreva("Saldo inicial: R$ 150.00\n")
            escreva("Depósito realizado: R$ ", dep, "\n")
            escreva("Compra no mercado: R$ -35.00\n")
            escreva("Compra na farmácia: R$ -20.00\n")
            escreva("Depósito fictício: R$ 100.00\n")
            inicio()
        }
    }funcao fazerDeposito() {
        real deposito
        escreva("Qual o valor para depósito? \n")
        leia(deposito)
        se (deposito <= 0) {
            escreva("Operação não autorizada\n")
            fazerDeposito()
        } senao {
            saldo = saldo + deposito
            dep = dep + deposito
            escreva("Depósito realizado com sucesso!\n")
            inicio()
        }
    }funcao fazerSaque() {
        real saque
        escreva("Digite sua senha: \n")
        leia(senha)
        se (senha != 3589) {
            escreva("Senha incorreta!\n")
            fazerSaque()
        } senao {
            escreva("Qual o valor para saque? \n")
            leia(saque)
            se (saque <= 0) {
                escreva("Operação não autorizada\n")
                fazerSaque()
            } senao se (saque > saldo) {
                escreva("Operação não autorizada\n")
                fazerSaque()
            } senao {
                saldo = saldo - saque
                escreva("Saque realizado com sucesso!\n")
                inicio()
            }
        }
    }funcao fazerTransferencia() {
        inteiro trf
        escreva("Digite sua senha: \n")
        leia(senha)
        se (senha != 3589) {
            escreva("Senha incorreta!\n")
            fazerTransferencia()
        } senao {
            escreva("Qual o número da conta para transferência: \n")
            leia(trf)
            enquanto (trf < 0) {
                escreva("Número de conta inválido.\n")
                escreva("Digite novamente o número da conta: \n")
                leia(trf)
            }
            escreva("Digite o valor que deseja transferir: \n")
            leia(valor)
            se (valor <= 0) {
                escreva("Operação não autorizada\n")
                fazerTransferencia()
            } senao se (valor > saldo) {
                escreva("Operação não autorizada\n")
                fazerTransferencia()
            } senao {
                saldo = saldo - valor
                escreva("Transferência realizada com sucesso!\n")
                inicio()
            }
        }
    }funcao erro() {
        escreva("\nOpção inválida!\n")
        escreva("Por favor, escolha uma opção entre 1 a 6.\n")
        inicio()
    }funcao sair() {
        escreva(nome, ", foi um prazer ter você por aqui!")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */