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


/* Validação de senha > Peça ao usuário para digitar uma senha. Enquanto a senha digitada for diferente de uma senha pré-definida, continue pedindo novamente.
Quando acertar, exiba uma mensagem de acesso permitido.

Validação de senha — Resposta (escrita)
Definir uma senha correta previamente.
Pedir ao usuário que digite uma senha.
Enquanto a senha digitada for diferente da senha correta:
Informar que a senha está incorreta.
Pedir que o usuário digite a senha novamente.
Quando a senha digitada for igual à senha correta:
Exibir uma mensagem informando que o acesso foi permitido.
Encerrar o processo.
*/

