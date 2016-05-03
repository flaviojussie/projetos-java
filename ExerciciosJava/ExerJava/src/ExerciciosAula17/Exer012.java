package ExerciciosAula17;

import java.util.Scanner;

public class Exer012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a base:");
		int base = scan.nextInt();
		int resultado;
		System.out.print("Digite o expoente:");
		int expoente = scan.nextInt();
		resultado = base;
		for (int i = 1; i < expoente; i++){
			resultado = resultado * base;
		}
		System.out.print(resultado);
	}
}
