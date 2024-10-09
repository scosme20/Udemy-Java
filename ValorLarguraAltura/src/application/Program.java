package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner valor = new Scanner(System.in);
        Retangulo a;
        a = new Retangulo();

        System.out.println("Insira a altura do retângulo: ");
        System.out.println("Altura :");
        a.altura = valor.nextDouble();

        System.out.println("Insira a largura do retângulo: ");
        System.out.println("Largura :");
        a.largura = valor.nextDouble();

        double areaRe = a.area();
        double perimetroRe = a.perimetro();
        double diagonalRe = a.diagonal();

        System.out.println(areaRe);
        System.out.println(perimetroRe);
        System.out.println(diagonalRe);

        valor.close();
    }
}
