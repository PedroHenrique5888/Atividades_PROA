programa
{
	
	funcao inicio()
{
	real n1, n2

	
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)				

		se(n2 <= 0)
   	 	{
			enquanto (n2 <= 0)
		{
			escreva ("Números menores ou iguais a zero não serão aceitos! \n")
			leia (n2)
		}
   	 	}
   		senao
   		{
   			escreva("Divisão dos valores: ", n1 / n2)
   		}
		
   			
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */