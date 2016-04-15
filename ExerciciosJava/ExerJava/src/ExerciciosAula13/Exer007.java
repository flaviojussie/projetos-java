package ExerciciosAula13;

import java.util.Scanner;

public class Exer007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valr do raio: ");
		float raio = in.nextFloat();
		float area = (2*raio);
		System.out.println("O valor da área da circunferncia é "+area);

	}
}
