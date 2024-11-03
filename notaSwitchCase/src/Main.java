import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota");
        nota = sc.next();

        switch (nota){
            case "A":
            case "a":
                System.out.println("Excelente!");
                break;
            case "B":
            case "b":
                System.out.println("Muito bom!");
                break;
            case "C":
            case "c":
                System.out.println("Bom");
                break;
            case "D":
            case "d":
                System.out.println("Precisa melhorar");
                break;
            case "E":
            case "e":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Insira uma nota valida");
                break;
        }
        sc.close();
    }
}