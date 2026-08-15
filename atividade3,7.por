programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, n4, n5, n6, media1
		
		escreva("Só serão aceitos valores entre (0 e 10) \n")

		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)	
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quato número: ")
		leia(n4)	
		escreva("Digite o quinto número: ")
		leia(n5)
		escreva("Digite o sexto número: ")
		leia(n6)	
		
		se(n1 < 0 ou n1 > 10)
   	 	{
			enquanto (n1 < 0 ou n1 > 10)
		{
			escreva ("Primeiro número invalido, digite outro número: \n")
			leia (n1)
		}
   	 	}
   	 	
   				se(n2 < 0 ou n2 > 10)
   	 	{
			enquanto (n2 < 0 ou n2 > 10)
		{
			escreva ("Segundo número invalido, digite outro número: \n")
			leia (n2)
		}
   	 	}

   	 			se(n3 < 0 ou n3 > 10)
   	 	{
			enquanto (n3 < 0 ou n3 > 10)
		{
			escreva ("Terceiro número invalido, digite outro número: \n")
			leia (n3)
		}
   	 	}

   	 			se(n4 < 0 ou n4 > 10)
   	 	{
			enquanto (n4 < 0 ou n4 > 10)
		{
			escreva ("Quarto número invalido, digite outro número: \n")
			leia (n4)
		}
   	 	}

   	 	   	 	se(n5 < 0 ou n5 > 10)
   	 	{
			enquanto (n5 < 0 ou n5 > 10)
		{
			escreva ("Quinto número invalido, digite outro número: \n")
			leia (n5)
		}
   	 	}

   	 	   	 	se(n6 < 0 ou n6 > 10)
   	 	{
			enquanto (n6 < 0 ou n6 > 10)
		{
			escreva ("Sexto número invalido, digite outro número: \n")
			leia (n6)
		}
   	 	}
   			media1 = (n1+n2+n3+n4+n5+n6)/6
   			escreva("media1: \n", media1)
   	 	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */