import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int civil;

        System.out.println("Qual o seu estado civil ?");
        System.out.println("[1 - Solteiro] [2 - Casado] [3 - Divorciado] [4 - Viuvo]");
        civil = sc.nextInt();

        switch (civil){
            case 1:
                System.out.println("Solteiro");
                break;
            case 2:
                System.out.println("Casado");
                break;
            case 3:
                System.out.println("Divorciado");
                break;
            case 4:
                System.out.println("Viuvo");
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;
        }
        sc.close();
    }
}