import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner nts = new Scanner(System.in);
        double primeiraNota, segundaNota, notaFinal;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = nts.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = nts.nextDouble();

        notaFinal = primeiraNota + segundaNota;

        if(notaFinal >= 60.0){
            System.out.printf("Aprovado com a nota: "+ notaFinal);
        } else {
            System.out.printf("Reprovado com a nota: "+ notaFinal);
        }

        nts.close();
    }
}