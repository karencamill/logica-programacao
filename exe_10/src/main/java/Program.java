/* Contar maior, menor e igual a um valor**

Peça ao usuário um número inteiro **X**.

Depois peça **5 números inteiros** e informe:

- quantos são **maiores que X**
- quantos são **menores que X**
- quantos são **iguais a X***/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdmaior = 0;
        int qtdmenor = 0;
        int qtdigual = 0;

        System.out.print("Digite um número: ");
        int numX = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num > numX) {
                qtdmaior++;
            }else if (num < numX) {
                qtdmenor++;
            }else {
                qtdigual++;
            }
        }

        System.out.println();
        System.out.println(qtdmaior + " número é maior que " + numX);
        System.out.println(qtdmenor + " número é menor que " + numX);
        System.out.println(qtdigual + " número é igual a " + numX);

        sc.close();

    }
}
