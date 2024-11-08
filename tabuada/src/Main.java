import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont;
        num = 0;
        cont = 0;
        System.out.println("Insira um número:");
        num = sc.nextInt();

        while(cont < 11){
            cont++;
            System.out.println(num * cont);
        }
        sc.close();
    }
}