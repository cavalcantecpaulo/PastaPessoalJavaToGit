package ProjetoGeral01;

import java.util.Scanner;

public class MenuTela {
    public void exibirMenu(){

        System.out.println("\nProjeto Principal Java 01\n");
        System.out.println("    1.  Calculadora Simples");
        System.out.println("    2.  Tabuada de número x");
        System.out.println("    3.  Verificar se número x é Par/Ímpar");
        System.out.println("    4.  Conversor de Temperatura");
        System.out.println("    5.  O Dilema dos Prisioneiros");
        System.out.println("    6.  Jogo de adivinhação");
        System.out.println("    7.  Captura Básica Teste");
        System.out.println("    8.  Em desenvolvimento...");
        System.out.println("    9.  Encerrar Programa");
        System.out.print("Escolha uma opção: ");
    }
    public void iniciarMenu(){
        int escolhaInicial;
        ParOuImpar parOuImpar = new ParOuImpar();
        Tabuada tabuada = new Tabuada();
        MenuCalculadora menuCalculadora = new MenuCalculadora();
        MenuTemperatura menuTemperatura = new MenuTemperatura();
        DilemaDosPrisioneiros dilema = new DilemaDosPrisioneiros();
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        CapturaBasica captura =  new CapturaBasica();
        Scanner opcInicial = new Scanner(System.in);

        exibirMenu();
        escolhaInicial = opcInicial.nextInt();
        opcInicial.nextLine();

        switch (escolhaInicial) {
            case 1:
                menuCalculadora.mostrarMenuCalculadora();
                break;
            case 2:
                tabuada.mostrarTabuada();
                break;
            case 3:
                parOuImpar.verificarParOuImpar();
                break;
            case 4:
                menuTemperatura.mostrarMenuConversao();
                break;
            case 5:
                dilema.miniJogo();
                break;
            case 6:
                jogo.JogarAdivinhacao();
                break;
            case 7:
                captura.capturarInfos();
                break;
            case 8:
                System.out.println("8 - Em desenvolvimento...");
                break;
            case 9:
                System.out.println("Você digitou 9 - Encerrar Programa");
                System.out.println("Encerrando Programa...");
                System.exit(0);
            default:
                System.out.println("Opção Inválida!");
                System.out.println("Digite Novamente!");
                break;
            }
    }
}
