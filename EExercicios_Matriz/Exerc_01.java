package EExercicios_Matriz;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exerc_01 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[][] m = new int[4][4];
        int maior,linha=0, coluna=0;

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                m[i][j]=gerar.nextInt(9)+1;
                System.out.print("   "+m[i][j]);
            }
            System.out.println();
        }
        maior = m[0][0];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(m[i][j]>maior){
                    maior = m[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println(" Maior Valor = "+maior+" Linha: "+linha+" coluna: "+coluna);

    }
}
