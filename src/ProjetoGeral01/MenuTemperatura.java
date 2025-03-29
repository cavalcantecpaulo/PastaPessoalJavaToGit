package ProjetoGeral01;

import java.util.Scanner;

public class MenuTemperatura {
    public void mostrarMenuConversao() {
        int opcMenuTemperatura;
        Scanner opcConversao = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();
        MenuTela menu = new MenuTela();
        System.out.println("Você selecionou 4 - Conversor de temperatura");
        System.out.println("    1.  Converter Celsius para Fahrenheit");
        System.out.println("    2.  Converter Celsius para Kelvin");
        System.out.println("    3.  Converter Fahrenheit para Celsius");
        System.out.println("    4.  Converter Fahrenheit para Kelvin");
        System.out.println("    5.  Converter Kelvin para Celsius");
        System.out.println("    6.  Converter Kelvin para Fahrenheit");
        System.out.println("    7.  Retornar ao Menu Inicial");
        System.out.print("Deseja efetuar qual operação: ");

        opcMenuTemperatura = opcConversao.nextInt();
        opcConversao.nextLine();

        switch(opcMenuTemperatura){
            case 1:
                temperatura.converterCelsiusToFahrenheit();
                break;
            case 2:
                temperatura.converterCelsiusToKelvin();
                break;
            case 3:
                temperatura.converterFahrenheitToCelsius();
                break;
            case 4:
                temperatura.converterFahrenheitToKelvin();
                break;
            case 5:
                temperatura.converterKelvinToCelsius();
                break;
            case 6:
                temperatura.converterKelvinToFahrenheit();
                break;
            case 7:
                menu.iniciarMenu();
                break;
        }
    }
}
