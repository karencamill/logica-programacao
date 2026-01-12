/* Número perfeito  12/01/2026

Peça ao usuário um número inteiro **N**.
Verifique se ele é um **número perfeito**
*(a soma dos seus divisores, exceto ele mesmo, é igual ao próprio número)*.*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        int somaDivisor = 0;

        System.out.println("Divisores próprios de " + num + ":");

        for (int i = 1; i < num; i++){

            if (num % i == 0) {
                System.out.println(i + " é divisor");
                somaDivisor += i;
            }

        }

        System.out.println();
        System.out.println("A soma dos divisores: " + somaDivisor);
        System.out.println();

        if (num == somaDivisor) {
            System.out.println(num + " é um número perfeito");
        } else {
            System.out.println(num + " Não é um número perfeito");
        }

        sc.close();

    }
}

