import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner intervalo = new Scanner(System.in);

        System.out.println("Insira o valor:");
        double valor = intervalo.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.printf("O valor %.2f se encontra no intervalo de [0,25]%n", valor);
        } else if (valor > 25 && valor <= 50) {
            System.out.printf("O valor %.2f se encontra no intervalo de (25,50]%n", valor);
        } else if (valor > 50 && valor <= 75) {
            System.out.printf("O valor %.2f se encontra no intervalo de (50,75]%n", valor);
        } else if (valor > 75 && valor <= 100) {
            System.out.printf("O valor %.2f se encontra no intervalo de (75,100]%n", valor);
        } else {
            System.out.println("Fora de intervalo");
        }

        intervalo.close();
    }
}
