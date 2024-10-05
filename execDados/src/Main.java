import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner dado = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite as três distâncias: ");
        a = dado.nextDouble();
        b = dado.nextDouble();
        c = dado.nextDouble();

        if(a > b && a > c){
            System.out.println("A maior distância foi a primeira: " + a);
        } else if (b > a && b > c) {
            System.out.println("A maior distância foi a segunda: " + b);
        } else if (c > b && c > a) {
            System.out.println("A maior distância foi a terceira: " + c);
        } else {
            System.out.println("As três distancias foram iguais:");
        }

        dado.close();
    }
}