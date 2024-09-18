import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner valor = new Scanner(System.in);

        System.out.println("Insira a coordenada X:");
        double x = valor.nextDouble();

        System.out.println("Insira a coordenada Y:");
        double y = valor.nextDouble();

        while(x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quadrante 4");
            }
            System.out.println("Insira a coordenada X:");
            x = valor.nextDouble();

            System.out.println("Insira a coordenada Y:");
            y = valor.nextDouble();

        }
        System.out.println("Quadrante Nulo");
        valor.close();
    }
}
