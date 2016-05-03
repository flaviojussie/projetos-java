package ExerciciosAula17;

public class Exer033 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float soma = 0;
		for (int i = 0; i < 5; i++){
			float decimal =((i+1f)/(i+i+1f));
			soma = soma + decimal;
			System.out.print((i+1)+"/"+(i+i+1)+" + ");
		}
	System.out.println("\n\nSoma é igual a "+soma);
	}

}
