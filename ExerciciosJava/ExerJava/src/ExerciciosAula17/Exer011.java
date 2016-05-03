package ExerciciosAula17;

import java.util.Scanner;

public class Exer011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		System.out.print("Digite o número incial: ");
		int inicio = scan.nextInt();
		System.out.print("Digite o número final: ");
		int fim = scan.nextInt();
		for (int i = inicio; i < fim; i++){
			if (i > inicio && i < fim){
				System.out.print(i+" ");
				soma = soma + i;
			}
		}
		System.out.println("\nA soma dos números do intervalo é "+soma);
	}
}
