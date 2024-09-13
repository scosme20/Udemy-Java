import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner funcionario = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numFun;
        int horas;
        double salario;
        double resultado;

        System.out.println("Insira o número de identificação do funcionário:");
        numFun = funcionario.nextInt();

        System.out.println("Insira o número de horas trabalhadas: ");
        horas = funcionario.nextInt();

        System.out.println("Insira o valor calculado por hora trabalhada: ");
        salario = funcionario.nextDouble();

        resultado = (int)horas * salario;

        System.out.printf
                ("O funcionário de número de identificação %d recebe U$ %.2f", numFun, resultado);
    }
}