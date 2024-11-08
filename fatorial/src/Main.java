import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Insira o número do fatorial");
        x = sc.nextInt();
        y = x;

        while (x > 1){
            y = y * (x -1);
            x--;
            System.out.println(y);
        }
        sc.close();
    }
}