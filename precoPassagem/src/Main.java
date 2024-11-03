import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int transporte;

        System.out.println("Insira qual o seu meio de transporte:");
        System.out.println("[1 - ônibus] [2 - Trem] [3 - Metro] [4 - Taxi]");
        transporte = sc.nextInt();

        switch (transporte){
            case 1:
                System.out.println("Ônibus:  R$4,00");
                break;
            case 2:
                System.out.println("Trem: R$5,50");
                break;
            case 3:
                System.out.println("Metrô: R$6,00");
                break;
            case 4:
                System.out.println("Táxi: R$10,00");
                break;
            default:
                System.out.println("Insira um transporte válido.");
                break;
        }
        sc.close();
    }
}