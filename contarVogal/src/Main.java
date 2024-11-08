import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();

        int contador = 0;
        int i = 0;

        texto = texto.toLowerCase();


        while (i < texto.length()) {
            char ch = texto.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contador++;
            }
            i++;
        }

        System.out.println("Número de vogais: " + contador);
    }
}
