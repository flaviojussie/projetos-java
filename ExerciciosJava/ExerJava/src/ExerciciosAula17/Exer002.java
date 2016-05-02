package ExerciciosAula17;

import java.util.Scanner;

public class Exer002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do usuário:");
		String nome = scan.nextLine();
		System.out.println("Digite a senha:");
		String senha = scan.nextLine();
		if (nome.equalsIgnoreCase(senha)){
			System.out.println("Senha invalida!");
		}

	}

}
