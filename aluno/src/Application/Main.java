package Application;
import java.util.Locale;
import java.util.Scanner;
import Program.Analise;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Analise aluno;
        aluno = new Analise();

        System.out.println("Insira a primeira nota: ");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Insira a seguna nota: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        aluno.nota3 = sc.nextDouble();

        double notaF = aluno.calcularNotaFinal();
        System.out.println("Nota final: " + notaF);

        if (notaF >= 60) {
            System.out.println("Aprovado com: " + notaF);
        } else {
            double faltaP = 100 - notaF;
            System.out.println("Reprovado com: " + notaF + " faltam " + faltaP);
        }

        sc.close();
    }
}
