package ExerciciosAula13;

import java.util.Scanner;

public class Exer013 {

	/**
	 * autor Flavio
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor da hora trabalhada: ");
		float valorHora = in.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		float horaMes = in.nextInt();
		float salBruto = (valorHora * horaMes);	
		float inss = (float) (salBruto*0.08);
		float sind = (float) (salBruto*0.05);
		float imp = (float) (salBruto*0.11);
		float salLiquido = (float) (valorHora*horaMes-(inss+sind+imp));
		System.out.println("O salário bruto: "+salBruto);
		System.out.println("Quanto pagou ao INSS: "+inss);
		System.out.println("Quanto pagou ao sindicato: "+sind);
		System.out.println("Quanto pagou ao IR: "+imp);
		System.out.println("O salário líquido: "+salLiquido);	
		System.out.println("Total de desconto: "+(inss+sind+imp));

	}

}
