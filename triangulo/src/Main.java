import java.util.Scanner;
import java.util.Locale;
import entities.triangle;
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tr = new Scanner(System.in);

        triangle x, y;

        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = tr.nextDouble();
        x.b = tr.nextDouble();
        x.c = tr.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = tr.nextDouble();
        y.b = tr.nextDouble();
        y.c = tr.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

         p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);

        tr.close();
    }

}