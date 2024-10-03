import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner med = new Scanner(System.in);
        double a, b, c, areaQ, areaT, areaTp;

        System.out.println("Digite a medida A: ");
        a = med.nextDouble();

        System.out.println("Digite a medida B: ");
        b = med.nextDouble();

        System.out.println("Digite a medida C:");
        c = med.nextDouble();

        areaQ = a * a;
        areaT = (a * b) / 2;
        areaTp = (a+b) * c / 2;

        System.out.println(areaQ);
        System.out.println(areaT);
        System.out.println(areaTp);

        med.close();
    }
}