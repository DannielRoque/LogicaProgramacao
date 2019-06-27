package EExercicios_Matriz;

import java.util.Random;

public class Exerc_02 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[][] mat = new int[10][10];

        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                mat[i][j]=gerar.nextInt(9)+1;
                System.out.print("   "+mat[i][j]);
            }
            System.out.println();
        }
        int mal = mat[0][0];
        int mel = mat[0][0];
        int i=5;
            for(int j=0; j<10; j++) {
                if (mat[i][j] > mal) {
                    mal = mat[i][j];
                } else if (mat[i][j] < mel) {
                    mel = mat[i][j];
                }
            }
            System.out.println("Menor Valor da linha 5: "+mel+" Maior: "+mal);

        int mac = mat[0][0];
        int mec = mat[0][0];
        for(int k=0; k<10; k++){
            int j=7;
                if(mat[k][j]>mac){
                    mac=mat[k][j];
                }else if(mat[k][j]<mec){
                    mec = mat[k][j];

            }
        }
        System.out.println("Maior Valor coluna 7: "+mac+"  Menor: "+mec);
    }
}
