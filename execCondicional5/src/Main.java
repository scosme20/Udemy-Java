import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pedidos = new Scanner(System.in);

        System.out.println("Insira o código do produto:");
        int codigo = pedidos.nextInt();

        System.out.println("Insira a quantidade:");
        int quantidade = pedidos.nextInt();

        double preco = 0;

        if (codigo == 1) {
            preco = quantidade * 4.00;
            if (quantidade > 1) {
                System.out.printf("O seu pedido são: %d Cachorros Quentes pelo preço de: R$ %.2f\n", quantidade, preco);
            } else {
                System.out.printf("O seu pedido é: %d Cachorro Quente pelo preço de: R$ %.2f\n", quantidade, preco);
            }
        } else if (codigo == 2) {
            preco = quantidade * 4.50;
            if (quantidade > 1) {
                System.out.printf("O seu pedido são: %d X-Saladas pelo preço de: R$ %.2f\n", quantidade, preco);
            } else {
                System.out.printf("O seu pedido é: %d X-Salada pelo preço de: R$ %.2f\n", quantidade, preco);
            }
        } else if (codigo == 3) {
            preco = quantidade * 5.00;
            if (quantidade > 1) {
                System.out.printf("O seu pedido são: %d X-Bacons pelo preço de: R$ %.2f\n", quantidade, preco);
            } else {
                System.out.printf("O seu pedido é: %d X-Bacon pelo preço de: R$ %.2f\n", quantidade, preco);
            }
        } else if (codigo == 4) {
            preco = quantidade * 2.00;
            if (quantidade > 1) {
                System.out.printf("O seu pedido são: %d Torradas Simples pelo preço de: R$ %.2f\n", quantidade, preco);
            } else {
                System.out.printf("O seu pedido é: %d Torrada Simples pelo preço de: R$ %.2f\n", quantidade, preco);
            }
        } else if (codigo == 5) {
            preco = quantidade * 1.50;
            if (quantidade > 1) {
                System.out.printf("O seu pedido são: %d Refrigerantes pelo preço de: R$ %.2f\n", quantidade, preco);
            } else {
                System.out.printf("O seu pedido é: %d Refrigerante pelo preço de: R$ %.2f\n", quantidade, preco);
            }
        } else {
            System.out.println("Código do produto inválido.");
        }

        pedidos.close();
    }
}
