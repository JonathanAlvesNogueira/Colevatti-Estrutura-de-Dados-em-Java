package converter_binario_recursivo;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Controller c =new Controller();
		
		System.out.println("Informe o numero que deseja ver em binario");
		int num = scan.nextInt();
		String res = c.ConverteBinario(num);
		
		System.out.println(res);
		
		
		
		
		
	}

}
