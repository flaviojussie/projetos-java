package ExerciciosAula15;

import java.util.Scanner;

public class Exer004 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		if(letra.equals("a")){
			System.out.println(letra+" é uma vogal");
			}else if(letra.equals("e")){
				System.out.println(letra+" é uma vogal");
				}else if(letra.equals("i")){
					System.out.println(letra+" é uma vogal");
					}else if(letra.equals("o")){
						System.out.println(letra+" é uma vogal");
						}else if(letra.equals("u")){
							System.out.println(letra+" é uma vogal");
						}else{
							System.out.println(letra+" não é uma vogal");	
						}			
	}
}
		
		