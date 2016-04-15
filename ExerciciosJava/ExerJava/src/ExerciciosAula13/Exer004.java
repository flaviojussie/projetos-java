package ExerciciosAula13;

import java.util.Scanner;

public class Exer004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = in.nextInt();
		System.out.println("Digite a segunda nota: ");
		float nota2 = in.nextInt();
		System.out.println("Digite a terceira nota: ");
		float nota3 = in.nextInt();
		System.out.println("Digite a quarta nota: ");
		float nota4 = in.nextInt();
		float media = (nota1 + nota2 + nota3 + nota4)/4; 
		System.out.println("Sua media é: "+media);
			

	}

}
