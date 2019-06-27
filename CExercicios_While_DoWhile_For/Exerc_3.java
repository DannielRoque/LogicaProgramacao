package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        boolean validacao = false;
        String sexo, estadoCivil;
        do{
            System.out.println("Informe seu nome");
            nome = ler.next();
            if (nome.length()>=3){
                validacao=true;
            }else{
                System.out.println("Informe nome com mais de 3 caractere");
            }
        }while (!validacao);

        do{
            System.out.println("Informe sua idade");
            idade = ler.nextInt();
            if (idade >0 && idade<150){
                validacao=true;
            }else{
                System.out.println("Informe idade entre 0-150");
            }
        }while (!validacao);
        do{
            System.out.println("Informe seu salario");
            salario = ler.nextDouble();
            if (salario>=0){
                validacao=true;
            }else{
                System.out.println("Informe o salário maior que 0");
            }
        }while (!validacao);
        do{
            System.out.println("Informe seu sexo");
            sexo=ler.next();
            if (sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")){
                validacao=true;
            }else{
                System.out.println("Informe o sexo com as iniciais 'f' ou 'm' ");
            }
        }while (!validacao);

        do{
            System.out.println("Informe seu estado civil");
            estadoCivil = ler.next();
            if (estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("d")
                    || estadoCivil.equalsIgnoreCase("v")){
                validacao=true;
            }else{
                System.out.println("Informe estado civil com as iniciais");
            }
        }while (!validacao);

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado Civil: "+estadoCivil);
    }
}
