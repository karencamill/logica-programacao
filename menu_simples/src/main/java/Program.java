/*### **10. Menu simples**

Crie um menu com as opções:

1. Somar dois números
2. Subtrair dois números
3. Multiplicar dois números
4. Sair

O menu deve repetir até o usuário escolher a opção **4**.*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc = 0;
        while (opc != 4) {
            System.out.println();
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Multiplicar dois números");
            System.out.println("4. Sair");


            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();

            if (opc == 1) {
                System.out.println();
                System.out.println("Somar dois números");
                System.out.print("Digite um número: ");
                int num1 = sc.nextInt();
                System.out.print("Digite outro número: ");
                int num2 = sc.nextInt();

                int soma = num1 + num2;

                System.out.println();
                System.out.println("A soma dos números é: " + soma);
            }
            else if (opc == 2) {
                System.out.println();
                System.out.println("Subtrair dois números");
                System.out.print("Digite um número: ");
                int num1 = sc.nextInt();
                System.out.print("Digite outro número: ");
                int num2 = sc.nextInt();

                int subtracao = num1 - num2;

                System.out.println();
                System.out.println("O resultado da subtração é : " + subtracao);
            }
            else if (opc == 3) {
                System.out.println();
                System.out.println("Multiplicar dois números");
                System.out.print("Digite um número: ");
                int num1 = sc.nextInt();
                System.out.print("Digite outro número: ");
                int num2 = sc.nextInt();

                int multiplicacao = num1 * num2;

                System.out.println();
                System.out.println("A multiplicacao dos números é: " + multiplicacao);
            }
            else if (opc == 4){
                System.out.println("Programa encerrado");
                break;
            }
            else {
                System.out.println("Opção inválida");
            }


        }
        
        sc.close();

    }
}
