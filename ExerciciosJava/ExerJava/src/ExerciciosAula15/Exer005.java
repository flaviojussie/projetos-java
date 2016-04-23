package ExerciciosAula15;

import java.util.Scanner;

public class Exer005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Digite a primeira nota:");
		 float nota1 = scan.nextFloat();
		 System.out.println("Digite a segunda nota:");
		 float nota2 = scan.nextFloat();
		 float media = (nota1 + nota2)/2;
		 if (media >= 7){
			 System.out.println("Aprovado");
		 }else if (media < 7){
			 System.out.println("Reprovado");
		 }else if (media == 10){
			 System.out.println("Aprovado com Distinção");
		 }
		 
		 
	}

}
