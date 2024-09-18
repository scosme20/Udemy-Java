import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Insira a quantidade:");
        int n = numeros.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++) {
            int x = numeros.nextInt();
            if(x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 3;
            }
        }
        System.out.println(in + "in");
        System.out.println(out + "out");
        numeros.close();
    }
}