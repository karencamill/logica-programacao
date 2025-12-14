import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorImpares = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de números ímpares: " + contadorImpares);

        sc.close();

    }
}
