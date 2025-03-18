package ProjetoGeral01;

import java.util.Scanner;

public class Calculadora {
    int num1;
    int num2;
    int soma;
    int subtracao;
    int multiplicacao;
    int divisao;
    int potencia;
    double resto;
    char loop;
    Scanner entradaDeNumero = new Scanner(System.in);
    Scanner entradaDeChar = new Scanner(System.in);

    public void somarDoisNumeros() {
            System.out.println("Você escolheu 1 - Adição");
            System.out.print("Digite o primeiro número: ");
            num1 = entradaDeNumero.nextInt();
            System.out.println("Você digitou o número " + num1);
            System.out.print("\nDigite o segundo número: ");
            num2 = entradaDeNumero.nextInt();
            System.out.println("Você digitou o número " + num2);
            soma = num1+num2;

        do{
            int numero;
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entradaDeChar.next().charAt(0);
            if(loop == 'n' || loop =='N' ){
                System.out.println(" O resultado é = " + soma);
                return;
            }
            System.out.print("Qual número deseja somar: ");
            numero = entradaDeNumero.nextInt();
            soma = soma + numero;
        } while(loop == 'S' || loop == 's');
        System.out.println(" O resultado é =  " + soma);
    }

    public void subtrairDoisNumeros(){
        System.out.println("Você escolheu 2 - Subtração");
        System.out.print("Digite o primeiro número: ");
        num1 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite o segundo número, para subtrair: ");
        num2 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num2);
        subtracao = num1-num2;
        do{
            int numero;
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entradaDeChar.next().charAt(0);
            if(loop == 'n' || loop =='N' ){
                System.out.println(" O resultado é = " + subtracao);
                return;
            }
            System.out.print("Qual número deseja subtrair de " + subtracao + ": ");
            numero = entradaDeNumero.nextInt();
            subtracao = subtracao - numero;
        } while(loop == 'S' || loop == 's');
        System.out.println(" O resultado é =  " + soma);
        }

    public void multiplicarDoisNumeros(){
        System.out.println("Você escolheu 3 - Multiplicação");
        System.out.print("Digite o primeiro número: ");
        num1 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite o segundo número, para multiplicar: ");
        num2 = entradaDeNumero.nextInt();
        System.out.print("Digite o número para calcular o fatorial: ");
        if(num1==0 || num2==0){
            System.out.print("Resultado = 0");
        }else {
            multiplicacao = num1 * num2;
            System.out.println(num1 + " X " + num2 + " = " + multiplicacao);
        }
    }
    public void dividirDoisNumeros(){
        System.out.println("Você escolheu 4 - Divisão");
        System.out.print("Digite o primeiro número: ");
        num1 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite o segundo número, para dividir: ");
        num2 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num2);
        if(num1==0 || num2==0){
            System.out.println("Divisão Inválida!!! " + num2);
        } else{
            divisao = num1/num2;
            resto = num1%num2;
            System.out.println(num1 + "/" + num2 + " = " + divisao);
            System.out.println("Resto da divisão= " + resto);
        }
    }
    public void fatorialNumero(){
        long fatorial = 1;
        int i;
        System.out.println("Você escolheu 5 - Fatorial");
        System.out.print("Digite o número para calcular o fatorial dele: ");
        num1 = entradaDeNumero.nextInt();

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
        num1 = entradaDeNumero.nextInt();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite a base que deseja potenciar no número " + num1 + ": ");
        num2 = entradaDeNumero.nextInt();
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
