import java.util.Locale;
import java.util.Scanner;
public class Main {
    public  static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner geometria = new Scanner(System.in);

        System.out.println("Insira os valores de: A, B & C");
        double a = geometria.nextDouble();
        double b = geometria.nextDouble();
        double c = geometria.nextDouble();

        double areaTR = (a * c)/2;
        double areaC = 3.14159 * (c * c);
        double areaTP = ((a + b) * c)/2;
        double areaQB = b * b;
        double areaR = a * b;

        System.out.printf("Triangulo: %.3f%n", areaTR);
        System.out.printf("Circulo: %.3f%n", areaC);
        System.out.printf("Trapézio: %.3f%n", areaTP);
        System.out.printf("Quadrado: %.3f%n", areaQB);
        System.out.printf("Retangulo: %.3f%n", areaR);
    }
}