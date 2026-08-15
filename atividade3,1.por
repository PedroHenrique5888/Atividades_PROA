programa
{
    funcao inicio()
    {
		inteiro i

		escreva("Digite um número maior do que zero: ")
		leia(i)
		
	se(i <= 0)
   	 	{
			enquanto (i <= 0)
		{
			escreva ("Digite um número que seja menor que o segundo \n")
			leia (i)
		}
   	 	}
		
		para (i; i>-1; i--)
		{
			
			escreva (i, "\n")

			se(i == -1)
		{
			escreva("EXPLOSÃO")
		}
		}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */