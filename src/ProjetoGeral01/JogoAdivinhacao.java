package ProjetoGeral01;

import java.util.Scanner;

public class JogoAdivinhacao {

    public void JogarAdivinhacao(){
        int numeroSecreto= 10;

        int numero;

        System.out.println("Você iniciou o jogo de adivinhação!!!");
        do{
            Scanner numeroTentativa = new Scanner(System.in);
            System.out.println("Digite um número de 1 a 100: ");
            numero = numeroTentativa.nextInt();

            System.out.println("O número digitado foi: " + numero);
            if (numero <1 || numero > 100){
                System.out.println("Número inválido!!!");
            }
            else{
                if(numero > numeroSecreto){
                    System.out.println("O número secreto é menor que " + numero + "!!!");
                }
                else if(numero<numeroSecreto){
                    System.out.println("O número secreto é maior que " + numero + "!!!");
                }
                else{
                    System.out.println("Parabéns, você acertou o número secreto!!!");
                }
            }
        } while(numero != numeroSecreto);
    }
}
