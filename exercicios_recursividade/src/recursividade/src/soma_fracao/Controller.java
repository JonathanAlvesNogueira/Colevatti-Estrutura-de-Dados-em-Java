package soma_fracao;

public class Controller {

	public double SomaFracao(double num) {
		// se num for menor que 2 então retornamos 1
		if(num < 2) {
			return 1;
		// senao retornamos o 1/numero menos 1 para somar com a fração atual
		} else {
			return SomaFracao(num - 1) + 1/num;
		}
	}
	
	
	
	
}
