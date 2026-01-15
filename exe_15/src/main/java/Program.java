/* Números primos até N  14/01/2026

Peça ao usuário um número inteiro **N**.
Mostre todos os **números primos** entre **1 e N**.*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
           boolean primo = true;

           for (int j = 2; j < i; j++){
               if (i % j == 0) {
                   primo = false;
                   break;
               }
           }

            if (primo) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}
