package ExerciciosAula17;

import java.util.Scanner;

public class Exer015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1= 1;
		int num2= 1;
		int num3= 0;
		System.out.println("Série de Fibonacci.");
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		
		for (int i = 0; i < 10; i++){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			System.out.print(num3+" ");
		}
	}
}
