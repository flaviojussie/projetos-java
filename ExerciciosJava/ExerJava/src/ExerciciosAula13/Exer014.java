package ExerciciosAula13;

import java.util.Scanner;

public class Exer014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite tamanho do Arquivo em MB: ");
		float arquivo = in.nextFloat();
		System.out.println("Digite a velocidade da internet em MB/s: ");
		float internet = in.nextFloat();
		// Conversão de MB para Byte.
		float arqbyte = (float) arquivo/1024;
		float interbyte = (float) internet*1000000/8192;
		float tempo = (float)(arqbyte/interbyte)/60;
		System.out.println("O tempo estimado de download é: "+tempo);
		

	}

}
