package divisao_recursiva;

// Criar uma fun��o recursiva que receba o dividendo e o divisor de uma
// opera��o de divis�o e, por subtra��es, exiba o resto da divis�o



public class Controller {

	public double divisao(double num, double divisor) {
		// se num for < que divisor, então retorne num
		if(num < divisor) {
			return num;
		}
		// senao, devolva numero a recursiva até que num sea menor < divisor 
		return divisao(num-divisor, divisor);
		
		
	}
	
	
	
	
}
