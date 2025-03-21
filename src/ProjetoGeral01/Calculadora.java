package ProjetoGeral01;

import java.util.Scanner;

public class Calculadora {
    int num1,num2,soma,subtracao,multiplicacao,divisao,potencia;
    double resto;
    char loop;
    Scanner entrada = new Scanner(System.in);

    public void somarDoisNumeros() {
            System.out.println("Você escolheu 1 - Adição");
            System.out.print("Digite o primeiro número: ");
            num1 = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Você digitou o número " + num1);
            System.out.print("\nDigite o segundo número: ");
            num2 = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Você digitou o número " + num2);
            soma = num1+num2;

        do{
            int numero;
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entrada.next().charAt(0);
            loop = Character.toUpperCase(loop);
            entrada.nextLine();

            if(loop =='N'){
                System.out.println(" O resultado é = " + soma);
                return;
            }

            System.out.print("Qual número deseja somar: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            soma = soma + numero;

            System.out.println("O resultado é = " + soma);
        } while(loop == 'S');
        System.out.println("O resultado é = " + soma);
    }

    public void subtrairDoisNumeros(){
        System.out.println("Você escolheu 2 - Subtração");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite o segundo número, para subtrair de "+ num1 + ": ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num2);
        subtracao = num1-num2;
        do{
            int numero;
            System.out.println("O resultado é = " + subtracao);
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entrada.next().charAt(0);
            loop = Character.toUpperCase(loop);
            entrada.nextLine();

            if(loop =='N'){
                System.out.println("O resultado é = " + subtracao);
                return;
            }
            else if(loop!='N' && loop !='S'){
                System.out.println("Erro");
                break;
            }
            System.out.print("Qual número deseja subtrair de " + subtracao + ": ");
            numero = entrada.nextInt();
            entrada.nextLine();
            subtracao = subtracao - numero;
        } while(loop == 'S');
        System.out.println(" O resultado é =  " + soma);
        }

    public void multiplicarDoisNumeros(){
        System.out.println("Você escolheu 3 - Multiplicação");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite o segundo número, para multiplicar por " + num1 + ": ");
        num2 = entrada.nextInt();
        entrada.nextLine();

        multiplicacao = num1 * num2;

        if(num1==0 || num2==0){
            multiplicacao = 0;
        }
        System.out.println(num1 + " X " + num2 + " = " + multiplicacao);
    }
    public void dividirDoisNumeros(){
        System.out.println("Você escolheu 4 - Divisão");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite o segundo número, para dividir: ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num2);
        if(num1==0 || num2==0){
            System.out.println("Divisão Inválida!!! " + num2);
        } else{
            divisao = num1/num2;
            resto = num1%num2;
            System.out.println(num1 + "/" + num2 + " = " + divisao);
            System.out.println("Resto da divisão = " + resto);
        }
    }
    public void fatorialNumero(){
        long fatorial = 1;
        int i;
        System.out.println("Você escolheu 5 - Fatorial");
        System.out.print("Digite o número para calcular o fatorial dele: ");
        num1 = entrada.nextInt();
         entrada.nextLine();
        if(num1==0){
            System.out.print("Fatorial = 1");
        } else {
            for (i = num1; i > 0; i--) {
                fatorial *= i;
            }
            System.out.println("Fatorial do número " + num1 + " = " + fatorial);
        }
    }
    public void potenciarNumero(){
        System.out.println("Você escolheu 6 - Potenciação");
        System.out.print("Digite o número que quer ver na forma de potência: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite a base que deseja potenciar no número " + num1 + ": ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num2);
        if (num1 == 0) {
           potencia = 1;
        }
        else{
            for (int i = 0; i <= num2; i++) {
                potencia*=potencia;
            }
        }
        System.out.println(num1 + " elevado à " + num2 + " = " + potencia);
    }
}
