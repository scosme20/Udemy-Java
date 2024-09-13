import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");

        double raio;
        raio = r.nextDouble();

        double area;

        area = (raio * raio) * 3.14159;

        System.out.printf("O valor da àrea do seu círculo é: %.4f%n", area);
    }
}