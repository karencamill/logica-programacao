/*### **10. Menu simples**
Crie um menu com as opções:
1. Somar dois números
2. Subtrair dois números
3. Multiplicar dois números
4. Dividir dois números
5. Sair

O menu deve repetir até o usuário escolher a opção **5**.*/

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opc = 0;
        while (opc != 5) {

            System.out.println();
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Multiplicar dois números");
            System.out.println("4. Dividir dois números");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println();
                    System.out.println("Somar dois números");
                    System.out.print("Digite um número: ");
                    int a1 = sc.nextInt();
                    System.out.print("Digite outro número: ");
                    int b1 = sc.nextInt();

                    System.out.println();
                    System.out.println("A soma dos números é: " + (a1 + b1));
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Subtrair dois números");
                    System.out.print("Digite um número: ");
                    int a2 = sc.nextInt();
                    System.out.print("Digite outro número: ");
                    int b2 = sc.nextInt();

                    System.out.println();
                    System.out.println("O resultado da subtração é : " + (a2 - b2));
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Multiplicar dois números");
                    System.out.print("Digite um número: ");
                    int a3 = sc.nextInt();
                    System.out.print("Digite outro número: ");
                    int b3 = sc.nextInt();

                    System.out.println();
                    System.out.println("O resultado da multiplicação é : " + (a3 * b3));
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Dividir dois números");
                    System.out.print("Digite um número: ");
                    double a4 = sc.nextDouble();
                    System.out.print("Digite outro número: ");
                    double b4 = sc.nextDouble();

                    System.out.println();
                    if (b4 != 0) {
                        System.out.printf("Resultado da divisão %.1f" , (a4 / b4));
                        System.out.println();
                    } else {
                        System.out.println("Erro: divisão por zero.");
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();

    }
}
