import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double desconto, valor, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da compra:");
        valor = sc.nextDouble();

        if(valor > 100){
            desconto = valor * 0.1;
            resultado = valor - desconto;
            System.out.println(resultado);
        } else if (valor > 50 && valor < 100) {
            desconto = valor * 0.05;
            resultado = valor - desconto;
            System.out.println(resultado);
        } else {
            System.out.println(valor);
        }

        sc.close();
    }
}