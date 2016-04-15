package ExerciciosAula13;

import java.util.Scanner;

public class Exer012 {

	/**
	 * Tendo como dados de entrada a altura de uma pessoa, construa um
	 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
     * (72.7*altura) - 58
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		float alt = in.nextFloat();
		float peso = (float) (((72.7)*alt) - 58);
		System.out.println("Seu peso ideal é "+peso+" Kg");
		

	}

}
