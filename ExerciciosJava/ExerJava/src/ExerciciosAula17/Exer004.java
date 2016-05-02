package ExerciciosAula17;

import java.util.Scanner;

public class Exer004 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 80000;
		int b = 200000;
		int i;
		for (i = 0; a <= b; i++){
			a = (int)(a+(a * 0.03));
			b = (int)(b+(b * 0.015));
		}

			System.out.println("Em "+i+" anos a população da cidade A deve ultrapassar a da cidade B.");
			System.out.println("Cidade A = "+a+" Habitantes");
			System.out.println("Cidade B = "+b+" Habitantes");
	}

}
