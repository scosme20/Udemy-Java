import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = sc.nextInt();
        int soma = 0;

        for(int i = 1; i <= num ; i++){
            soma += i;

        }
        System.out.println("A soma de 1 até " + num + " é: " + soma);
        sc.close();
    }
}