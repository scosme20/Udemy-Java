import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner condicao = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira um número:");
        int numero = condicao.nextInt();

        if( numero % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }
}