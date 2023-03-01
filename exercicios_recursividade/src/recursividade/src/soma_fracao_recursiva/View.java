package soma_fracao_recursiva;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		
		
		int num = scan.nextInt();
		
		double valor = c.SomandoFra(num);
		System.out.println(valor);
		
		
		
		
	}

}
