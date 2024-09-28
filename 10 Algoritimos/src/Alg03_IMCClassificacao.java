import java.util.Scanner;

public class CalculoIMCClassificacao {
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

        // Exibe o valor do IMC com duas casas decimais
        System.out.printf("Seu IMC é: %.2f kg/m²\n", imc);

        // Classificação do IMC
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25.0 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30.0 && imc < 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (imc >= 35.0 && imc < 39.9) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }

        // Exibe a classificação correspondente ao valor do IMC
        System.out.println("Classificação: " + classificacao);

        // Fechamento do Scanner
        scanner.close();
    }
}
