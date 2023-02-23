package fatorial;

public class Controller {

	
	public int fatorial(int n) {
		// se numero for menor que 2 então ele é 1, e qualquer numero mult por 1, é ele mesmo
		if(n < 2) {
			return 1;
		}
		// senao, se numero for maior que 2, faça a recursividade multiplicando o numero por ele mesmo menos 1
		return n * fatorial(n-1);
	}
	
	
	
	
	
}
