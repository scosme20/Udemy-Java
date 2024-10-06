import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner cr = new Scanner(System.in);
       int x,y;

        System.out.println("Digite dois numeros: ");
        x = cr.nextInt();
        y = cr.nextInt();


       while (x != y){
           if (x > y){
               System.out.println("Decrescente");
           } else {
               System.out.println("Crescente");
           }
           System.out.println("Digite dois numeros: ");
           x = cr.nextInt();
           y = cr.nextInt();
       }

       cr.close();
    }
}