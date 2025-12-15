import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + (i * n));
        }

        sc.close();

    }
}

/* 3 -Tabuada até um limite > Peça ao usuário um número inteiro N.
Exiba a tabuada desse número começando por 1 e indo até N.

Tabuada até um limite — Resposta (forma escrita)
Pedir ao usuário um número inteiro N.
Criar um contador iniciando em 1.
Repetir o processo enquanto o contador for menor ou igual a N.
Em cada repetição, calcular o resultado da multiplicação do número informado pelo valor do contador.
Mostrar o resultado de cada multiplicação.
Aumentar o valor do contador a cada repetição.
Encerrar a repetição quando o contador ultrapassar o valor de N.
*/