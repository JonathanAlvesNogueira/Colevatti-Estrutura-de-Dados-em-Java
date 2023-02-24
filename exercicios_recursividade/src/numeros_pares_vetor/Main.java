package numeros_pares_vetor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
				Scanner scan = new Scanner(System.in);
				Controller c = new Controller();
				int[] num = new int[5];
				int tamanho = num.length;
				
				for(int i = 0; i < tamanho; i++ ) {
					num[i] = scan.nextInt();
					if(num[i] < 0) {
						num[i] = scan.nextInt();
					}
				}
				System.out.println(c.par(num, tamanho - 1));
		
		
		
		
	}

}
