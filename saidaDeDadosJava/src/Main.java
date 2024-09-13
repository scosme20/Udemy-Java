import java.util.Locale;
public class Main {
    public static void main(String[]args) {
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        //para escrever conteúdo de uma variavel com ponto flutuante use %n
        System.out.printf("%.2f%n", x);
        System.out.println("Bom dia!");
        //Para mudar a localização do seu programa importe import java.util.Locale;
        // use  Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        //para concatenar vários elementos em um mesmo comando de escrita
        //faça "Testo1 %f Testo2 %f Testo3", variável1, vaiavel2
        //%f = ponto flutuante
        //%n =quebra de linha
        //%d = inteiro
        //%s = texto
        System.out.printf("Resultado = %.2f metros%n", x);



        String nome = "Sebastião Cosme";
        int idade = 22;
        double renda = 5000;
        System.out.printf("Olá, bom dia meu nome é %s, tenho %d e minha renda mensal é de R$ %.2f reais.%n", nome, idade, renda);
    }
}