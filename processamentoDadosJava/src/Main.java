public class Main {
    public static void main(String[] args) {

        int x,y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        //sempre indique o tipo de número, se a expressão for de ponto flutuante(não inteira)

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2 * h;

        System.out.println(area);


        //casting

        int a,d;
        double resultado;

        a = 5;
        d = 2;

        resultado = (double) a/d;

        System.out.println(resultado);


        double e;
        int f;

        e = 5.0;
        f = (int) e;

        System.out.println(f);
    }
}