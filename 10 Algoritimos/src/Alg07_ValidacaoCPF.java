import java.util.Scanner;

public class ValidadorCPF {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um CPF
        System.out.print("Digite o CPF (somente números): ");
        String cpf = scanner.nextLine();

        // Validação do CPF
        boolean valido = true;

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            valido = false; // CPF inválido se não tiver 11 dígitos
        } else {
            // Verifica se todos os caracteres do CPF são dígitos
            for (int i = 0; i < 11; i++) {
                char c = cpf.charAt(i);
                if (c < '0' || c > '9') {
                    valido = false; // CPF inválido se houver caracteres que não são dígitos
                    break;
                }
            }
        }

        // Se o CPF é considerado válido até agora, prossegue com a verificação dos dígitos verificadores
        if (valido) {
            // Cálculo do primeiro dígito verificador
            int primeiroDigito = calcularDigitoVerificador(cpf, 9);
            // Cálculo do segundo dígito verificador
            int segundoDigito = calcularDigitoVerificador(cpf, 10);

            // Verifica se os dígitos calculados correspondem aos do CPF
            if (primeiroDigito != Character.getNumericValue(cpf.charAt(9)) ||
                segundoDigito != Character.getNumericValue(cpf.charAt(10))) {
                valido = false; // CPF inválido se os dígitos não corresponderem
            }
        }

        // Exibe o resultado da validação
        if (valido) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }

        // Fechamento do Scanner
        scanner.close();
    }

    // Método para calcular o dígito verificador
    public static int calcularDigitoVerificador(String cpf, int posicao) {
        int soma = 0;
        for (int i = 0; i < posicao; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (posicao + 1 - i); // Peso decrescente
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto; // Retorna 0 ou 11 menos o resto
    }
}
