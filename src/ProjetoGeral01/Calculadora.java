package ProjetoGeral01;

import java.util.Scanner;

public class Calculadora {
    public void somarDoisNumeros(){
        int num1;
        int num2;
        int soma;

        Scanner entradaDeNumero = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num1);
        System.out.print("Digite o segundo número: ");
        num2 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num2);
        soma = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
    }
}
