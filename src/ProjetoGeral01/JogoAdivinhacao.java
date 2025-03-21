package ProjetoGeral01;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public void JogarAdivinhacao() {
        int numero;
        int valorMinimo = 1;
        int valorMaximo = 100;
        int numerosDigitados [] = new int[100];
        int contador = 0;

        Random geradorNumero = new Random();
        int numeroSecreto = geradorNumero.nextInt(100) + 1;

        System.out.println("Você iniciou o jogo de adivinhação!!!");
        do {
            Scanner numeroTentativa = new Scanner(System.in);
            System.out.print("\nDigite um número de " + valorMinimo + " a " + valorMaximo + ":");
            numero = numeroTentativa.nextInt();
            numeroTentativa.nextLine();

            System.out.println("O número digitado foi: " + numero);
            if (numero < valorMinimo || numero > valorMaximo) {
                System.out.println("Número inválido!!!");
                continue;
            } else if(numero == numerosDigitados[numero]) {
                System.out.println("Número inválido!!!");
                continue;
            } else {
                if (numero > numeroSecreto) {
                    System.out.println("O número secreto é menor que " + numero + "!!!");
                    valorMaximo = numero - 1;
                } else if (numero < numeroSecreto) {
                    System.out.println("O número secreto é maior que " + numero + "!!!");
                    valorMinimo = numero + 1;
                } else {
                    System.out.println("Parabéns, você acertou o número secreto ("+ numeroSecreto + ") em [" + contador + "] tentativas!!!");
                    return;
                }
            }
            numerosDigitados[contador] = numero;
            contador++;

            System.out.println("Você tentou esse números válidos: ");
            for (int i=0; i < contador; i++) {
                    System.out.print("[" + numerosDigitados[i] + "] ");
            }

        } while (numero != numeroSecreto);
    }
}
