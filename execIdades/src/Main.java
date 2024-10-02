import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner pessoa = new Scanner(System.in);
        int idade1, idade2;
        String nome1, nome2;
        double media;

        System.out.println("Insira o nome da primeira pessoa: ");
        nome1 = pessoa.nextLine();

        System.out.println("Insira a idade da primeira pessoa: ");
        idade1 = pessoa.nextInt();
        pessoa.nextLine();

        System.out.println("Insira o nome da segunda pessoa: ");
        nome2 = pessoa.nextLine();

        System.out.println("Insira a idade da segunda pessoa: ");
        idade2 = pessoa.nextInt();

        media = (double) (idade1 + idade2) / 2;

        System.out.printf("A média de idade entre %s e %s é: %.1f%n", nome1, nome2, media);
        pessoa.close();
    }
}