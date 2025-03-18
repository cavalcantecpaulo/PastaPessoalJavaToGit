package ProjetoGeral01;

import java.util.Scanner;

public class ProjetoPrincipal01 {
    public static void main(String[] args) {
        System.out.println("\nProjeto Principal Java 01\n");
        Scanner opc = new Scanner(System.in);
        MenuTela menu = new MenuTela();

            menu.iniciarMenu(opc);
    }
}
