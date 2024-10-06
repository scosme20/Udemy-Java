import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;

        while (true) {
            System.out.println("Digite um valor para X (ou 0 para sair):");
            X = sc.nextInt();

            if (X == 0) {
                break;
            }

            if (X % 2 != 0) {
                X++;
            }

            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += X;
                X += 2;
            }

            System.out.println("Soma dos 5 pares consecutivos: " + soma);
        }

        sc.close();
    }
}
