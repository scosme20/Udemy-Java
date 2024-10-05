import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner gl = new Scanner(System.in);
        double mediaGli;
        String cla;

        System.out.println("Insira a medida da glicose: ");
        mediaGli = gl.nextDouble();

        if(mediaGli <= 100.0) {
            System.out.println("Classificacao: normal");
        } else if (mediaGli <= 140.0) {
            System.out.println("Classificacao: elevado");
        } else {
            System.out.println("Classificacao: diabetes");
        }

        gl.close();
    }
}