package DExercicios_Vetor;

import java.util.Random;
import java.util.Scanner;

public class Exerc_24 {
    public static void main(String[] args) {
        Random gerar = new Random();

        //teste com scanner
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[10];
        int[] vetb = new int[10];
        int j=0;

        for(int i=0; i<vet.length; i++){
            vet[i]=gerar.nextInt(30)+1;
            System.out.print(vet[i]+" - ");
        }
        System.out.println("");

        for(int i=vet.length-1; i>=0; i--){
           vetb[j]=vet[i];
            System.out.print(vetb[j]+" - ");
           j++;
        }
        int cont=0;
        for(int i=0; i<vet.length; i++){
            if(vet[i]==vetb[i]){
                cont++;
            }
        }
        System.out.println("\n");
        if(cont==vet.length){
            System.out.println("é palindromo");
        }else{
            System.out.println("não é palindromo");
        }


    }
}
