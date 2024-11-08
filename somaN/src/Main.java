import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma, cont;
        soma = 0;
        cont = 0;
        System.out.println("Insira um número:");
        num = sc.nextInt();

        while (cont <= num){
            System.out.println(cont);
            soma += cont;
            cont++;
        }
        System.out.println(soma);
        sc.close();
    }
}