package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[5];
        int maior;
        System.out.println("Informe o primeiro numero");
        for(int i=0;i<vet.length;i++){
            vet[i]=ler.nextInt();
        }
        maior=vet[0];

        for(int i=0;i<vet.length;i++){
            if(vet[i]>maior){
                maior=vet[i];
            }
        }
        System.out.println("Maior: "+maior);
    }
}
