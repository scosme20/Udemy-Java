import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner aum = new Scanner(System.in);
        double salarioPessoa, novoSalario, aumento, porcentagem;


        System.out.println("Digite o salario da pessoa: ");
        salarioPessoa = aum.nextDouble();

        if (salarioPessoa <= 1000){
            porcentagem = 20.0/100.0 ;
            aumento = salarioPessoa * porcentagem;
            novoSalario = salarioPessoa + aumento;
            System.out.printf("Novo salário: %.2f%n", novoSalario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.printf("Porcentagem: %.2f%% %n", porcentagem * 100);
        }
        else if (salarioPessoa >= 1000 && salarioPessoa <= 3000) {
            porcentagem = 15.0/100.0 ;
            aumento = salarioPessoa * porcentagem;
            novoSalario = salarioPessoa + aumento;
            System.out.printf("Novo salário: %.2f%n", novoSalario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.printf("Porcentagem: %.2f%% %n", porcentagem * 100);
        }
        else if (salarioPessoa >= 3000 && salarioPessoa <= 8000) {
            porcentagem = 10.0/100.0 ;
            aumento = salarioPessoa * porcentagem;
            novoSalario = salarioPessoa + aumento;
            System.out.printf("Novo salário: %.2f%n", novoSalario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.printf("Porcentagem: %.2f%% %n", porcentagem * 100);
        }
        else {
            porcentagem = 5.0/100.0 ;
            aumento = salarioPessoa * porcentagem;
            novoSalario = salarioPessoa + aumento;
            System.out.printf("Novo salário: %.2f%n", novoSalario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.printf("Porcentagem: %.2f%% %n", porcentagem * 100);
        }

        aum.close();
    }
}