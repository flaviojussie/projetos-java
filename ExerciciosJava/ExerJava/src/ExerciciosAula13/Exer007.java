package ExerciciosAula13;

import java.util.Scanner;

public class Exer007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor entre com os lados do quadrado: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int area = a*b;
		System.out.println("A área do quadrado ao quadro é "+(area*2)) ;
		

	}

}