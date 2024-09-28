import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as quatro notas
        System.out.print("Digite a Nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a Nota 2: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a Nota 3: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a Nota 4: ");
        double nota4 = scanner.nextDouble();

        // Pesos das notas
        int peso1 = 1;
        int peso2 = 2;
        int peso3 = 3;
        int peso4 = 4;

        // Cálculo da média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) /
                                (peso1 + peso2 + peso3 + peso4);

        // Exibe o resultado
        System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);

        // Fechamento do Scanner
        scanner.close();
    }
}
