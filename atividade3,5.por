programa
{
	
	funcao inicio()
{
	inteiro n1, n2, media1=0, i=1, c=1, f=1
	
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)				

		se(n1 > n2)
   	 	{
			enquanto (n1 > n2)
		{
			escreva ("Digite um número que seja menor que o segundo: \n")
			leia (n1)
		}
   	 	}

   		para (n1; n1<n2; n1++)
		{
		se(f <= n1 e c <= n2)
		{
		para (f; f<=n1; f++)		
		para (c; c<=n2; c++)
		{
			i=n1

		}
		}
		   		media1 = (n1+n2)/2
		   		inteiro media2 = (c+i)/f
   			escreva("media1: ", media1 , ", media2: ", media2 , ", n1: " , n1, " total: ", i)
		}
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */