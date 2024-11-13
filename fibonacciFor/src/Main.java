public class Main {
    public static void main(String[] args) {
        int n1, n2;
        n1 = 0;
        n2 = 1;

        for(int cont = 0; cont < 10; cont++){
            int soma = n1 + n2;
            n1 = n2;
            n2 = soma;
            System.out.println(soma);
        }
    }
}