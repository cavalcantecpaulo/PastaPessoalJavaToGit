package ProjetoGeral01;

import java.util.Scanner;

public class CalculadoraFuncional extends Calculadora {
    private Scanner entrada = new Scanner(System.in);
    private Double num1 = 0.0;
    private Double num2 = 0.0;
    private Double resultado;
    private char loop;

    public CalculadoraFuncional(Scanner entrada) {
        this.entrada = entrada;
    }

    private Double somar(Double num1, Double num2) {
        return num1 + num2;
    }

    private Double subtrair(Double num1, Double num2) {
        return num1 - num2;
    }

    private Double multiplicar(Double num1, Double num2) {
        return num1 * num2;
    }

    private Double dividir(Double num1, Double num2) {
        return num1 / num2;
    }

    private Double fatorial(Double num1) {
        Double i;
        Double resultado = 1.0;
        for (i = num1; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
    private Double potencia(Double num1) {
        Double resultado = 1.0;
        for (int i = 0; i < num2; i++) {
            resultado *= num1;
        }
        return resultado;
    }
    public void somarNumeros() {
        System.out.println("Você escolheu 1 - Adição");
        System.out.println("------------------------");
        entradaDados();
        resultado = somar(num1, num2);
        imprimirResultado();
        do {
            System.out.println("Deseja digitar outro numero? (S/N)");
            loop = entrada.next().charAt(0);
            loop = Character.toUpperCase(loop);
            entrada.nextLine();

            if (loop == 'N') {
                continue;
            }
            System.out.print("Qual número deseja somar: ");
            num2 = entrada.nextDouble();
            resultado = somar(resultado, num2);

            imprimirResultado();
        } while (loop == 'S');
        imprimirResultado();
    }

    public void subtrairNumeros() {
        System.out.println("Você escolheu 2 - Subtração");
        System.out.println("------------------------");
        entradaDados();
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
            num2 = entrada.nextDouble();
            resultado = subtrair(resultado, num2);

            imprimirResultado();
        } while (loop == 'S');
        imprimirResultado();
    }
    public void multiplicarNumeros(){
        System.out.println("Você escolheu 3 - Multiplicação");
        System.out.println("------------------------");
        entradaDados();
        System.out.println(num1 + " X " + num2 + " = ");
        resultado = multiplicar(num1, num2);

        if(num1==0 || num2==0){
            resultado = 0.0;
        }
        imprimirResultado();
    }
    public void dividirNumeros(){
        Double resto;
        System.out.println("Você escolheu 4 - Divisão");
        System.out.println("------------------------");
        entradaDados();
        if(num1==0 || num2==0){
            System.out.println("Divisão Inválida!!! " + num2);
        } else{
            resultado = dividir(num1,num2);
            resto = num1%num2;
            imprimirResultado();
            System.out.println("Resto da divisão = " + resto);
        }
    }
        public void fatorialNumero(){
        System.out.println("Você escolheu 5 - Fatorial");
        System.out.println("------------------------");
        System.out.print("Digite o número para calcular o fatorial dele: ");
        num1 = entrada.nextDouble();
        if(num1==0){
            resultado = 1.0;
            imprimirResultado();
        } else {
        resultado = fatorial(num1);
            System.out.println("Fatorial do número: " + num1);
            imprimirResultado();
        }
    }
        public void potenciarNumero(){
            System.out.println("Você escolheu 6 - Potenciação");
            System.out.println("------------------------");
            entradaDados();
        if (num1 == 0) {
           resultado = 1.0;
        }
        else{
            resultado = potencia(num1);
        }
        System.out.println(num1 + " elevado à " + num2 + " = ");
        imprimirResultado();
        }
        public void entradaDados(){
            System.out.print("Digite o primeiro número: ");
            num1 = entrada.nextDouble();
            System.out.println("------------------------");
            System.out.print("\nDigite o segundo número: ");
            num2 = entrada.nextDouble();
        }
        public void imprimirResultado(){
            System.out.println("O resultado é: " + resultado);
            System.out.println("---------------------------");
        }
    }