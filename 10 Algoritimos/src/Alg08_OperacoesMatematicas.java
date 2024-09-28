import java.util.Scanner;

public class QuatroOperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de operação
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação (1/2/3/4): ");
        int operacao = scanner.nextInt();

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Executa a operação selecionada
        double resultado;
        switch (operacao) {
            case 1:
                resultado = somar(num1, num2);
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        // Fechamento do Scanner
        scanner.close();
    }

    // Função para somar dois números
    public static double somar(double a, double b) {
        return a + b;
    }

    // Função para subtrair dois números
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Função para multiplicar dois números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Função para dividir dois números
    public static double dividir(double a, double b) {
        return a / b;
    }
}
