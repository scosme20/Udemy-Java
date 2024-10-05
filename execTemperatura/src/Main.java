import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner temp = new Scanner(System.in);
        double fah, cel;
        String  temperatura;

        System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
        temperatura = temp.nextLine();

        if (temperatura.equalsIgnoreCase("F")) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            fah = temp.nextDouble();
            cel = (double) 5 / 9 * (fah - 32);
            System.out.println(cel);
        } else if (temperatura.equalsIgnoreCase("C")) {
            {
                System.out.println("Digite a temperatura em Celsius:");
                cel = temp.nextDouble();
                fah = cel * 9 / 5 + 32;
                System.out.printf("Equivalente em Fahrenheit: %.2f%n", fah);
            }
        }else {
            System.out.println("Escala inválida! Por favor, insira 'C' ou 'F'.");
        }
        temp.close();

    }
}