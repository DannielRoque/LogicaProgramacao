package DExercicios_Vetor;

import java.util.Random;
import java.util.Scanner;

public class Exerc_17 {
    public static void main(String[] args) {
        Random gerar = new Random();
        Scanner ler = new Scanner(System.in);

        int[]a = new int[10];
        int cont=0;

        System.out.println("Informe a idade de cada membro do grupo ");
        for(int i=0;i<a.length;i++){
            a[i]=ler.nextInt();
            if(a[i]>35){
                cont++;
            }
        }
        System.out.println("Conforme as verificações temos "+cont+" Pessoas com mais de 35 anos");
    }
}
