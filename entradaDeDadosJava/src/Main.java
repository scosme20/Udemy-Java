import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //para ler uma palavra(texto sem espaço) faça
        //string x;
        //x = sc.next();

        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        //para ler um número inteiro faça
        //int y;
        //y = sc.nextInt();

        int y;
        y = sc.nextInt();
        System.out.println("Você inseriu: " + y);

        //para ler um número com ponto flutuante faça
        //double z;
        //z = sc.nextDouble();
        //para considerar o separador de decimais como ponto, Antes  da declaração do scanner faça
        //Locale.setDefault(Locale.US)

        Locale.setDefault(Locale.US);
        double z;
        z = sc.nextDouble();
        System.out.printf("Voce ganha: R$%.2f%n", + z);


        //para ler um caractere faça
        // char w;
        //w = sc.next.charAt(0)

        char w;
        w = sc.next().charAt(0);

        System.out.println("Voce digitou: " + w);

        //para ler vários dados na mesma linha faça
        //string r;
        //init s;
        //doble t;
        String r;
        int s;
        Double t;

        r = sc.next();
        s = sc.nextInt();
        t = sc.nextDouble();

        sc.close();
    }
}