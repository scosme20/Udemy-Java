import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner valor = new Scanner(System.in);

        System.out.println("Insira a senha: ");
        int senha = valor.nextInt();

        while(senha != 2002) {
            System.out.println("Senha incorreta! Por favor tente novamente.");
            senha = valor.nextInt();
        }


        System.out.println("Senha correta");

        valor.close();
    }
}