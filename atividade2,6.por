programa
{
	
	funcao inicio()
{
	real n1, n2, n3, n4, maior, menor
	
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)				
		escreva("Digite o terciero número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)				

		se(n1> n2)
   	 	{
    			maior = n1 
		}
   		senao se (n2> n3)
   		{
   			maior = n2
   		}
   		senao se (n3> n4)
   		{
   			maior = n3
   		}
   		senao
   		{
   			maior = n4
   		}
		escreva ("A soma dos dois maiores numeros é: ", n1 , n4, maior )

}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */