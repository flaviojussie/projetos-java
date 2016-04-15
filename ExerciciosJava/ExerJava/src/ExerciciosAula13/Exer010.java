package ExerciciosAula13;

import java.util.Scanner;

public class Exer010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite dois numeros inteiros: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Digite um numero real: ");
		float c = in.nextFloat();

		System.out
				.println("O produto do dobro do primeiro com metade do segundo é: "
						+ (a * 2) * (b / 2));
		System.out.println("A soma do triplo do primeiro com o terceiro é: "
				+ ((a * 3) + c));
		System.out.println("o terceiro elevado ao cubo: " + Math.pow(c, 3));

	}

}
