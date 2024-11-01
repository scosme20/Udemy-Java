import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Quantos anos você tem ?");
        idade = sc.nextInt();

        String descobrir = (idade > 18) ? "Vai com tudo" : "É uma cilada bino";
        System.out.println(descobrir);

        sc.close();
    }
}