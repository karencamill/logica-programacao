import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaValida = 2003;

        System.out.println("Digita uma senha: ");
        int senha = sc.nextInt();

        while (senha != senhaValida) {
            System.out.println("Senha incorreta, digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!!!");

        sc.close();
    }
}
