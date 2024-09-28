import java.util.Scanner;

public class Ordenacao3Numeros {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira três números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Variáveis temporárias para ajudar na troca de valores
        int temp;

        // Ordenação usando trocas sequenciais
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Exibe os números ordenados em ordem crescente
        System.out.printf("Números em ordem crescente: %d, %d, %d\n", num1, num2, num3);

        // Fechamento do Scanner
        scanner.close();
    }
}
