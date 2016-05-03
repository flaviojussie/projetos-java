package ExerciciosAula17;

import java.util.Scanner;

public class Exer014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int impar= 0;
		int par= 0;
		for (int i = 0; i < 10; i++){
			System.out.print("Insira o "+(i+1)+"º número: ");
			int num = scan.nextInt();
			if (num%2==0){
				par++;
			}else{
				impar++;
			}
		}
		System.out.println("O numero de impares é "+impar);
		System.out.println("\nO numero de pares é "+par);
	}
}
