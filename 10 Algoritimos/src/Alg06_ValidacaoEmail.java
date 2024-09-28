import java.util.Scanner;

public class ValidadorEmail {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um e-mail
        System.out.print("Digite o e-mail para validação: ");
        String email = scanner.nextLine();

        // Validação do e-mail
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        // Condições para um e-mail ser considerado válido
        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
            System.out.println("E-mail válido.");
        } else {
            System.out.println("E-mail inválido.");
        }

        // Fechamento do Scanner
        scanner.close();
    }
}
