/* Sequência crescente  07/01/2026

Peça ao usuário vários números inteiros.
O programa deve continuar lendo valores até que o usuário digite 0.
Verifique se os números foram digitados em ordem crescente.*/


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anterior;
        int atual;
        boolean crescente = true;

        System.out.print("Digite um número: ");
        anterior = sc.nextInt();

        if (anterior == 0) {
            System.out.println();
            System.out.println("Nenhuma sequência foi informada.");
            sc.close();
            return;
        }

        while (true) {
            System.out.print("Digite um número: ");
            atual = sc.nextInt();

            if (atual == 0) {
                break;
            }

            if (atual <= anterior) {
                crescente = false;
            }

            anterior = atual;
        }

        if (crescente) {
            System.out.println();
            System.out.println("A sequencia é crescente");
        }
        else {
            System.out.println();
            System.out.println("A sequencia não é crescente");
        }

        sc.close();

    }
}

