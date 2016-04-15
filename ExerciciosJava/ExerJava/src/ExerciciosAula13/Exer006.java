package ExerciciosAula13;

import java.util.Scanner;

public class Exer006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valr do raio: ");
		float raio = in.nextFloat();
		float area = (float) (Math.PI*(Math.pow(raio, 2)));
		System.out.println("O valor da área da circunferncia é "+area);
	}
}
