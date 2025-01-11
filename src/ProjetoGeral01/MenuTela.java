package ProjetoGeral01;

import java.util.Scanner;

public class MenuTela {
    public void iniciarMenu(Scanner opcInicial){
        int escolhaInicial;
        ParOuImpar parOuImpar = new ParOuImpar();
        Tabuada tabuada = new Tabuada();
        Calculadora calculadora = new Calculadora();
        MenuCalculadora menuCalculadora = new MenuCalculadora();

        System.out.println("    1.  Calculadora Simples");
        System.out.println("    2.  Tabuada de número x");
        System.out.println("    3.  Verificar se número x é Par/Ímpar");
        System.out.println("    4.  Conversor de Temperatura");
        System.out.println("    5.  Em desenvolvimento...");
        System.out.println("    6.  Em desenvolvimento...");
        System.out.println("    7.  Em desenvolvimento...");
        System.out.println("    8.  Em desenvolvimento...");
        System.out.print("Escolha uma opção: ");
        escolhaInicial = opcInicial.nextInt();

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
//            case 4:
//                System.out.println("case 4");
//                break;
//            case 5:
//                System.out.println("case 5");
//                break;
//            case 6:
//                System.out.println("case 6");
//                break;
//            case 7:
//                System.out.println("case 7");
//                break;
//            case 8:
//                System.out.println("case 8");
//                break;
        }
    }
}
