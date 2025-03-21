package ProjetoGeral01;

import java.util.Scanner;

public class ParOuImpar {
    public void verificarParOuImpar() {
        int numero;

        Scanner entradaDeNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = entradaDeNumero.nextInt();

        System.out.println("Você digitou o número: " + numero);
        if (numero%2==0){
            System.out.println("O número " + numero +" é par");
        } else {
            System.out.println("O número " + numero +" é ímpar");
        }
    }
}
