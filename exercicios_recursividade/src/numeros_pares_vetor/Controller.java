package numeros_pares_vetor;

/*
Construir uma função recursiva que receba um vetor e seu tamanho
e apresente a quan�dade de números pares existentes no vetor.
Considere que a entrada deve ser, apenas de números naturais
diferentes de zer
*/


public class Controller {


		public static int par(int num[], int tamanho) {
			// se tamanho do vetor for < 0 então não retorne nada
			if (tamanho < 0) {
				return 0;
				// senao, se num na posição x for par retorne o valor 1 + a recursiva
			} else if (num[tamanho] % 2 == 0) {
				return 1 + par(num, tamanho - 1);
			}
			// se numero não for par retorne a recursiva diminuindo o indice vetor
			return par(num, tamanho - 1);

		}
	

}
