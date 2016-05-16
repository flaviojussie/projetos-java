if(jogoVelha[0][0].equals(jogoVelha[0][1]) && jogoVelha[0][2].equals("3")){
				jogoVelha[0][2]= "O";
				jogVelha[0][2] = 3;
				b=1;
			}
			if(jogoVelha[0][0].equals(jogoVelha[0][2]) && jogoVelha[0][1].equals("2")){
				jogador= 2;
				jogoVelha[0][1]= "O";
				b=1;
			}
			if(jogoVelha[0][1].equals(jogoVelha[0][2]) && jogoVelha[0][0].equals("1")){
				jogador= 1;
				jogoVelha[0][0]= "O";
				b=1;
			}
			if(jogoVelha[1][0].equals(jogoVelha[1][1]) && jogoVelha[1][2].equals("6")){
				jogador= 6;
				jogoVelha[1][2]= "O";
				b=1;
			}
			if(jogoVelha[1][0].equals(jogoVelha[1][2]) && jogoVelha[1][1].equals("5")){
				jogador= 5;	
				jogoVelha[1][1]= "O";
				b=1;
			}
			if(jogoVelha[1][1].equals(jogoVelha[1][2]) && jogoVelha[1][0].equals("4")){
				jogador= 4;
				jogoVelha[1][0]= Integer.toString(jogador);
				b=1;
			}
			if(jogoVelha[2][0].equals(jogoVelha[2][1]) && jogoVelha[2][2].equals("9")){
				jogador= 9;
				jogoVelha[2][2]= Integer.toString(jogador);
				b=1;
			}
			if(jogoVelha[2][0].equals(jogoVelha[2][2]) && jogoVelha[2][1].equals("8")){
					jogador= 8;
					jogoVelha[2][1]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[2][1].equals(jogoVelha[2][2]) && jogoVelha[2][0].equals("7")){
					jogador= 7;
					jogoVelha[2][0]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][0].equals(jogoVelha[1][0]) && jogoVelha[2][0].equals("7")){
					jogador= 7;
					jogoVelha[2][0]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][0].equals(jogoVelha[2][0]) && jogoVelha[1][0].equals("4")){
					jogador= 4;
					jogoVelha[1][0]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[1][0].equals(jogoVelha[2][0]) && jogoVelha[0][0].equals("1")){
					jogador= 1;
					jogoVelha[0][0] = Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][1].equals(jogoVelha[1][1]) && jogoVelha[2][1].equals("8")){
					jogador= 8;
					jogoVelha[2][1]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][1].equals(jogoVelha[2][1]) && jogoVelha[1][1].equals("5")){
					jogador= 5;
					jogoVelha[1][1]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[1][1].equals(jogoVelha[2][1]) && jogoVelha[0][1].equals("2")){
					jogador= 2;
					jogoVelha[0][1]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][2].equals(jogoVelha[1][2]) && jogoVelha[2][2].equals("9")){
					jogador= 9;
					jogoVelha[2][2]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][2].equals(jogoVelha[2][2]) && jogoVelha[1][2].equals("6")){
					jogador= 6;
					jogoVelha[1][2]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[1][2].equals(jogoVelha[2][2]) && jogoVelha[0][2].equals("3")){
					jogador= 3;
					jogoVelha[0][2]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][0].equals(jogoVelha[1][1]) && jogoVelha[2][2].equals("9")){
					jogador= 9;
					jogoVelha[2][2]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][0].equals(jogoVelha[2][2]) && jogoVelha[1][1].equals("5")){
					jogador= 5;
					jogoVelha[1][1]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[1][1].equals(jogoVelha[2][2]) && jogoVelha[1][1].equals("1")){
					jogador= 1;
					jogoVelha[1][1]= Integer.toString(jogador);
					b=1;
			}
			if(jogoVelha[0][2].equals(jogoVelha[1][1]) && jogoVelha[2][0].equals("7")){
				jogador= 7;
				jogoVelha[2][0]= Integer.toString(jogador);
				b=1;
			}
			if(jogoVelha[0][2].equals(jogoVelha[2][0]) && jogoVelha[1][1].equals("5")){
				jogador= 5;
				jogoVelha[1][1]= Integer.toString(jogador);
				b=1;
			}
			if(jogoVelha[1][1].equals(jogoVelha[2][2]) && jogoVelha[0][2].equals("3")){
				jogador= 3;
				jogoVelha[0][2] = Integer.toString(jogador);
				b=1;
			}
			if(b==0){
				jogador=numAleatorio.nextInt(9);
				jogador2= Integer.toString(jogador);

				for(int i=0; i<3; i++){
					for(int j=0; j<3; j++){
						if(jogador2.equals(jogoVelha[i][j])){
							jogoVelha[i][j] = "O";
							jogVelha[i][j] = jogador;
							control = 1;
						}			
					}
				}
		}
		//}while(control==0);
		fimJogo++;
		int a = 1;
		jogar(a);
	}
	