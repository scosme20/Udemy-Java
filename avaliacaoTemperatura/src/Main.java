import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double tempC;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a temperatura:");
        tempC = sc.nextDouble();

        if(tempC < 0){
            System.out.println("Congelante");
        } else if (tempC >= 0 && tempC <= 20) {
            System.out.println("Frio");
        } else if (tempC > 21 && tempC < 30) {
            System.out.println("Agradavel");
        } else {
            System.out.println("Quente");
        }

        sc.close();
    }
}