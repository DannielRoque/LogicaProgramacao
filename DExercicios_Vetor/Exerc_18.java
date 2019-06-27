package DExercicios_Vetor;

import java.util.Random;
import java.util.Scanner;

public class Exerc_18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[]notas1=new double[10];
        double[]notas2=new double[10];
        double[]result=new double[10];

        System.out.println("Informe as notas dos alunos 1º trimestre");
        for(int i=0;i<notas1.length;i++){
            notas1[i]=ler.nextDouble();
        }
        System.out.println("Informe as notas dos alunos 2º trimestr");
        for(int i=0;i<notas1.length;i++){
            notas2[i]=ler.nextDouble();
        }

        for(int i=0;i<notas1.length;i++){
            result[i]=((notas1[i]+notas2[i])/2);
            if(result[i]>7){
                System.out.println("Aluno "+i+" foi Aprovado com nota "+result[i]);
            }else{
                System.out.println("Aluno "+i+" foi reprovado com nota "+result[i]);
            }
        }
    }
}
