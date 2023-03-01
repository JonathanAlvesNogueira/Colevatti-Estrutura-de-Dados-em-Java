package fibonacci_recursivo;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		int num = scan.nextInt();
		
		int valor = c.fibonacci(num);
		System.out.println(valor);
		
		
		
		
		
		
	}

}
