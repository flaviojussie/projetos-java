package ExerciciosAula13;

import java.util.Scanner;

public class Exer013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor da hora trabalhada: ");
		float valorHora = in.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		float horaMes = in.nextInt();
		float salario = (valorHora * horaMes);	
		salario *= (0.05 +0.11 +0.08);
		System.out.println("O salário do mês é: "+ salario);		

	}

}
