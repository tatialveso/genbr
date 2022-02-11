programa
{
	
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real p1 = 2, p2 = 3, p3 = 5, n1, n2, n3, mediaPonderada

		escreva("Informar nota 1: ")
		leia(n1)
		escreva("Informar nota 2: ")
		leia(n2)
		escreva("Informar nota 3: ")
		leia(n3)

		mediaPonderada = (p1*n1+p2*n2+p3*n3)/(p1+p2+p3)
		escreva("Sua nota média foi de: ", mat.arredondar(mediaPonderada, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */