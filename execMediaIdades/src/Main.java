import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner media = new Scanner(System.in);
        int idade, contador, soma;
        soma = 0;
        contador = 0;

        System.out.println("Digite as idades (número negativo para encerrar):");
        idade = media.nextInt();

        if (idade < 0) {
            System.out.println("Impossível calcular!");
        } else {
            while (idade >= 0) {
                soma += idade;
                contador++;
                idade = media.nextInt();
            }

            if (contador > 0) {
                double mediaI = (double) soma / contador;
                System.out.printf("Média de idade: %.2f%n", mediaI);  // Correção aqui
            }
        }

        media.close();
    }
}
