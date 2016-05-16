package ExerciciosAula20;

import java.util.Random;
import java.util.Scanner;

public class Teste {
	public static String[][]jogoVelha = new String[3][3];
	public static int [][]jogVelha = new int[3][3];
	public static int numJogadores;
	public static int fimJogo = 0;
	public static boolean[] jog = new boolean[8];
	
	public static void main(String[] args) {
		menu();

	}	
	public static void menu (){
		// Variáveis locais:
		int menu;
		int control=0;
//----------------------------Menu  Principal----------------------------
		Scanner scan = new Scanner(System.in);
		System.out.println("  ///////////////////////////////////");
		System.out.println(" //  Bem vindo ao Jogo da velha!  //");
		System.out.println("///////////////////////////////////\n");
		System.out.println("-----------------------------------");
		System.out.println("| Jogar contra o computador -[1]. |");
		System.out.println("| Jogar contra um oponente  -[2]. |");
		System.out.println("-----------------------------------");
		System.out.print("Digite sua opção: ");
		do{
			menu = scan.nextInt();
			if(menu<=0|| menu>=3){
				System.out.println("Opção Inválida!");
				control = 0;
			}
		}while(control==1);
		
		if(menu==1){
			numJogadores = 1;
		}else if(menu==2){
			numJogadores = 2;
		}	
		estrutjogo();
		int a=1;
		jogar(a);
	}
	
//---------------------Esse método Preenche a matriz---------------------------
	
	public static void estrutjogo(){	
		int cont=1;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				jogoVelha[i][j] = Integer.toString(cont++);
			}
		}	
		
		for(int i=0; i<8; i++){
				jog[i] = true;
		}	
	}
	
//-----------------------Esse método imprime a estrutura do jogo---------------	
	
	public static void jogar(int a){
		for (int i=0; i<10; i++){
		    System.out.println();
		}
		int cont=0;
		int control=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(jogoVelha[i][j]);
				control++;
				if(cont <= 1){
					System.out.print("  | ");
					cont++;
				}else if(cont>1 && control<9){
					System.out.println("\n---+----+---");
					cont = 0;
				}
			}
		}
		vencedor(a);
		
		if(a==1){
			jogador1();
		}
		if(numJogadores == 2){
			if(a==2){
				jogador2();
			}
		}else{
			computador();	
		}
	}
	
//---------------------------Jogador 1-------------------------------------
	
	public static void jogador1 (){	
		Scanner scan = new Scanner(System.in);
		String jogador1;
		int invalid;
		System.out.println("\n\nSua vez jogador 1, digite sua jogada:");
		do{
			invalid=0;
			int jogador = scan.nextInt();
			jogador1=Integer.toString(jogador);
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(jogador1.equals(jogoVelha[i][j])){
						jogoVelha[i][j] = "X";
						jogVelha[i][j] = jogador;
					}else if (jogVelha[i][j] == jogador){				
						System.out.println("Jogada inválida, por digite outra posição.");
						invalid = 1;
					}	
				}
			}
		}while(invalid == 1);
		fimJogo++;
		int a = 2;
		jogar(a);
	}
	
//---------------------------Jogador 2-------------------------------------
	
	public static void jogador2(){	
		Scanner scan = new Scanner(System.in);
		String jogador2;
		int invalid;
		System.out.println("\n\nSua vez jogador 2, digite sua jogada");
		do{
			invalid=0;
			int jogador = scan.nextInt();
			jogador2=Integer.toString(jogador);
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(jogador2.equals(jogoVelha[i][j])){
						jogoVelha[i][j] = "O";
						jogVelha[i][j] = jogador;
					}else if (jogVelha[i][j] == jogador){				
						System.out.println("Jogada inválida, por digite outra posição.");
						invalid = 1;
					}	
				}
			}
		}while(invalid == 1);
		fimJogo++;
		int a = 1;
		jogar(a);
	}	
	
