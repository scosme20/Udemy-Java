import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.println("Insira o ano:");
        ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        sc.close();
    }
}