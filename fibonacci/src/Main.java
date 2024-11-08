public class Main {
    public static void main(String[] args) {
        int n1, n2, soma, cont;
        cont = 0;
        n1 = 0;
        n2 = 1;
        soma = 0;

        while (cont < 10){
            soma = n1 + n2;
            n1 = n2 ;
            n2 = soma;
            cont++;
            System.out.println(soma);
        }
    }
}