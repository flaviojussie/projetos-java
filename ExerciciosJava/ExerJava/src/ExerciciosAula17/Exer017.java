package ExerciciosAula17;

import java.util.Scanner;

public class Exer017 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Cálculo do Fatorial.");
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		int i = num-1;
		do{
			System.out.print(num+" X "+i+" = ");
			num = num*i;
			System.out.println(num);
			i--;
		}while(i != 0);
	}
}
