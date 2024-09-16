import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner cartesiano = new Scanner(System.in);

        System.out.println("Insira a coordenada X:");
        double x = cartesiano.nextDouble();

        System.out.println("Insira a coordenada Y:");
        double y = cartesiano.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão no quadrante Q1.");
        } else if (x < 0 && y > 0) {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão no quadrante Q2.");
        } else if (x < 0 && y < 0) {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão no quadrante Q3.");
        } else if (x > 0 && y < 0) {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão no quadrante Q4.");
        } else if (x == 0 && y != 0) {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão no eixo Y.");
        } else if (x != 0 && y == 0) {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão no eixo X.");
        } else {
            System.out.println("As coordenadas: X = " + x + " e Y = " + y + " estão na origem.");
        }

        cartesiano.close();
    }
}
