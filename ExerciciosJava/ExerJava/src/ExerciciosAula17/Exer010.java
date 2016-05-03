package ExerciciosAula17;

import java.util.Scanner;

public class Exer010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o número incial: ");
		int inicio = scan.nextInt();
		System.out.print("Digite o número final: ");
		int fim = scan.nextInt();
		for (int i = inicio; i < fim; i++){
			if (i > inicio && i < fim){
				System.out.print(i+" ");
			}
		}
	}
}
