import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário uma temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        
        // Converte a temperatura de Celsius para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        
        // Converte a temperatura de Celsius para Kelvin
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        
        // Imprime as temperaturas convertidas
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + temperaturaKelvin + " K");
    }
}
