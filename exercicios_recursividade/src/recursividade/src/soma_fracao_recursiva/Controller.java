package soma_fracao_recursiva;

public class Controller {

	
	public double fatorial(double num) {
		// se num for menor que 2 retornamos 1
		if(num < 2) {
			return 1;
			// senao retornamos num * num-1 ate chegar a num menor que 2
		}else {
			return num * fatorial(num - 1);
		}
	}
	
	public double SomandoFra(double num) {
		// se num for menor que 2 retornamos 1
		if(num < 2) {
			return 1;
		//senao, retornamos 1/fatorial do numero + o 1/fatorial do numero menos 1
		} else {
			return 1/fatorial(num) + SomandoFra(num-1);
		}
	}
	
	
	
	
	
	
	
	
	
}
