package multiplicacao_recursiva;

/*Criar uma função recursiva que receba 2 valores A e B e, por somas,
apresente o resultado da mul�plicação de A por B. */


public class Controller {

	public int multiplicacao(int num, int vezes) {
		// se vezes for menor 1. então nao retorne nada
		if(vezes < 1) {
			return 0;
		}
		// senao, enquanto vezes for > 1 entao retorne num + num de forma recursiva
		return num + multiplicacao(num, vezes-1);
		
	}
	
	
	
}
