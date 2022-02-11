programa
{

	funcao inicio()
    	{

         inteiro anosEmDias, mesesEmDias, dias, totalDeAnos, totalDeMeses, totalDeDias

        escreva("\nQuantos anos você tem em dias? ")
         leia(anosEmDias)
        escreva("\nE quantos meses em dias? ")
         leia(mesesEmDias)
        escreva("\nPor fim, quantos dias? ")
         leia(dias)

         totalDeAnos = anosEmDias / 365 
         totalDeMeses = mesesEmDias / 30 
         totalDeDias = dias


         escreva ("\nVocê tem, até o momento, ", totalDeAnos , " anos ", totalDeMeses , " meses e ",  totalDeDias ," e dias.")
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */