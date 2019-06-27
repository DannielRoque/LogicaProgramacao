package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, senha;

        do{
            System.out.println("Informe seu usuário");
            nome = ler.nextLine();
            System.out.println("Informe sua senha");
            senha=ler.nextLine();

        }while (nome.equals(senha));

        System.out.println("Logado com sucesso");
    }
}
