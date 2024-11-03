import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor, conversao;
        int medida;

        System.out.println("Insira o valor em metros:");
        valor = sc.nextDouble();

        System.out.println("Insira a medida:");
        System.out.println("[1 - Quilômetros] [2 - Centímetros] [3 - Milímetros]");
        medida = sc.nextInt();

        switch (medida){
            case 1:
               conversao = valor / 1000;
                System.out.println(conversao);
                break;
            case 2:
                conversao = valor * 100;
                System.out.println(conversao);
                break;
            case 3:
                conversao = valor * 1000;
                System.out.println(conversao);
                break;
            default:
                System.out.println("Insira uma medida válida!");
                break;
        }

        sc.close();
    }
}