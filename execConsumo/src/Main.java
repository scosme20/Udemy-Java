import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int distancia;
        double gasto, medio;
        Scanner consumo = new Scanner(System.in);

        System.out.println("Insira a distância percorida: ");
        distancia = consumo.nextInt();
        consumo.nextLine();

        System.out.println("Insira o gasto de combustível: ");
        gasto = consumo.nextDouble();

        medio = distancia / gasto;

        consumo.close();

        System.out.println(medio);
    }
}