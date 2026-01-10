/*Fatorial  09/01/2026

Peça ao usuário um número inteiro **N**.
Calcule e mostre o **fatorial** desse número.*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Fatorial não existe.");
        }
        else if (num == 0){
            System.out.println("Fatorial é 1.");
        }
        else {
            int fatorial = 1;

            for (int i = num; i >= 1; i--) {
                int anterior = fatorial;
                fatorial = fatorial * i;
                System.out.println(anterior + " * " + i + " = " + fatorial);
            }

            System.out.println();
            System.out.println("Fatorial: " + fatorial);
        }

        sc.close();
    }
}
