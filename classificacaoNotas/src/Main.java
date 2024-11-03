import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int notas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua nota:");
        notas = sc.nextInt();

        if(notas < 5){
            System.out.println("Reprovado");
        } else if (notas >= 5 && notas <= 7) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}