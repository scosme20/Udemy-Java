import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner bhs = new Scanner(System.in);
        int  a, b, c ;
        double delta, x1, x2;

        System.out.println("Insira o coeficiente A : ");
        a = bhs.nextInt();

        System.out.println("Insira o coeficiente B : ");
        b = bhs.nextInt();

        System.out.println("Insira o coeficiente");
        c =  bhs.nextInt();

        delta = (b * b) + (-4 * (a * c));

        if(delta >= 0 ){
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) + Math.sqrt(delta)) / 2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }else {
            System.out.println("Delta não possui raiz.");
            System.exit(0);
        }
        bhs.close();
    }
}