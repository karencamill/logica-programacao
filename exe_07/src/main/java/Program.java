import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int maior = num;
        int menor = num;

        if (num == 0) {
            System.out.println();
            System.out.println("Nenhum número válido digitado.");
        }

        while(num != 0) {

            if (num > maior) {
                maior = num;
            }
            else if (num < menor) {
                menor = num;
            }

            System.out.print("Digite outro número: ");
            num = sc.nextInt();
        }

        System.out.println();
        System.out.println("O maior número é: " + maior);

        System.out.println();
        System.out.println("O menor número é: " + menor);

        sc.close();

    }
}


