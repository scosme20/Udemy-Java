import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, y;
        y = 0;

        System.out.println("Insira um número");
        i = sc.nextInt();

        for (i = i; y < 11; y++ ){
            System.out.println(i * y);
        }
    }
}