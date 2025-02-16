package ProjetoGeral01;

import java.util.Scanner;

public class Temperatura {
    double celsius;
    double fahrenheit;
    double kelvin;
    Scanner entradaDeTemperatura = new Scanner(System.in);

    public void converterCelsiusToFahrenheit() {
        System.out.println("Digite em Celsius, a temperatura que quer converter à Fahrenheit: ");
        celsius = entradaDeTemperatura.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius  + "°C = " + fahrenheit + "°F");
    }
    public void converterCelsiusToKelvin() {
        System.out.println("Digite em Celsius, a temperatura que quer converter à Kelvin: ");
        celsius = entradaDeTemperatura.nextDouble();
        kelvin = celsius + 273.15;
        System.out.println(celsius  + "°C = " + kelvin + "°K");
    }
    public void converterFahrenheitToCelsius() {
        System.out.println("Digite em Fahrenheit, a temperatura que quer converter à Celsius: ");
        fahrenheit = entradaDeTemperatura.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.printf(fahrenheit  + "°F = " + "%.2f°C", celsius);
    }
    public void converterFahrenheitToKelvin() {
        System.out.println("Digite em Fahrenheit, a temperatura que quer converter à Kelvin: ");
        fahrenheit = entradaDeTemperatura.nextDouble();
        kelvin = fahrenheit + 273.15;
        System.out.println(fahrenheit  + "°C = " + kelvin + "°K");
    }
    public void converterKelvinToCelsius() {
        System.out.println("Digite em Kelvin, a temperatura que quer converter à Celsius: ");
        kelvin = entradaDeTemperatura.nextDouble();
        celsius = kelvin - 273.15;
        System.out.println(kelvin  + "°K = " + celsius + "°C");
    }
    public void converterKelvinToFahrenheit() {
        System.out.println("Digite em Kelvin, a temperatura que quer converter à Fahrenheit: ");
        kelvin = entradaDeTemperatura.nextDouble();
        fahrenheit = (kelvin * 9/5) - 459.67;
        System.out.printf(kelvin + "°K = %.2f°F", fahrenheit);
    }
}
