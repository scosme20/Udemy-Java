import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner dr = new Scanner(System.in);
        int segundosIn, minutos, horas, segundosSa;

        System.out.println("Digite a duracao em segundos: ");
        segundosIn = dr.nextInt();

        horas = segundosIn / 3600;
        minutos = (segundosIn % 3600) / 60;
        segundosSa = segundosIn % 60;

        System.out.printf("Duracao: %d horas, %d minutos e %d segundos%n", horas, minutos, segundosSa);

        dr.close();

    }
}