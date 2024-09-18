import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Insira o numero de testes:");
        int n = numero.nextInt();

        for(int i = 0; i < n; i++) {
            double a = numero.nextDouble();
            double b = numero.nextDouble();
            double c = numero.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
        numero.close();
    }
}