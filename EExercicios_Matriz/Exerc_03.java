package EExercicios_Matriz;

import java.util.Random;
import java.util.Scanner;

public class Exerc_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] mat= new int[3][3];
        int impar =0, par =0;

        System.out.println("Informe os valores da Matriz");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat[i][j]= ler.nextInt();
            }


        }
        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(mat[i][j]%2==0){
                    par++;
                }else{
                    impar ++;
                }
                System.out.print("  "+mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Quantidade de valores pares: "+par+" Valores Impares: "+impar);
    }
}
