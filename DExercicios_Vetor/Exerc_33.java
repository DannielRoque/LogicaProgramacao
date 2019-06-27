package DExercicios_Vetor;

import java.util.Random;

public class Exerc_33 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[10];
        int cont = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = gerar.nextInt(20) + 1;
        }

        for (int i = 0; i < a.length; i++) {
            cont=0;
           for (int j = 1; j <= 20; j++) {
                if ((a[i] % j == 0)) {
                    cont++;
                }
            }
            if (cont > 2) {
                    System.out.println(" Posição " + i + " do Vetor A não é Primo " + a[i]+" cont"+cont);
                } else {
                    System.out.println(" Posição " + i + " do Vetor A é Primo " + a[i]+" cont"+cont);
                }
            }

        }
    }

