package quantas_vezes_aparece;

public class Controller {

	
	
	public int somaQuantidadeNum(int num1, int num2) {
		if(num1 == 0) { 
			return 0; //Se for = a 0, ele retorna o 0;
		}
		
		// num > 1 = verificar se o resto é igual ao segundo numero
		if(num1%10 == num2) {
			return 1 + somaQuantidadeNum(num1 / 10, num2);
		}
		
		//retorna a qtd de vezes que o num2 aparece no num1
		return somaQuantidadeNum(num1 / 10, num2);	
		
		
		
		
		
	}
	
	
	
	
}
