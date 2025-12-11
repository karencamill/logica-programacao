import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("O número é igual a zero");
        }
        else if (num >= 1) {
            System.out.println("O número é positivo");
        }
        else {
            System.out.println("O número é negativo");
        }

        sc.close();
    }
}
