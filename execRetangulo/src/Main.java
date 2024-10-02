import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double base, altura, area, perimetro, diagonal;
        Scanner medidada = new Scanner(System.in);

        System.out.println("Insira o valor da base do retangulo: ");
         base = medidada.nextDouble();

        System.out.println("Insira o valor da altura do retangulo: ");
        altura = medidada.nextDouble();

        area = base * altura;
        perimetro = (altura + altura) + (base + base);
        diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.printf("Area: %.4f%n", area);
        System.out.printf("Perimetro: %.4f%n", perimetro);
        System.out.printf("Diagonal: %.4f%n", diagonal);

        medidada.close();
    }
}