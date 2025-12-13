import java.util.Scanner;

public class Tabu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        for (int c = 1; c <= 10; c++) {
            System.out.println(num + " x " + c + " = " + (num * c));
        }

        sc.close();
    }
}
