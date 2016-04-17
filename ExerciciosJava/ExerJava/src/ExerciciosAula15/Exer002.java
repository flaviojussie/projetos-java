package ExerciciosAula15;

import java.util.Scanner;

public class Exer002 {

	/**
	 * Faça um Programa que peça um valor e mostre na tela se o valor é
	 * positivo ou negativo.
	 * 
	 * @Autor Flávio Jussiê
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num = scan.nextInt();
		if (num < 0){
			System.out.println("O número digitado é negativo.");
		}else{
			System.out.println("O número digitado é positivo.");
		}		
	}
}
		
		