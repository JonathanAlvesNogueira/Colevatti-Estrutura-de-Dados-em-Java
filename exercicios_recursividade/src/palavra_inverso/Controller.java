package palavra_inverso;

public class Controller {

	public String inverso(String palavra, int tamanho ) {
		// quando tamanho chega a 1, a função pega a ultima letra. Mas quando chega a 0 
		// deve- se retornar vazio pois não existe array de (-1)
		if(tamanho < 1) {
			return "";
		}
	// retorna a ultima letra até que tamanho chegue a 1
		return palavra.substring(tamanho-1, tamanho) + inverso(palavra , tamanho - 1);
	}
	
	
	
	
	
	
}
