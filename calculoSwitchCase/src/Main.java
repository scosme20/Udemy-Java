import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String operador;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        num2 = sc.nextInt();

        System.out.println("Insira o simbolo da operacao:");
        operador = sc.next();

        switch (operador){
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operador invalido:");
                break;
        }

        sc.close();

    }
}