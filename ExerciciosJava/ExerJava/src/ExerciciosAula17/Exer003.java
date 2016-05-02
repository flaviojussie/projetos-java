package ExerciciosAula17;

import java.util.Scanner;

public class Exer003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux;
		do{
			aux =0;
			System.out.println("Digite um nome:");
			String nome = scan.nextLine();
			if (nome.length()<=3){
				System.out.println("O nome deve conter mais de 3 letras!\n");
				aux = 1;
			}
		}while(aux!= 0);
		do{
			aux =0;
			System.out.println("Digite sua idade:");
			int idade = scan.nextInt();
			if (idade < 0 || idade > 150){
				System.out.println("Essa idade é inválida\n!");
				aux = 1;
			}
		}while(aux!= 0);
		do{
			aux =0;
			System.out.println("Digite seu salário:");
			int salario = scan.nextInt();
			if (salario <= 0){
				System.out.println("Informação inválida!\n");
				aux = 1;
			}
		}while(aux!= 0);
		do{
			System.out.println("Digite seu sexo:");
			String sexo = scan.nextLine();
			if (sexo.equals("f")|| sexo.equals("m")){
				aux = 0;
			}else {
				System.out.println("Sexo Inválido!\n");
				aux = 1;
			}
		}while(aux!= 0);
		
		do{
			System.out.println("Digite seu estado civíl:");
			String sexo = scan.nextLine();
			if (sexo.equals("s")|| sexo.equals("c")|| sexo.equals("v") || sexo.equals("d")){
				aux = 0;
			}else {
				System.out.println("Estado civíl inválido!\n");
				aux = 1;
			}
		}while(aux!= 0);
	}

}
