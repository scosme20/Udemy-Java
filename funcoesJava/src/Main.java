import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner exe = new Scanner(System.in);

        System.out.println("Insira os numeros: ");
        int a = exe.nextInt();
        int b = exe.nextInt();
        int c = exe.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        exe.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (x > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}