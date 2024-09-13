import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");

        int valor1;
        valor1 = num.nextInt();

        System.out.println("Insira o segundo valor:");

        int valor2;
        valor2 = num.nextInt();

        int resultado;
        resultado = valor1 + valor2;

        System.out.println("O resultado dessa soma é: " + resultado);

    }
}