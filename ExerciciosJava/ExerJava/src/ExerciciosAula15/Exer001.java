package ExerciciosAula15;

import java.util.Scanner;

public class Exer001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cont = 0;
		int maior = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		while (cont < 2){
			System.out.print("Digite um número: ");
			int num = scan.nextInt();
			if (num > maior){
				maior = num;
			}
			cont++;
		}
		System.out.println(maior+" é o maior número.");	
		
	}
}
		
		