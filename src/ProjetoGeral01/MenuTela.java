package ProjetoGeral01;

import java.util.Scanner;

public class MenuTela {
    public void iniciarMenu(Scanner opcInicial){
        int escolhaInicial;
        ParOuImpar parOuImpar = new ParOuImpar();
        Tabuada tabuada = new Tabuada();
        MenuCalculadora menuCalculadora = new MenuCalculadora();
        menuTemperatura menuTemperatura = new menuTemperatura();
        DilemaDosPrisioneiros dilema = new DilemaDosPrisioneiros();
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        do {
            System.out.println("\n    1.  Calculadora Simples");
            System.out.println("    2.  Tabuada de número x");
            System.out.println("    3.  Verificar se número x é Par/Ímpar");
            System.out.println("    4.  Conversor de Temperatura");
            System.out.println("    5.  O Dilema dos Prisioneiros");
            System.out.println("    6.  Jogo de adivinhação");
            System.out.println("    7.  Em desenvolvimento...");
            System.out.println("    8.  Encerrar Programa");
            System.out.print("Escolha uma opção: ");
            escolhaInicial = opcInicial.nextInt();

            switch (escolhaInicial) {
                case 1:
                    menuCalculadora.mostrarMenuCalculadora(opcInicial);
                    break;
                case 2:
                    tabuada.mostrarTabuada();
                    break;
                case 3:
                    parOuImpar.verificarParOuImpar();
                    break;
                case 4:
                    menuTemperatura.mostrarMenuConversao(opcInicial);
                    break;
                case 5:
                    dilema.miniJogo();
                    break;
                case 6:
                    jogo.JogarAdivinhacao();
                    break;
                case 7:
                    System.out.println("Você digitou 7 - Em desenvolvimento...");
                    System.out.println("Em desenvolvimento...");
                    break;
                case 8:
                    System.out.println("Você digitou 8 - Encerrar Programa");
                    System.out.println("Encerrar Programa");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while(escolhaInicial!=9);
        opcInicial.close();
    }
}
