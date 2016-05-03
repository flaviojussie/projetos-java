package ExerciciosAula17;

import java.util.Scanner;

public class Exer008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int i;
		for (i = 0; i < 5; i++){
			System.out.println("Digite o "+(i+1)+"º número:");
			int num = scan.nextInt();
			soma = soma + num;
		}
		float media = soma/i;
		System.out.println("A soma de todos os números é: "+soma);
		System.out.println("A média dos números digitados é: "+media);
	}

}
