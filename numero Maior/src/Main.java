import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int primeiroNum;
        int segundoNum;
        int terceiroNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        primeiroNum = sc.nextInt();

        System.out.println("Insira o segundo número: ");
        segundoNum = sc.nextInt();

        System.out.println("Insira o terceiro número: ");
        terceiroNum = sc.nextInt();


        if( primeiroNum > segundoNum && primeiroNum > terceiroNum){
            System.out.println("O maior é o primeiro número.");
        } else if (segundoNum > primeiroNum && segundoNum > terceiroNum) {
            System.out.println("O maior é o segundo número.");
        } else {
            System.out.println("O maior é o terceiro número.");
        }

        sc.close();
    }
}