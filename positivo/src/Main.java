import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo;

        System.out.println("Insira um número:");
        positivo = sc.nextInt();

        while (positivo < 0) {
            System.out.println("Insira um número positivo:");
            positivo = sc.nextInt();
            if (positivo >= 0){
                System.out.println("Obrigado");
            }
        }
        sc.close();
    }
}