package ExerciciosAula15;

import java.util.Scanner;

public class Exer008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float menor = Float.MAX_VALUE;
		
		for (int i = 1; i <= 3; i++){
		
			System.out.println("Digite o "+ i+" º preço:");
			float num = scan.nextFloat();
				
			if (menor > num){
				menor = num;
			}
		}
		System.out.println("O valor do produto mais barato é: R$ "+menor);
	}

}
