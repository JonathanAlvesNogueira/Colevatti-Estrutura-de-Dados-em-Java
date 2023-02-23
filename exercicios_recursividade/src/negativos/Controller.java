package negativos;

public class Controller {

	
	public int negativos(int[] num, int lenght) {
		// se tamanho for menor que 0 o vetor termina
		if(lenght < 0) {
			return 0;
		// senao, se o numero no indice length for menor que 0, então somamos 1, e retornamos a recursividade
		} else if (num[lenght] < 0) {
			return 1 + negativos(num, lenght- 1);
		//senao, se numero for positivo e o tamanho do array andado for maior que 0 então retornamos a recursividade, sem somar +1
		//porque não precisamos contar esse número
		} else {
			return negativos(num, lenght-1);
		}
		
	}
	
	
	
}
