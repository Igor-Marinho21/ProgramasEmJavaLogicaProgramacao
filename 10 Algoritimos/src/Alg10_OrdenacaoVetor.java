import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// Criação do vetor para você entrar com daddos entrada de dados
        int[] vetor = new int[7];
        System.out.println("Digite 7 valores para o vetor:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

// Solução padrão da atividade com valores 7,4,3,0,5,9,8
// Comentar a solução acima e descomentar abaixo
/* 
int vetor = new int[7];
int[0] = 7;
int[1] = 4;
int[2] = 3;
int[3] = 0;
int[4] = 5;
int[5] = 9;
int[6] = 8;        
*/
        // Menu de opções
        int opcao;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Ordenar em ordem crescente");
            System.out.println("2. Ordenar em ordem decrescente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Vetor em ordem crescente:");
                    ordenarCrescente(vetor);
                    break;
                case 2:
                    System.out.println("Vetor em ordem decrescente:");
                    ordenarDecrescente(vetor);
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        // Fechamento do Scanner
        scanner.close();
    }

    // Método para ordenar o vetor em ordem crescente
    public static void ordenarCrescente(int[] vetor) {
        int[] copia = vetor.clone(); // Cria uma cópia do vetor para ordenar
        java.util.Arrays.sort(copia); // Usa o método sort da classe Arrays para ordenar
        for (int num : copia) {
            System.out.print(num + " "); // Imprime o vetor ordenado
        }
        System.out.println();
    }

    // Método para ordenar o vetor em ordem decrescente
    public static void ordenarDecrescente(int[] vetor) {
        int[] copia = vetor.clone(); // Cria uma cópia do vetor para ordenar
        java.util.Arrays.sort(copia); // Ordena a cópia em ordem crescente
        for (int i = copia.length - 1; i >= 0; i--) {
            System.out.print(copia[i] + " "); // Imprime o vetor ordenado em ordem decrescente
        }
        System.out.println();
    }
}
