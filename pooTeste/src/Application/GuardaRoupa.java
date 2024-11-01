package Application;

import java.util.Scanner;
import java.util.Locale;
import Entities.Separacao;

public class GuardaRoupa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço da roupa: ");
        double precoRoupas = sc.nextDouble();

        System.out.print("Informe a quantidade de roupas: ");
        int quantidade = sc.nextInt();

        sc.nextLine();
        System.out.print("Informe o tipo de roupa (c para camisa, j para jeans, b para bermuda): ");
        String tipo = sc.nextLine();

        Separacao guardaRoupa = new Separacao(precoRoupas, quantidade, tipo);

        guardaRoupa.verificarPrecoRoupa();

        guardaRoupa.classificarRoupa();

        System.out.print("Quantas roupas você comprou? ");
        int comprou = sc.nextInt();
        guardaRoupa.comprouRoupas(comprou);

        System.out.println("Quantidade de roupas após compra: " + guardaRoupa.getQuantidade());

        System.out.print("Quantas roupas você doou? ");
        int doou = sc.nextInt();
        guardaRoupa.doouRoupas(doou);

        System.out.println("Quantidade de roupas após doação: " + guardaRoupa.getQuantidade());

        sc.close();
    }
}
