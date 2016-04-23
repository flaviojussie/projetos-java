package ExerciciosAula15;

import java.util.Scanner;

public class Exer006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 3; i++){
		
			System.out.println("Digite o "+ i+" º número");
			int num = scan.nextInt();
			if (maior < num){
				maior = num;
			}
		}
		System.out.println("O maior número é: "+maior);
	}

}
