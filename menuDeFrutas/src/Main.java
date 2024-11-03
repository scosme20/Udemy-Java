import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int fruta;

        System.out.println("Insira o numero da fruta que deseja.");
        System.out.println("[1 - Maçã] [2 - Banana] [3 - Laranja] [4 - Melancia]");
        fruta = sc.nextInt();

        switch (fruta){
            case 1:
                System.out.println("Maçã");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Laranja");
                break;
            case 4:
                System.out.println("Melancia");
                break;
            default:
                System.out.println("Insira um codigo válido");
        }

        sc.close();
    }
}