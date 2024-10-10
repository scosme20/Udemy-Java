package Application;
import java.util.Scanner;
import java.util.Locale;
import Entities.Register;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciar cadastro de conta bancária:");
        System.out.println();

        System.out.println("Insira o numero da conta: ");
        int numBank = sc.nextInt();

        System.out.println("Insira o seu nome: ");
        String nome = sc.next();

        System.out.println("Existe um depósito inicial ?");
        char inDeposit = sc.next().charAt(0);
        Register pessoa;

        if(inDeposit == 'y'){
            System.out.println("Insira o valor do deposito");
            double value = sc.nextDouble();
            pessoa = new Register(nome, numBank, value);
        } else {
            pessoa = new Register(nome, numBank);
        }

        System.out.println("Dados da conta: ");
        System.out.println(pessoa);

        System.out.println();
        System.out.print("Insira um valor para deposito:");
        double depositValue = sc.nextDouble();
        pessoa.deposit(depositValue);
        System.out.println("Atualizacao de conta: ");
        System.out.println(pessoa);

        System.out.println();
        System.out.print("Insira um valor para saque:");
        double saqueValue = sc.nextDouble();
        pessoa.removeDeposit(saqueValue);
        System.out.println("Atualizacao de conta: ");
        System.out.println(pessoa);

        sc.close();

    }
}
