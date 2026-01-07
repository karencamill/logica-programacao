/* Média apenas dos pares 06/01/2026
Peça ao usuário vários números inteiros até que ele digite 0.
Calcule e mostre a média apenas dos números pares digitados.*/

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        double media = 0;

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        while (num != 0) {

            if (num % 2 == 0) {
                soma += num;
                quantidade ++;
            }

            System.out.print("Digite um número: ");
            num = sc.nextInt();

        }

        if (quantidade > 0) {
            media = (double) soma / quantidade;
        }
        else {
            System.out.println();
            System.out.println("Nenhum número par digitado.");
        }

        System.out.println();
        System.out.println("A soma dos números pares: " + soma);
        System.out.println("Quantidade de números pares: " + quantidade);
        System.out.printf("A média dos números pares é: %.2f" , media);

        sc.close();

    }
}


