programa
{ //Leia um valor N (N > 0) e imprima todos os inteiros de 1 até N.
	
	funcao inicio()
	{

	     inteiro n
	     
		escreva("Digite um número maior do que zero: ")
		leia(n)

		se(n <= 0)
   	 	{
			enquanto (n <= 0)
		{
			escreva ("Número invalido, digite outro número: ")
			leia (n)
		}
   	 	}

		se(n > 0)
		{
			para (inteiro i=1; i<=n; i++)
		{
			escreva (i, "\n")
		}	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */