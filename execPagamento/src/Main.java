import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double valorHora, saldo;
        int horaTrabalhada;
        String nome;
        Scanner pagamento = new Scanner(System.in);

        System.out.println("Insira o nome: ");
        nome = pagamento.nextLine();

        System.out.println("Insira o valor por hora: ");
        valorHora = pagamento.nextDouble();
        pagamento.nextLine();

        System.out.println("Insira as horas trabalhadas: ");
        horaTrabalhada = pagamento.nextInt();
        pagamento.nextLine();

        saldo = valorHora * horaTrabalhada;

        System.out.printf("O pagamento para " + nome + " deve ser de " + saldo);
        pagamento.close();
    }
}