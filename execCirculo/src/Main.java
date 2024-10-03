import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double area, raio;
        Scanner circulo = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        raio = circulo.nextDouble();

        area =  3.14159 * (raio * raio);

        System.out.println(area);

        circulo.close();
    }
}