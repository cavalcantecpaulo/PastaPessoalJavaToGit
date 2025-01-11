package ProjetoGeral01;

import java.util.Scanner;

public class MenuCalculadora {
    public void mostrarMenuCalculadora(){
        Calculadora calculadora = new Calculadora();

        System.out.println("    1.  Adição");
        System.out.println("    2.  Subtração");
        System.out.println("    3.  Multiplicação");
        System.out.println("    4.  Divisão");
        System.out.println("    5.  Fatorial");
        System.out.println("    6.  Potenciação");
        System.out.print("Deseja efetuar qual operação: ");
        Scanner opcCalculadora = new Scanner(System.in);

        int operacao = opcCalculadora.nextInt();
        switch (operacao) {
                case 1:
                    System.out.println("case1");
                    calculadora.somarDoisNumeros();
                case2:
                    System.out.println("case2");
                    System.out.println("Em desenvolvimento...");
                case3:
                    System.out.println("case3");
                    System.out.println("Em desenvolvimento...");
                case4:
                    System.out.println("case4");
                    System.out.println("Em desenvolvimento...");
                case5:
                    System.out.println("case5");
                    System.out.println("Em desenvolvimento...");
                case6:
                    System.out.println("case6");
                    System.out.println("Em desenvolvimento...");
        }
    }

}
