import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        int a, b;

        System.out.println("Digite dois numeros inteiros: ");
        a = mn.nextInt();
        b = mn.nextInt();


        if(a % b == 0 || b % a == 0 ){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        mn.close();
    }
}