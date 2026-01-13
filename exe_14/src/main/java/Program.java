import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        // Caso especial: o número 0 tem 1 dígito
        if (num == 0) {
            System.out.println("Quantidade de dígitos: 1");
        } else {
            int contador = 0;

            // Enquanto o número for maior que 0
            while (num > 0) {
                num = num / 10;   // remove um dígito
                contador++;      // conta esse dígito
            }

            System.out.println("Quantidade de dígitos: " + contador);
        }

        sc.close();
    }
}
