package ProjetoGeral01;

import java.util.Scanner;

public class CapturaBasica {
    String nome, curso, faculdade;
    int idade;

    public void capturarInfos() {
        System.out.println("Você digitou 7 - Captura básica Teste");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        String deMaior;
        deMaior = (idade >= 18) ? "maior" : (idade < 18) ? "menor" : "Idade Inválida";
        do {
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            entrada.nextLine();
            if (idade < 1 || idade > 130) {
                System.out.println("Idade Inválida!!!");
            }
        } while (idade < 1 || idade > 130);
        if (idade > 18 && idade < 130) {
            System.out.println("Você é " + deMaior + " de idade!!!");
        } else if (idade < 18) {
            System.out.println("Você é " + deMaior + " de idade!!!");
        }

        System.out.println("Digite seu curso: ");
        curso = entrada.nextLine();

        System.out.println("Digite sua faculdade: ");
        faculdade = entrada.nextLine();

        System.out.println("\n\n\n");
        System.out.println(nome + ", " + idade + " anos, cursando " + curso + " no " + faculdade);

        entrada.close();
    }
}
