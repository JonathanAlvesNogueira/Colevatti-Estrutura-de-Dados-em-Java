package converter_binario_recursivo;


public class Controller {

	
	public String ConverteBinario(int num) {
		
		// se num == 0 ent�o significa que n]ao � possivel fazer a divis�o por 2
		if(num == 0) {
			return "";
		}
		// senao pegue o resto e adicione numa String e divida o numero por 2
		int resto = num % 2;
		num = num /2;
		return ConverteBinario(num) + resto; 
		
	}
	
	
	
}