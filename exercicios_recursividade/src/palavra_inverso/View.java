package palavra_inverso;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		
		
		System.out.println("Informe a palavra que deseja ver ao inverso");
		String palavra = scan.nextLine();
		int tamanho = palavra.length();
		
		System.out.println(c.inverso(palavra, tamanho));
		
		
		
		
		
	}

}
