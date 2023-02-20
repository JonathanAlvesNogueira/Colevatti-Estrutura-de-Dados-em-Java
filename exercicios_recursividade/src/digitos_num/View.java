package digitos_num;

import java.util.Scanner;

/* Crie uma função recursiva que exiba a quantidade de dígitos de um
número inteiro passado como parâmetro   */




public class View {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		System.out.println("Informe um numero:");
		int num = scan.nextInt();
		
		System.out.println("Essa é a quantidade de digitos do numero " + c.digitos(num));
		
		
		
		
		
	}

}
