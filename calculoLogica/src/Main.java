import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacao;
        int resultado, x, y;
        x = 0;
        y = 0;

        System.out.println("Insira o tipo de operacao a ser realizada:");
        operacao = sc.next();

        System.out.println("Insira o primeiro numero:");
        x = sc.nextInt();

        System.out.println("Insira o segundo número:");
        y = sc.nextInt();

        switch (operacao){
            case "-":
                resultado = x - y;
                System.out.println(resultado);
            break;

            case "+":
                resultado = x + y;
                System.out.println(resultado);
            break;

            case "*":
                resultado = x * y;
                System.out.println(resultado);
            break;

            case "/":
            resultado = x / y;
                System.out.println(resultado);
            break;
            default:
                System.out.println("Operação inválida.");
        }

        sc.close();
    }
}