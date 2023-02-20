package digitos_num;

/*  Crie uma função recursiva que exiba a quantidade de dígitos de um
número inteiro passado como parâmetro */


public class Controller {

	public int digitos(int num) {
		
		
		// se numero for < 10 ou numero > -10 então sabemos que ele tem 1 digito
		if(num < 10 && num > -10) {
			return 1;
		} 
		// senao devemos somar 1 digito e devolver o numero divido por 10 para a recursiva
			return 1 + digitos(num/10);
		
	}
	
	
	
}
