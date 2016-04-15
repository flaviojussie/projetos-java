package ExerciciosAula13;

import java.util.Scanner;

public class Exer005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor em metros: ");
		float metro = in.nextFloat();
		float cent = metro*100;
		System.out.println("O valor em Centimetros é: "+cent);
		
	}

}