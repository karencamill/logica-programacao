import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}


/* 5 - Números divisíveis por 3 
Peça ao usuário um número inteiro N. Mostre todos os números entre 1 e N que são divisíveis por 3.

Números divisíveis por 3 — Resposta (forma escrita)
Pedir ao usuário um número inteiro N.
Criar um contador iniciando em 1.
Repetir o processo enquanto o contador for menor ou igual a N.
Em cada repetição, verificar se o número atual é divisível por 3.
Se for divisível por 3, mostrar esse número.
Incrementar o contador a cada repetição.
Encerrar a repetição quando o contador ultrapassar o valor de N.

*/
