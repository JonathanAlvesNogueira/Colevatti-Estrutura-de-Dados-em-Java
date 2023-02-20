package negativos;


/* Crie uma função recursiva que exiba o total de elementos negativos
de um vetor de inteiros, de N posições, passado como parâmetro */



import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		
		
		System.out.println("Informe a posição do vetor");
		int posicao = scan.nextInt();
		
		// preenche o vetor com os numeros
		int []nums = new int[posicao];
		
		// pega o tamanho do vetor
		int length = nums.length;
		
		for(int i = 0; i < length ; i++) {
			nums[i] = scan.nextInt();
		}
		
		
		
		// chama o metodo
		System.out.println("Essa é a quantidade de numeros negativos no vetor" + c.negativos(nums, length-1));
		
		
		
		
		
		
	}

}
