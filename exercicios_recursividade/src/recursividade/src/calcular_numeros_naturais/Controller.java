package calcular_numeros_naturais;

public class Controller {


	public int calculaNaturais(int num) {
		
		// se numerp for menor que 0 ent�o ele � negativo e retornamos 0
		if(num < 0) {
			return 0;
		// senao somamos esse numero at� chegar a 0
		} else {
		return	num + calculaNaturais(num - 1);
		}
	}
	

	
	
	
	
	
	
	
	
	
	
}
