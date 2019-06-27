package EExercicios_Matriz;

import java.util.Scanner;

public class Exerc_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int esc1 = 1, esc2 = 1;
        int dia, horario;
        String[][] agenda = new String[30][8];
        String comp;
        while (esc1 != 0) {
            System.out.println("Informe Informe o Mês desejado");
            System.out.println("1 - Janeiro  2 - Fevereiro  3 - Março  4 - Abril  5 - Maio  6 - Junho\n7 - Julho  8 - Agosto  9 - Setembro  10 - Outubro" +
                    "  11 - Novembro  12 - Dezembro");
            esc1 = ler.nextInt();
        switch (esc1){
            case 1:
                while (esc2!=0) {
                    System.out.println("Mês Janeiro");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                break;
            case 2:
                while (esc2!=0) {
                    System.out.println("Mês Fevereiro");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }

                    break;
            case 3:
                while (esc2!=0) {
                    System.out.println("Mês Março");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }

                    break;
            case 4:
                while (esc2!=0) {
                    System.out.println("Mês Abril");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                    break;
            case 5:
                while (esc2!=0) {
                    System.out.println("Mês Junho");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                    break;
            case 6:
                while (esc2!=0) {
                    System.out.println("Mês Junho");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                    break;
            case 7:
                while (esc2!=0) {
                    System.out.println("Mês Julho");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                    break;
            case 8:
                while (esc2!=0) {
                    System.out.println("Mês Agosto");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                    break;
            case 9:
                while (esc2!=0) {
                    System.out.println("Mês Setembro");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                        break;
            case 10:
                while (esc2!=0) {
                    System.out.println("Mês Outubro");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                        break;
            case 11:
                while (esc2!=0) {
                    System.out.println("Mês Novembro");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                    break;
            case 12:
                while (esc2!=0) {
                    System.out.println("Mês Dezembro");
                    System.out.println("1 - Anotar Compromisso\n2 - Visualizar");
                    esc2 = ler.nextInt();
                    switch (esc2) {
                        case 1:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println("Adicione o compromisso");
                            comp=ler.next();

                            agenda[dia][horario]=comp;
                            break;
                        case 2:
                            System.out.println("Informe o dia desejado");
                            dia = ler.nextInt();
                            System.out.println("Informe o horário");
                            horario = ler.nextInt();
                            System.out.println(" Compromisso Agendado "+agenda[dia][horario]);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                }
                break;
            default:
                    System.out.println("Opção Inválida");
        }
        }
    }
}