//---------------------------Computador-------------------------------------
	
	public static void computador(){	
		Random numAleatorio = new Random();
		String jogador2 = " ";
		int control=0;
		int jogador = 0;
		do{
			if(jog[0] == true){
				if(jogoVelha[0][0].equals(jogoVelha[0][1])){
					jogador= 3;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[0][0].equals(jogoVelha[0][2])){
					jogador= 2;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[0][1].equals(jogoVelha[0][2])){
					jogador= 1;
					jogador2= Integer.toString(jogador);
				}
				jog[0] = false;
				break;
			}else if(jog[1] == true){
				if(jogoVelha[1][0].equals(jogoVelha[1][1])){
					jogador= 6;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[1][0].equals(jogoVelha[1][2])){
					jogador= 5;
					jogador2= Integer.toString(jogador);	
				}
				else if(jogoVelha[1][1].equals(jogoVelha[1][2])){
					jogador= 4;
					jogador2= Integer.toString(jogador);
				}
				jog[1] = false;
			} else if(jog[2] == true){
				if(jogoVelha[2][0].equals(jogoVelha[2][1])){
					jogador= 9;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[2][0].equals(jogoVelha[2][2])){
					jogador= 8;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[2][1].equals(jogoVelha[2][2])){
					jogador= 7;
					jogador2= Integer.toString(jogador);
				}
				jog[2] = false;
			}else if(jog[3] == true){
				if(jogoVelha[0][0].equals(jogoVelha[1][0])){
					jogador= 7;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[0][0].equals(jogoVelha[2][0])){
					jogador= 4;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[1][0].equals(jogoVelha[2][0])){
					jogador= 1;
					jogador2= Integer.toString(jogador);
				}
				jog[3] = false;
			}else if(jog[4] == true){
				if(jogoVelha[0][1].equals(jogoVelha[1][1])){
					jogador= 8;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[0][1].equals(jogoVelha[2][1])){
					jogador= 5;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[1][1].equals(jogoVelha[2][1])){
					jogador= 2;
					jogador2= Integer.toString(jogador);
				}
				jog[4] = false;
			}else if(jog[5] == true){
				if(jogoVelha[0][2].equals(jogoVelha[1][2])){
					jogador= 9;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[0][2].equals(jogoVelha[2][2])){
					jogador= 6;
					jogador2= Integer.toString(jogador);	
				}
				else if(jogoVelha[1][2].equals(jogoVelha[2][2])){
					jogador= 9;
					jogador2= Integer.toString(jogador);	
				}
				jog[5] = false;
			} else if(jog[6] == true){
				if(jogoVelha[0][0].equals(jogoVelha[1][1])){
					jogador= 9;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[0][0].equals(jogoVelha[2][2])){
					jogador= 5;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[1][1].equals(jogoVelha[2][2])){
					jogador= 1;
					jogador2= Integer.toString(jogador);
				}
				jog[6] = false;
			}else if(jog[7] == true){
				if(jogoVelha[2][0].equals(jogoVelha[1][1])){
					jogador= 3;
					jogador2= Integer.toString(jogador);
				}
				else if(jogoVelha[2][0].equals(jogoVelha[0][2])){
					jogador= 5;
					jogador2= Integer.toString(jogador);
				}	
				else if(jogoVelha[1][1].equals(jogoVelha[0][2])){
					jogador= 7;
					jogador2= Integer.toString(jogador);
				}
				jog[7] = false;
			}else{
				jogador=numAleatorio.nextInt(9);
				jogador2= Integer.toString(jogador);
			}

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(jogador2.equals(jogoVelha[i][j])){
					jogoVelha[i][j] = "O";
					jogVelha[i][j] = jogador;
					control = 1;
				}			
			}
		}
		}while(control==0);
		fimJogo++;
		int a = 1;
		jogar(a);
	}
	
//--------------------Declaração do vencedor------------------------------
	
	public static void vencedor(int a){
		Scanner scan = new Scanner(System.in);
		String jogador=" "; 
		if(a==2){
			jogador = "Jogador 1";
		}else if(a==1 && numJogadores==2){
			jogador = "Jogador 2";
		}else if(a==1 && numJogadores==1){
			jogador = "Computador";
		}
		if(jogoVelha[0][0].equals(jogoVelha[0][1])
			&& jogoVelha[0][0].equals(jogoVelha[0][2])
			&& jogoVelha[0][1].equals(jogoVelha[0][2])
			
			|| jogoVelha[1][0].equals(jogoVelha[1][1])
			&& jogoVelha[1][0].equals(jogoVelha[1][2])
			&& jogoVelha[1][1].equals(jogoVelha[1][2])
			
			|| jogoVelha[2][0].equals(jogoVelha[2][1])
			&& jogoVelha[2][0].equals(jogoVelha[2][2])
			&& jogoVelha[2][1].equals(jogoVelha[2][2])
			
			|| jogoVelha[0][0].equals(jogoVelha[1][0])
			&& jogoVelha[0][0].equals(jogoVelha[2][0])
			&& jogoVelha[1][0].equals(jogoVelha[2][0])
			
			|| jogoVelha[0][1].equals(jogoVelha[1][1])
			&& jogoVelha[0][1].equals(jogoVelha[2][1])
			&& jogoVelha[1][1].equals(jogoVelha[2][1])

			|| jogoVelha[0][2].equals(jogoVelha[1][2])
			&& jogoVelha[0][2].equals(jogoVelha[2][2])
			&& jogoVelha[1][2].equals(jogoVelha[2][2])
			
			|| jogoVelha[0][0].equals(jogoVelha[1][1])
			&& jogoVelha[0][0].equals(jogoVelha[2][2])
			&& jogoVelha[1][1].equals(jogoVelha[2][2])
			
			|| jogoVelha[2][0].equals(jogoVelha[1][1])
			&& jogoVelha[2][0].equals(jogoVelha[0][2])
			&& jogoVelha[1][1].equals(jogoVelha[0][2])){ 
			
			fimJogo=10;
		}
		
		if(fimJogo==10){
			System.out.println("\n\nParabéns "+jogador+" você é o vencedor");
			System.out.println("\n\nNovo Jogo - [1]");
			int novo = scan.nextInt();
			if(novo==1){
				menu();
			}
		}
		if(fimJogo == 9){
			System.out.println("\n\nNessa partida não houve vencedor");
			System.out.println("\n\nNovo Jogo - [1]");
			int novo = scan.nextInt();
			if(novo==1){
				menu();
			}			
		}
	}
}
