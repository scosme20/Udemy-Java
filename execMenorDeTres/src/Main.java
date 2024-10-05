import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int primeiro, segundo, terceiro;
        Scanner mn = new Scanner(System.in);

        System.out.println("Insira o primeiro valor : ");
        primeiro = mn.nextInt();
        
        System.out.println("Insira o segundo valor : ");
        segundo = mn.nextInt();
        
        System.out.println("Insira o terceiro valor: ");
        terceiro = mn.nextInt();
        
        if (primeiro < segundo && primeiro < terceiro){
            System.out.println(primeiro);
        } else if (segundo < terceiro && segundo < primeiro) {
            System.out.println(segundo);
        } else if (terceiro < primeiro && terceiro < segundo) {
            System.out.println(terceiro);
        } else if (primeiro == segundo && segundo == terceiro) {
            System.out.println(primeiro);
        }
        mn.close();
    }
}