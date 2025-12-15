import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        while (n > 0) {
            soma += n;

            System.out.print("Digite outro número: ");
            n = sc.nextInt();
        }

        System.out.print("A soma dos números positivos é: " + soma);

        sc.close();

    }
}

/* 1 - Soma de números positivos
Peça ao usuário vários números inteiros. O programa deve continuar lendo números enquanto o valor digitado for positivo.
Ao final, mostre a soma de todos os números positivos digitados.

Soma de números positivos — Resposta (escrita)
Criar uma variável para armazenar a soma dos números, iniciando em 0.
Pedir ao usuário que digite um número inteiro.
Enquanto o número digitado for positivo:
Somar esse número ao total acumulado.
Pedir ao usuário que digite outro número.
Quando o usuário digitar um número zero ou negativo, encerrar o processo.
Exibir a soma total dos números positivos digitados.
*/
