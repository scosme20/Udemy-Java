import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro valor:");

        Scanner valor = new Scanner(System.in);

        int a;
        a = valor.nextInt();

        System.out.println("Insira o segunda valor: ");

        int b;
        b = valor.nextInt();

        System.out.println("Insira o terceiro valor:");

        int c;
        c = valor.nextInt();

        System.out.println("Insira o quarto valor");

        int d;
        d = valor.nextInt();

        int diferenca;
        diferenca = (a * b - c * d);

        System.out.println("A diferença é:" + diferenca);
    }
}