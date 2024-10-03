import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double preco, recebido, troco;
        int quantidade;
        Scanner pagamento = new Scanner(System.in);

        System.out.println("Insira o preço unitário do produto: ");
        preco = pagamento.nextDouble();

        System.out.println("Insira a quantidade comprada: ");
        quantidade = pagamento.nextInt();

        System.out.println("Insira o dinheiro recebido: ");
        recebido = pagamento.nextDouble();

        troco = recebido - (quantidade * preco);

        System.out.println(troco);
        pagamento.close();
    }
}