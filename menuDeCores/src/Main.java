import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numCor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao menu de cores:");
        System.out.print("[1 - Azul]");
        System.out.print(" [2 - Vermelho]");
        System.out.print(" [3 - Verde]");
        System.out.println(" [4 - Roxo]");
        System.out.println("Insira o número da cor: ");
        numCor = sc.nextInt();

        switch (numCor){
            case 1:
                System.out.println("A cor escolhida é Azul");
                break;
            case 2:
                System.out.println("A cor escolhida é vermelha");
                break;
            case 3:
                System.out.println("A cor escolhida é verde");
                break;
            case 4:
                System.out.println("A cor escolhida é roxo");
                break;
            default:
                System.out.println("Numero invalido.");
                break;
        }
        sc.close();
    }
}