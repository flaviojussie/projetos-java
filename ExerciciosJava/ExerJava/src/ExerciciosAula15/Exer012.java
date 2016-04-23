package ExerciciosAula15;

import java.util.Scanner;

public class Exer012 {

	/**
	 * Faça um Programa que pergunte em que turno você estuda. Peça
	 * para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
	 * mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
	 * Inválido!", conforme o caso.
	*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1º número:");
		String turno = scan.nextLine();
		switch (turno){
		case ("m"):
			System.out.println("Bom dia!");
			break;
		case ("v"):
			System.out.println("Boa tarde!");
			break;
		case ("n"):
			System.out.println("Boa tarde!");
			break;
		default:
			System.out.println("Valor Inválido!");
			break;	
		
		}

	}

}
