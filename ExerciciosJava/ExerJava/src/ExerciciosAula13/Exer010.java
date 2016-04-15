package ExerciciosAula13;

import java.util.Scanner;

public class Exer010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		float c = in.nextFloat();
		float f = (c/5)*9+32;
		System.out.println("A temperatura em Farenheit é: "+ f+"º F");
		
	}

}
