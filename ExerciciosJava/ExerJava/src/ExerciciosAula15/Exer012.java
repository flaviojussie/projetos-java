package ExerciciosAula15;

import java.util.Scanner;

public class Exer012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int aux = Integer.MIN_VALUE;
		
		System.out.println("Digite o 1º número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o 2º número:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o 3º número:");
		int num3 = scan.nextInt();
				
		if (num1 < num2){
			aux = num2;		
			num2 = num1;
			num1 = aux;
		}
		if(num1 < num3){
			aux = num3;
			num3 = num1;
			num1 = aux;
		}
		if(num2 < num3){
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		System.out.println(num1 +" "+num2+" "+num3);
	}

}
