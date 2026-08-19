programa
{
    funcao inicio()
    {
        real i, soma = 0.0, quantidade = 0.0
        real media

        para(i = 15.0; i <= 100; i++)
        {
            soma = soma + i
            quantidade = quantidade + 1
        }

        media = soma / quantidade

        escreva("Média = ", media)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */