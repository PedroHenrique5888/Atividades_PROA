programa  
{  
    funcao inicio()  
    { 
	real n1, n2, n3, maior, menor
	
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o primeiro número: ")
		leia(n3)
		
    		se(n1 > n2 e n1 > n3)
   	 	{
    			maior = n1
		}
		senao se(n2 > n1 e n2 > n3)
		{
			maior = n2
		}
   		senao
   		{
   			maior = n3
   		}

    		se(n1 < n2 e n1 < n3)
   	 	{
    			menor = n1
		}
		senao se(n2 < n1 e n2 < n3)
		{
			menor = n2
		}
   		senao
   		{
   			menor = n3
   		}
   		
   		escreva("Este é o maior número: ", maior, " e o menor: ", menor)
 }  
}  
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 592; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */