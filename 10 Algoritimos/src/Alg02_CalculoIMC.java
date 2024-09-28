import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o peso em quilogramas
        System.out.print("Digite o seu peso (kg): ");
        double peso = scanner.nextDouble();

        // Solicita ao usuário que insira a altura em metros
        System.out.print("Digite a sua altura (m): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado do IMC com duas casas decimais
        System.out.printf("Seu IMC é: %.2f kg/m²\n", imc);

        // Fechamento do Scanner
        scanner.close();
    }
}
