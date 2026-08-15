programa
{
	funcao inicio()
	{
					  
	real n1, n2, n3, soma
	
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o primeiro número: ")
		leia(n3)

		se(n1>= n2)
   	 	{
    			soma = n1+n2 
		}
   		senao se (n2>= n3)
   		{
   			soma = n2+n3
   		}
   		senao
   		{
   			soma = n1+n3
   		}
		escreva ("A soma dos dois maiores numeros é: ", soma)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */