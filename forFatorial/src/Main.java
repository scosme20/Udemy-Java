import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.println("Insira o fatorial:");
        x = sc.nextInt();
        y = x;


        for(int i; x > 1; x--){
            y = y * (x -1);
            System.out.println(y);
        }

        sc.close();
    }
}