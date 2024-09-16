import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner mult = new Scanner(System.in);

        System.out.println("Insira os números:");
        int numA = mult.nextInt();
        int numb = mult.nextInt();

        if( numA % numb == 0 || numb % numA == 0) {
            System.out.println("São múltiplos");
        }else {
            System.out.println("Não são multiplos");
        }
    }
}