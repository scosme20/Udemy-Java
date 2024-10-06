import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);
        mostrar(maior);
        sc.close();
    }
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void mostrar(int value) {
        System.out.println("Maior: " + value);
    }
}