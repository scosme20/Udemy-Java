import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String emailOriginal, senhaOriginal, email, senha;
        Scanner sc = new Scanner(System.in);

        emailOriginal = "emailExemplo@hotmail.com";
        senhaOriginal = "senhaExemplo123";

        System.out.println("Insira o seu email:");
        email = sc.next();

        System.out.println("Insira a sua senha:");
        senha = sc.next();

        if (!email.equals(emailOriginal) || !senha.equals(senhaOriginal)){
            System.out.println("Email ou senha incorretos");
        } else {
            System.out.println("Usuário logado");
        }

        sc.close();
    }
}
