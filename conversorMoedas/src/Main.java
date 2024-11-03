import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        double valor, resultado;
        int opcao;

        System.out.println("Insira a quantidade monetária em reais.");
        valor = sc.nextDouble();

        System.out.println("Para qual moeda vai ser a conversão ?");
        System.out.println("[1 - Dolar] [2 - Euro] [3 - libra]");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                resultado = valor / 6.00;
                System.out.println(resultado);
                break;
            case 2:
                resultado = valor / 6.40;
                System.out.println(resultado);
                break;
            case 3:
                resultado = valor / 7.60;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Insira um número válido");
                break;
        }
        sc.close();
    }
}