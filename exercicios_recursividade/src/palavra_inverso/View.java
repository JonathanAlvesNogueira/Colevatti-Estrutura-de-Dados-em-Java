package palavra_inverso;

/* Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres (Ex.:
entrada = teste ; saída = etset) */



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
