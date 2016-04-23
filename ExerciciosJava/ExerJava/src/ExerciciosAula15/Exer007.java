package ExerciciosAula15;

import java.util.Scanner;

public class Exer007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 1; i <= 3; i++){
		
			System.out.println("Digite o "+ i+" º número");
			int num = scan.nextInt();
			if (maior < num){
				maior = num;
			}
			
			if (menor > num){
				menor = num;
			}
		}
		System.out.println("O maior número é: "+maior);
		System.out.println("O menor número é: "+menor);
	}

}
