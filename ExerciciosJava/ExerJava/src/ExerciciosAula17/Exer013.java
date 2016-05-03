package ExerciciosAula17;

import java.util.Scanner;

public class Exer013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Taboada de multiplicação.");
		System.out.print("\nDigite o número que deseja ver a taboada: ");
		int num = scan.nextInt();
		for (int i = 0; i <= 10; i++){
			System.out.println(num+" X "+i+"  = "+(i*num));
		}
	}
}
