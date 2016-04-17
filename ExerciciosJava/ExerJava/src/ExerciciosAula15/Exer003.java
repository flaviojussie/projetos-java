package ExerciciosAula15;

import java.util.Scanner;

public class Exer003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo ('F'/'M'): ");
		String sexo = scan.next();
		if (sexo.equals("m") || sexo.equals("M")){
			System.out.println("M - Masculino");
		}else{
			if (sexo.equals("f") || sexo.equals("F")){
				System.out.println("F - Feminino");
			}else{
				System.out.println("Sexo indefinido");
			}
		}
	}
}
		
		