import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de números ímpares: " + contadorImpares);

        sc.close();

    }
}


/* 9 - Contagem de números ímpares > Peça ao usuário 10 números. Conte quantos deles são ímpares e mostre o total ao final.

Contagem de números ímpares — Resposta (escrita)
Criar uma variável para contar a quantidade de números ímpares, iniciando em 0.
Pedir ao usuário que informe 10 números.
Para cada número informado:
Verificar se o número é ímpar.
Se for ímpar, aumentar o contador em 1.
Após receber os 10 números, exibir a quantidade total de números ímpares informados.
*/
