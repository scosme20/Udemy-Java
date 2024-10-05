import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ln = new Scanner(System.in);
        int codigo, quantidade;
        double preco;

        System.out.println("Insira o código do produto: ");
        codigo = ln.nextInt();

        System.out.println("Insira a quantidade: ");
        quantidade = ln.nextInt();

        if (codigo == 1){
            preco = 5.00 * quantidade;
            System.out.println(preco);
        } else if (codigo == 2) {
            preco = 3.50 * quantidade;
            System.out.println(preco);
        } else if (codigo == 3) {
            preco = 4.80 * quantidade;
            System.out.println(preco);
        } else if (codigo == 4) {
            preco = 8.90 * quantidade;
            System.out.println(preco);
        } else if (codigo == 5) {
            preco = 7.32 * quantidade;
            System.out.println(preco);
        } else {
            System.out.println("Insira um código válido!");
        }

        ln.close();
    }
}