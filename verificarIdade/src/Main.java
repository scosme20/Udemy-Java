import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade:");
        idade = sc.nextInt();

        if(idade > 18 && idade < 65){
            System.out.println("Adulto");
        } else if (idade > 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}