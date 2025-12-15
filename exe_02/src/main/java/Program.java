import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quant = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            if (n > 10) {
                quant++;
            }
        }

        System.out.println("A quantidade de números maiores que 10: " + quant);

        sc.close();

    }
}


/* 2. Contagem de números maiores que 10 > Peça ao usuário 5 números inteiros.
Conte quantos deles são maiores que 10 e mostre o total ao final.

Contagem de números maiores que 10 — Resposta (sem código)
Pedir ao usuário que digite cinco números inteiros.
Criar uma variável para armazenar a quantidade de números maiores que 10, iniciando em zero.
Para cada número digitado:
Verificar se o valor é maior que 10.
Se for maior que 10, aumentar a contagem em uma unidade.
Repetir esse processo até que os cinco números sejam informados.
Ao final, exibir a quantidade total de números maiores que 10 digitados pelo usuário.*/