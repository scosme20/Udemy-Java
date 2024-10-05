import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner op = new Scanner(System.in);
        int minutos;
        double preco;

        minutos = 100;
        preco = 50;

        System.out.println("Digite a quantidade de minutos: ");
        minutos = op.nextInt();

        if (minutos < 100) {
            System.out.println("Valor a pagar: 50");
        } else {
            preco = ((minutos - 100) * 2) + preco;
            System.out.println(preco);
        }

        op.close();
    }
}