programa
{
    funcao inicio()
    {
		inteiro n1, n2,i=-1, result=0
		caracter parar
		parar = 's'
		
		
		enquanto (parar != 'n')
		{
			escreva ("Deseja calcular uma média? (S/N) \n")
			leia (parar)
			
			se(parar == 's')
			{
				escreva("Digite o primeiro número: ")
				leia(n1)
				escreva("Digite o segundo número: ")
				leia(n2)
		
				result = (n1 + n2)/2
			}
			
		se(result >= 9.5)
			{
			 i=i+1

			 
				
				para (inteiro c=0; c<i; c++)
		{
			
		}
			}
		se(parar == 'n')
			{
			escreva ("Número de alunos aprovados: ", i ,"\n")
			}
		}
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 58; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */