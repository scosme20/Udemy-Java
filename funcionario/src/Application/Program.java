package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario a = new Funcionario();

        System.out.println("Insira o nome do funcionário: ");
        a.nome = sc.nextLine();

        System.out.println("Insira o salário bruto: ");
        a.salarioBruto = sc.nextDouble();

        System.out.println("Insira o imposto: ");
        a.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + a);
        System.out.println();
        System.out.println("Qual o aumento do salário ?");
        double porcentagem = sc.nextDouble();
        a.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Atualização: " + a);
        sc.close();
    }
}
