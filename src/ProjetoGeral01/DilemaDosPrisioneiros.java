package ProjetoGeral01;

import java.util.Scanner;

public class DilemaDosPrisioneiros {
    Scanner entradaDeDecisao = new Scanner(System.in);
    char prisioneiroA, prisioneiroB;
    String nomeA = "Camacho";
    String nomeB = "Vladimir";
    String escolhaA;
    String escolhaB;

    public void miniJogo() {
        System.out.println("\n\nVocê digitou 5 - Dilema dos Prisioneiros");
        System.out.println("\nDois Suspeitos, " + nomeA + " e " + nomeB + " foram presos pela polícia.");
        System.out.println("Não há provas o suficiente para condená-los, então você decidirá o futuro dos dois.");
        System.out.println("Como eles estão em celas separadas,decida se eles responderão pra se beneficiar individualmente!!!");

        System.out.println("\nPrisioneiro " + nomeA + " irá Confessar(C) ou Ficar em Silêncio(S)?");
        prisioneiroA = entradaDeDecisao.next().charAt(0);
        entradaDeDecisao.nextLine();
        System.out.println(nomeA + " escolheu: " + prisioneiroA);

        System.out.println("\nPrisioneiro " + nomeB + " irá Confessar(C) ou Ficar em Silêncio(S)?");
        prisioneiroB = entradaDeDecisao.next().charAt(0);
        entradaDeDecisao.nextLine();
        System.out.println(nomeB + " escolheu: " + prisioneiroB);

        prisioneiroA = Character.toUpperCase(prisioneiroA);
        prisioneiroB = Character.toUpperCase(prisioneiroB);

        escolhaA = (prisioneiroA == 'C') ? "Confessar" :(prisioneiroA == 'S') ? "Ficar em Silêncio" : "Erro";
        escolhaB = (prisioneiroB == 'C') ? "Confessar" :(prisioneiroB == 'S') ? "Ficar em Silêncio" : "Erro";

        System.out.println(nomeA + " escolheu: " + escolhaA);
        System.out.println(nomeB + " escolheu: " + escolhaB);

        if ((prisioneiroA == 'C' || prisioneiroA == 'c') && (prisioneiroB == 'C' || prisioneiroB == 'c')) {
            System.out.println("Os dois bandidos traíram seus companheiros e ficarão presos por 5 anos cada um!!!");
        } else if ((prisioneiroA == 'C') && (prisioneiroB == 'S')) {
            System.out.println(nomeA + " está livre e " + nomeB + " será prisioneiro por 10 anos!!!");
        } else if ((prisioneiroA == 'S') && (prisioneiroB == 'C')) {
            System.out.println(nomeB + " está livre e " + nomeA + " será prisioneiro por 10 anos!!!");
        } else if ((prisioneiroA == 'S') && (prisioneiroB == 'S')) {
            System.out.println("Os dois bandidos poderão ser condenados a no máximo 1 ano de cadeia.");
        } else {
            System.out.println("Digitou incorretamente!!!");
            miniJogo();
        }
    }
}
