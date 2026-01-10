/* Soma com condição**   09/01/2026

Peça ao usuário vários números inteiros.
O programa deve continuar lendo valores **até que o usuário digite -1**.
Some apenas os números **entre 10 e 50** (inclusive).*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        while (num != -1) {

            if (num >= 10 && num <= 50){
                soma += num;
            }

            System.out.print("Digite um número: ");
            num = sc.nextInt();

        }

        System.out.println();
        System.out.println("A soma dos números entre 10 e 50 digitados é: " + soma);
        sc.close();

    }
}
