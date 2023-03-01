package quantas_vezes_aparece;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
	
		Controller c = new Controller();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor que deseja saber quantas vezes aparece");
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		int valor = c.somaQuantidadeNum(num, num2);
		System.out.println(valor);
		
		
		
		
		
		
	}

}
