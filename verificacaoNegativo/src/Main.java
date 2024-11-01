import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número para a verificação:");
        numero = sc.nextInt();

        if (numero > 0){
            System.out.println("É positivo");
        } else if (numero < 0) {
            System.out.println("É negativo");
        } else {
            System.out.println("É neutro");
        }

        sc.close();
    }
}