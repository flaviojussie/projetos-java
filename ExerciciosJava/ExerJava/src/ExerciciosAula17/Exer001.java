package ExerciciosAula17;

import java.util.Scanner;

public class Exer001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira uma nota de entre 0 e 10:");
		int num;
		do{
			num = scan.nextInt();
			if (num < 0 || num > 10){
				System.out.println("Numero Inválido!");
			} 
		}while (num < 0 || num > 10);
		System.out.println("Numero Válido!");
		

	}

}
