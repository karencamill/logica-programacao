import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O primeiro número é o maior");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior");
        }
        else if (num3 > num1 && num3 > num2 ){
            System.out.println("O terceiro número é o maior");
        }
        else {
            System.out.println("OS NÚMEROS SÃO IGUAIS");
        }

        sc.close();
    }
}
