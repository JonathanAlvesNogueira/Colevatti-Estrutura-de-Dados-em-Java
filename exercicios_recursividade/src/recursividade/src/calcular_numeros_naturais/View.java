package calcular_numeros_naturais;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		int num = scan.nextInt();
		
		
		System.out.println(c.calculaNaturais(num));
		
		
		
		
		
	}

}
