package ProjetoGeral01;

import java.util.Scanner;

public class Tabuada {
    public void mostrarTabuada() {
        int numero;
        int i=1;
        int resultado;
        Scanner entradaDeNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = entradaDeNumero.nextInt();

        System.out.println("Você digitou o número: " + numero);
        while(i<=10){
            resultado=numero*i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
}
