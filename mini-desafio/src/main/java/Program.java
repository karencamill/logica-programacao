import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        int soma = 0;
        int par = 0;
        int impar = 0;

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        while (n != 0) {
            soma = soma + n;
            quantidade++; // quantidade de numero digitado

            if (n % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }

            System.out.print("Digite um número inteiro: ");
            n = sc.nextInt();
        }

        double media = (double) soma / quantidade;

        System.out.println();
        System.out.println("A quantidade de números digitados: " + quantidade);
        System.out.println("A soma de todos os números: " + soma);
        System.out.println("A quantidade de números pares: " + par);
        System.out.println("A quantidade de números impares: " + impar);
        System.out.println("A média dos números digitados: " + media);

        sc.close();

    }
}
