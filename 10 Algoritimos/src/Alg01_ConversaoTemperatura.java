import java.util.Scanner;

public class Alg01_ConversaoTemperatura {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão de Celsius para Kelvin
        double kelvin = celsius + 273.15;

        // Conversão de Celsius para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibição dos resultados
        System.out.printf("A temperatura em Kelvin é: %.2f K\n", kelvin);
        System.out.printf("A temperatura em Fahrenheit é: %.2f °F\n", fahrenheit);

        // Fechamento do Scanner
        scanner.close();
    }
}
