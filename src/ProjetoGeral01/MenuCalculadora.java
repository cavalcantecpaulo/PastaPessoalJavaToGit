package ProjetoGeral01;

import java.util.Scanner;

public class MenuCalculadora {
    public void mostrarMenuCalculadora(Scanner opcCalculadora){
        int operacao;
        Calculadora calculadora = new Calculadora();
        MenuTela menuTela = new MenuTela();

        System.out.println("    1.  Adição");
        System.out.println("    2.  Subtração");
        System.out.println("    3.  Multiplicação");
        System.out.println("    4.  Divisão");
        System.out.println("    5.  Fatorial");
        System.out.println("    6.  Potenciação");
        System.out.println("    7.  Retornar ao Menu Inicial");
        System.out.println("Deseja efetuar qual operação: ");

       operacao = opcCalculadora.nextInt();

        switch (operacao) {
            case 1:
                calculadora.somarDoisNumeros();
                break;
            case 2:
                calculadora.subtrairDoisNumeros();
                break;
            case 3:
                calculadora.multiplicarDoisNumeros();
                break;
            case 4:
                calculadora.dividirDoisNumeros();
                break;
            case 5:
                calculadora.fatorialNumero();
                break;
            case 6:
                calculadora.potenciarNumero();
                break;
            case 7:
                System.out.println("Você escolheu 7.  Retornar ao Menu Inicial");
                menuTela.iniciarMenu(opcCalculadora);
                break;
            default:
                System.out.println("Opção Inválida!!!");
                mostrarMenuCalculadora(opcCalculadora);
        }
    }

}
