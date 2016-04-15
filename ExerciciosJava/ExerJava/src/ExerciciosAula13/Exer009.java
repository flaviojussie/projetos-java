package ExerciciosAula13;

import java.util.Scanner;

public class Exer009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit: ");
		float f = in.nextFloat();
		float c = (5 * (f-32) / 9);
		System.out.println("A teemperatura em Celsius é: "+ c);
		
	}

}
