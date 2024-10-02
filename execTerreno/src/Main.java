import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner terreno = new Scanner(System.in);
        double largura, comprimento, valorMetro, area, preco;

        System.out.println("Digite a largura do terreno: ");
        largura = terreno.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = terreno.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        valorMetro = terreno.nextDouble();

        area = largura * comprimento;
        preco = area * valorMetro;

        System.out.printf("A area do terreno é de: %.2f.n", area);
        System.out.printf("O preco do terreno é de: %.2f.n", preco);
    }
}