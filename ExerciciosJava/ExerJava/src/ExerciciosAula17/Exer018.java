package ExerciciosAula17;

import java.util.Scanner;

public class Exer018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Números primos.\n");
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		if (num%2 == 1 && num%num == 0 || num == 2){
			System.out.print("É primo");
		}else{
			System.out.print("Não é primo");
		}
	}
}
