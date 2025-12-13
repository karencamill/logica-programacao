import java.util.Scanner;

public class Limite {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um número: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++ ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
