package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tot=0;
        System.out.println("Informe a quantidade de turma");
        int turma=ler.nextInt();

        for(int i=1;i<=turma;i++){

            System.out.println("Informe a quantidade de alunos da turma "+i);
            int aluno=ler.nextInt();
            if(aluno>40){
                System.out.println("Quantidade inválida vamos retomar novamente !");
                i--;
            }else {
                tot += aluno;
            }
        }
        System.out.println("Média de alunos por turma: "+(tot/turma));
    }
}
