package Application;
import java.util.Locale;
import java.util.Scanner;
import utilities.Conversor;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o preco do dolar: ");
        Conversor.precoDollar = sc.nextDouble();

        System.out.println("Insira a quantidade a ser comprada: ");
        Conversor.quantidade = sc.nextDouble();

        double total = Conversor.converter();
        System.out.println(total);
        sc.close();
    }
}
