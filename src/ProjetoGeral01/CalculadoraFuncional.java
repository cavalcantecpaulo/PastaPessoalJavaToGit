package ProjetoGeral01;

import java.util.Scanner;

public class CalculadoraFuncional extends Calculadora {
    private Scanner entrada = new Scanner(System.in);
    private int num1,num2;
    private int resultado;
    private char loop;

    public CalculadoraFuncional(Scanner entrada) {
        this.entrada = entrada;
    }

    private int somar(int num1, int num2) {
        return num1 + num2;
    }

    private int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    private int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    private double dividir(int num1, int num2) {
        return num1 / num2;
    }
    private int fatorial(int num1) {
        int i;
        int resultado = 1;
        for (i = num1; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
    private int potencia(int num1) {
        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado *= num1;
        }
        return resultado;
    }
    public void somarNumeros() {
        System.out.println("Você escolheu 1 - Adição");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número: " + num1);
        System.out.print("\nDigite o segundo número: ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número: " + num2);
        resultado = somar(num1, num2);
        System.out.println("O resultado é = " + resultado);
        do {
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entrada.next().charAt(0);
            loop = Character.toUpperCase(loop);
            entrada.nextLine();

            if (loop == 'N') {
                continue;
            }
            System.out.print("Qual número deseja somar: ");
            num2 = entrada.nextInt();
            entrada.nextLine();
            resultado = somar(resultado, num2);

            System.out.println("O resultado é: " + resultado);
        } while (loop == 'S');
        System.out.println("O resultado é final é: " + resultado);
    }
    public void subtrairNumeros() {
        System.out.println("Você escolheu 2 - Subtração");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número: " + num1);
        System.out.print("\nDigite o segundo número, para subtrair de: " + num1 + ": ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número: " + num2);
        resultado = subtrair(num1, num2);
        do {
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entrada.next().charAt(0);
            loop = Character.toUpperCase(loop);
            entrada.nextLine();

            if (loop == 'N') {
                continue;
            }
            System.out.print("Qual número deseja subtrair: ");
            num2 = entrada.nextInt();
            entrada.nextLine();
            resultado = subtrair(resultado, num2);

            System.out.println("O resultado é: " + resultado);
        } while (loop == 'S');
        System.out.println("O resultado é final é: " + resultado);
    }
    public void multiplicarNumeros(){
        System.out.println("Você escolheu 3 - Multiplicação");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Você digitou o número: " + num1);
        System.out.print("\nDigite o segundo número, para multiplicar por " + num1 + ": ");
        num2 = entrada.nextInt();
        entrada.nextLine();

        resultado = multiplicar(num1, num2);

        if(num1==0 || num2==0){
            resultado = 0;
        }
        System.out.println(num1 + " X " + num2 + " = " + resultado);
    }
    public void dividirNumeros(){
        double resto;
        System.out.println("Você escolheu 4 - Divisão");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número: " + num1);
        System.out.print("\nDigite o segundo número, para dividir: ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num2);
        if(num1==0 || num2==0){
            System.out.println("Divisão Inválida!!! " + num2);
        } else{
            double resultado = dividir(num1,num2);
            resto = num1%num2;
            System.out.println(num1 + "/" + num2 + " = " + resultado);
            System.out.println("Resto da divisão = " + resto);
        }
    }
        public void fatorialNumero(){
        System.out.println("Você escolheu 5 - Fatorial");
        System.out.print("Digite o número para calcular o fatorial dele: ");
        num1 = entrada.nextInt();
         entrada.nextLine();
        if(num1==0){
            System.out.print("Fatorial = 1");
        } else {
        resultado = fatorial(num1);
            System.out.println("Fatorial do número " + num1 + " = " + resultado);
        }
    }
        public void potenciarNumero(){
        System.out.println("Você escolheu 6 - Potenciação");
        System.out.print("Digite o número que quer ver na forma de potência: ");
        num1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num1);
        System.out.print("\nDigite a base que deseja potenciar o número " + num1 + ": ");
        num2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Você digitou o número " + num2);
        if (num1 == 0) {
           resultado = 1;
        }
        else{
            resultado = potencia(num1);
        }
        System.out.println(num1 + " elevado à " + num2 + " = " + resultado);
        }
    }