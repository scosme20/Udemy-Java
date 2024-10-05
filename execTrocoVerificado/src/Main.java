import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tr = new Scanner(System.in);
        int quantidade;
        double preco, recebido, troco;

        System.out.println("Insira o preco unitário do produto:");
        preco = tr.nextDouble();

        System.out.println("Insira a quantidade: ");
        quantidade = tr.nextInt();

        System.out.println("Insira o dinheiro recebido: ");
        recebido = tr.nextDouble();


        if (recebido > preco * quantidade) {
            troco = recebido - (preco * quantidade);
            System.out.println(troco);
        }else {
            troco = (recebido - (preco * quantidade)) * -1;
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + troco);
        }
        tr.close();
    }
}