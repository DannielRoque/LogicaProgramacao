package EExercicios_Matriz;

import java.util.Scanner;

public class Exerc_06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String jogador1, jogador2;
        String[][] velha = new String[3][3];
        int laco = 1, linha=1,coluna=1,teste=1;

        System.out.println("Início de Jogo\n");

        for(int i =0; i< 3; i++){
            for(int j = 0; j<3; j++){
                velha[i][j] = "-";
            }
        }

        while (laco!=0) {
            System.out.println("Jogador 1 informe a posição desejada");
            while (teste!=0){
                if(linha>=1 && linha <=3){
                    System.out.println(" Linha 1 - 3");
                    linha = ler.nextInt();
                    teste=0;
                }else{
                    System.out.println("Linha inválida");
                    teste=1;
                }
            }
            teste=1;
            while (teste!=0) {
                if (coluna>0 && coluna <=3){
                    System.out.println("Coluna 1 - 3");
                    coluna = ler.nextInt();
                    teste=0;
                }
            }
            velha[linha - 1][coluna - 1] = "X";
            if (velha[0][0] == "X" && velha[0][1] == "X" && velha[0][2] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[1][0] == "X" && velha[1][1] == "X" && velha[1][2] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[2][0] == "X" && velha[2][1] == "X" && velha[2][2] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[0][0] == "X" && velha[1][1] == "X" && velha[2][2] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[0][2] == "X" && velha[1][1] == "X" && velha[2][0] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[0][0] == "X" && velha[1][0] == "X" && velha[2][0] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[0][1] == "X" && velha[1][1] == "X" && velha[2][1] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            } else if (velha[0][2] == "X" && velha[1][2] == "X" && velha[2][2] == "X") {
                System.out.println("Vencedor Jogador 1");
                laco = 0;
            }


                System.out.println("Jogador 2 informe a posição desejada");
            teste=1;
                while (teste!=0) {
                    if (linha>0 && linha <=3){
                        System.out.println(" Linha 1 - 3");
                        linha = ler.nextInt();
                        teste=0;
                    }
                }
                teste=1;
                while (teste!=0) {
                    if (linha>0 && linha <=3){
                        System.out.println("Coluna 1 - 3");
                        coluna = ler.nextInt();
                        teste=0;
                    }
                }
                    velha[linha - 1][coluna - 1] = "O";
                    if (velha[0][0] == "O" && velha[0][1] == "O" && velha[0][2] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[1][0] == "O" && velha[1][1] == "O" && velha[1][2] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[2][0] == "O" && velha[2][1] == "O" && velha[2][2] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[0][0] == "O" && velha[1][1] == "O" && velha[2][2] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[0][2] == "O" && velha[1][1] == "O" && velha[2][0] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[0][0] == "O" && velha[1][0] == "O" && velha[2][0] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[0][1] == "O" && velha[1][1] == "O" && velha[2][1] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    } else if (velha[0][2] == "O" && velha[1][2] == "O" && velha[2][2] == "O") {
                        System.out.println("Vencedor Jogador 2");
                        laco = 0;
                    }

                for(int i =0; i< 3; i++){
                    for(int j = 0; j<3; j++){
                        System.out.print("       "+velha[i][j]);
                    }
                    System.out.println();
                }
            }

        }

    }


