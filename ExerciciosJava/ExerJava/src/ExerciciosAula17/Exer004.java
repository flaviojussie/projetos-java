package ExerciciosAula17;

import java.util.Scanner;

public class Exer004 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux;
		do{
			
			aux = 0;
			System.out.println("Digite a população da cidade A:");
			float a = scan.nextInt();
			System.out.println("Digite a população da cidade B:");
			float b = scan.nextInt();
			int i;
			for (i = 0; a <= b; i++){
				a = (float) (a+(a * 0.03));
				System.out.println(a);
				b = (float) (b+(b * 0.015));
			}
				System.out.println("Em "+i+" anos a população da cidade A deve ultrapassar a da cidade B.");
				System.out.println("Cidade A = "+a+" Habitantes");
				System.out.println("Cidade B = "+b+" Habitantes\n\n");
				System.out.println("Para continuar testando digite [1]:");
				aux = scan.nextInt();
				
		}while(aux == 1);
	}

}
