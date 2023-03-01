package fibonacci_recursivo;

public class Controller {

	public int fibonacci(int num) {
		
		// se num for menor que 2 então retornamos a soma do valor
		if(num < 2) {
			return num;
		// senao, se num for maior que 2, conseguimos aplicar a soma do numero-1 + numero-2 
		}else {
			return fibonacci(num-1) + fibonacci(num-2); 
		}
	}
	
	
	
	
}
