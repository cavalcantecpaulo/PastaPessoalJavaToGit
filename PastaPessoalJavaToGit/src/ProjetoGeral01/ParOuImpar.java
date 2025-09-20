package ProjetoGeral01;

import java.util.Scanner;

public class ParOuImpar extends Calculadora{
    public void verificarParOuImpar() {
        int num1;
        Scanner entradaDeNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num1 = entradaDeNumero.nextInt();
        entradaDeNumero.nextLine();
        entradaDeNumero.close();
        System.out.println("Você digitou o número: " + num1);
        if (num1%2==0){
            System.out.println("O número " + num1 +" é par");
        } else {
            System.out.println("O número " + num1 +" é ímpar");
        }
    }
}
