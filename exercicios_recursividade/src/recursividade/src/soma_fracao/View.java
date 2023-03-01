package soma_fracao;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		Scanner scan = new Scanner(System.in);
		
	
		int  num = scan.nextInt();
		double valor = c.SomaFracao(num);
		System.out.println(valor);
		
		
		
		
		
		
	}

}
