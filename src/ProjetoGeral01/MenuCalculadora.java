package ProjetoGeral01;

import java.util.Scanner;

public class MenuCalculadora {
    public void mostrarMenuCalculadora(){
        int operacao;
        MenuTela menuTela = new MenuTela();
        Scanner opcCalculadora = new Scanner(System.in);
        CalculadoraFuncional calculadoraLogica = new CalculadoraFuncional(opcCalculadora);

        System.out.println("Você digitou 1 - Calculadora");
        System.out.println("    1.  Adição");
        System.out.println("    2.  Subtração");
        System.out.println("    3.  Multiplicação");
        System.out.println("    4.  Divisão");
        System.out.println("    5.  Fatorial");
        System.out.println("    6.  Potenciação");
        System.out.println("    7.  Retornar ao Menu Inicial");
        System.out.println("Deseja efetuar qual operação: ");

       operacao = opcCalculadora.nextInt();
       opcCalculadora.nextLine();

        switch (operacao) {
            case 1:
                calculadoraLogica.somarNumeros();
                break;
            case 2:
                calculadoraLogica.subtrairNumeros();
                break;
            case 3:
                calculadoraLogica.multiplicarNumeros();
                break;
            case 4:
                calculadoraLogica.dividirNumeros();
                break;
            case 5:
                calculadoraLogica.fatorialNumero();
                break;
            case 6:
                calculadoraLogica.potenciarNumero();
                break;
            case 7:
                System.out.println("Você escolheu 7.  Retornar ao Menu Inicial");
                menuTela.iniciarMenu();
                break;
            default:
                System.out.println("Opção Inválida!!!");
                mostrarMenuCalculadora();
        }
    }
}
