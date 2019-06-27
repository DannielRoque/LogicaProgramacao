package EExercicios_Matriz;

import java.util.Random;
import java.util.Scanner;

public class Exerc_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int dia,horario, esc=1;
       String comp;
       String [][] agenda = new String [30][24];

       for(int i=0; i<30; i++){
           for (int j=0;  j<24; j++){
               agenda[i][j]= "Disponível";
           }
       }

       while (esc!=0) {
           System.out.println("Escolha a opção desejada");
           System.out.println("1 - Incluir na agenda \n2 - verificar agenda\n0 - Sair");
           esc = ler.nextInt();

           switch (esc) {
               case 1:
                   System.out.println("Informe o Dia");
                   dia = ler.nextInt();
                   System.out.println("Informe o Horário");
                   horario = ler.nextInt();
                   System.out.println("Informe o compromisso");
                   comp = ler.next();
                   agenda[dia][horario] = comp;

                   break;
               case 2:
                   System.out.println("Informe o Dia");
                   dia = ler.nextInt();
                   System.out.println("Informe o Horário");
                   horario = ler.nextInt();
                   System.out.println(" Compromisso na data Informada " + agenda[dia][horario]);
                   System.out.println();
                   break;
               default:
                   System.out.println("Opção inválida");

           }
       }

    }
}
