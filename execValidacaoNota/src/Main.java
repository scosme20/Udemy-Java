import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner valNota = new Scanner(System.in);
        double primeira, segunda, media;

        System.out.println("Insira a primeira nota: ");
        primeira = valNota.nextDouble();

        while (primeira < 0.0 || primeira > 10.0) {
            System.out.println("Valor inválido! A primeira nota deve estar entre 0 e 10. Tente novamente:");
            primeira = valNota.nextDouble();
        }

        System.out.println("Insira a segunda nota: ");
        segunda = valNota.nextDouble();

        while (segunda < 0.0 || segunda > 10.0) {
            System.out.println("Valor inválido! A segunda nota deve estar entre 0 e 10. Tente novamente:");
            segunda = valNota.nextDouble();
        }

        media = (primeira + segunda) / 2.0;

        System.out.printf("Média das notas: %.2f%n", media);

        valNota.close();
    }
}
