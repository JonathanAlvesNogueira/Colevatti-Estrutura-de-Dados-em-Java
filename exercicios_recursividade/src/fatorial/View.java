package fatorial;

/*     Crie uma função recursiva que exiba o resultado do fatorial de um
número (Pela limitação da recursividade, o número de entrada deverá
ser baixo para não dar estouro(limite de entrada = 12))        */



import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		System.out.println("Informe o numero que deseja achar o fatorial");
		
		
		int num = scan.nextInt();
		if(num > 12) {
			System.out.println("O numero é maior que o permitido");
		}else {
			System.out.println(c.fatorial(num));
		}
	
		
		
		
		

	}

}
