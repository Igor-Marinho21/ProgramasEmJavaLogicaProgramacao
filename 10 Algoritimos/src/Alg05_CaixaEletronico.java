import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de saque
        System.out.print("Digite o valor do saque: ");
        int valorSaque = scanner.nextInt();

        // Verifica se o valor do saque é válido (múltiplo de 2, pois temos cédulas de 2)
        if (valorSaque % 2 != 0) {
            System.out.println("Valor inválido. O saque deve ser múltiplo de 2.");
        } else {
            // Definição dos valores das cédulas disponíveis
            int[] cedulas = {200, 100, 50, 20, 10, 5, 2};

            // Array para armazenar a quantidade de cada cédula
            int[] quantidadeCedulas = new int[cedulas.length];

            // Calcula a quantidade de cada cédula
            int valorRestante = valorSaque;

            for (int i = 0; i < cedulas.length; i++) {
                quantidadeCedulas[i] = valorRestante / cedulas[i];
                valorRestante %= cedulas[i];
            }

            // Exibe a quantidade de cédulas de cada valor
            System.out.println("Quantidade de cédulas:");
            for (int i = 0; i < cedulas.length; i++) {
                if (quantidadeCedulas[i] > 0) {
                    System.out.printf("Cédulas de %d: %d\n", cedulas[i], quantidadeCedulas[i]);
                }
            }
        }

        // Fechamento do Scanner
        scanner.close();
    }
}
