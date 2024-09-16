import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner renda = new Scanner(System.in);

        System.out.println("Insira o salário do habitante:");
        double salario = renda.nextDouble();
        double imposto;

        if (salario <= 2000.0) {
            System.out.println("O habitante está isento de impostos");
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("O habitante que recebe: R$ %.2f vai ter que pagar R$ %.2f de imposto%n", salario, imposto);
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
            System.out.printf("O habitante que recebe: R$ %.2f vai ter que pagar R$ %.2f de imposto%n", salario, imposto);
        } else {
            imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("O habitante que recebe: R$ %.2f vai ter que pagar R$ %.2f de imposto%n", salario, imposto);
        }

        renda.close();
    }
}
