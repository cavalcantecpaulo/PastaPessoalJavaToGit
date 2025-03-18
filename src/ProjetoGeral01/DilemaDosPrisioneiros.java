package ProjetoGeral01;

import java.util.Scanner;

public class DilemaDosPrisioneiros {
    Scanner entradaDeDecisao = new Scanner(System.in);
    char prisioneiroA;
    char prisioneiroB;

    public void miniJogo() {
        System.out.println("\n\nDilema dos Prisioneiros");
        System.out.println("\nDois Suspeitos A(Camacho) e B(Patrick) foram presos pela polícia.");
        System.out.println("\nNão há provas o suficiente para condená-los, então você decidirá o futuro dos dois.");
        System.out.println("Como estão em celas separadas,decida se eles responderão pra se beneficiar individualmente!!!");

        System.out.println("\nPrisioneiro Camacho irá Confessar(C) ou Ficar em Silêncio(S)?");
        prisioneiroA = entradaDeDecisao.next().charAt(0);
        System.out.println("Camacho escolheu: " + prisioneiroA);

        System.out.println("\nPrisioneiro Patrick irá Confessar(C) ou Ficar em Silêncio(S)?");
        prisioneiroB = entradaDeDecisao.next().charAt(0);
        System.out.println("Patrick escolheu: " + prisioneiroB);

        if((prisioneiroA == 'C' || prisioneiroA == 'c') && (prisioneiroB == 'C' || prisioneiroB == 'c')){
            System.out.println("Os dois bandidos traíram seus companheiros e ficarão presos por 5 anos cada um!!!");
        }
        else if((prisioneiroA == 'C' || prisioneiroA == 'c') && (prisioneiroB == 'S' || prisioneiroB == 's')){
            System.out.println("Camacho está livre e o prisioneiro B(Patrick) ficará preso por 10 anos!!!");
        }
        else if((prisioneiroA == 'S' || prisioneiroA == 's') && (prisioneiroB == 'C' || prisioneiroB == 'c')){
            System.out.println("Patrick está livre e o prisioneiro A(Camacho) ficará preso por 10 anos!!!");
        }
        else if((prisioneiroA == 'S' || prisioneiroA == 's') && (prisioneiroB == 'S' || prisioneiroB == 's')){
            System.out.println("Os dois prisioneiros poderão ser condenados a no máximo 1 ano de cadeia.");
        }
        else{
            System.out.println("Digitou incorretamente!!!");
            miniJogo();
        }
    }
}
