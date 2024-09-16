import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner jogo = new Scanner(System.in);

        System.out.println("Insira o horário de entrada:");
        int entrada = jogo.nextInt();

        System.out.println("Insira o horário de saída");
        int saida = jogo.nextInt();

        int resultado;

        if(entrada < saida) {
            resultado = saida - entrada;
    } else {
        resultado = 24 - entrada + saida;
        }

        System.out.printf("O jogo durou: " + resultado);
    }
}