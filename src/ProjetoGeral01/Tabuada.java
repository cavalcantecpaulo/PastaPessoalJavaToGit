package ProjetoGeral01;

import java.util.Scanner;

public class Tabuada extends Calculadora {
    private int num1, resultado;
    private int i=1;

    public void mostrarTabuada() {
        Scanner entradaDeNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num1 = entradaDeNumero.nextInt();
        entradaDeNumero.nextLine();
        entradaDeNumero.close();
        System.out.println("Você digitou o número: " + num1);
        while(i<=10){
            resultado=num1*i;
            System.out.println(num1 + " x " + i + " = " + resultado);
            i++;
        }
    }
}
