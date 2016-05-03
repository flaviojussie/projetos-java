package ExerciciosAula17;

import java.util.Scanner;

public class Exer007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++){
			System.out.println("Digite o "+(i+1)+"º número:");
			int num = scan.nextInt();
			if (num > maior){
				maior = num;
			}
		}
		System.out.println("O maior número é: "+maior);
	}

}
