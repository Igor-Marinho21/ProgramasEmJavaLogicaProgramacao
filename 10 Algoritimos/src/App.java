import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a=0, b=0, c=0;

        System.out.println("Digite valor de A");

        a = new Scanner(System.in).nextInt();

        System.out.println("Digite valor de B");
        b = new Scanner(System.in).nextInt();


        c = a + b;
        System.out.println("Valor da soma de A+B: " + c);
    }
}
