import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        int soma = 0; // variavel soma, que vai acumular o total

        //int i = 1; começa a contagem no numero 1
        //i <= num; continua enquanto i for menor ou igual ao numero digitado
        //i++; a cada repetição, aumenta i em 1

        for (int i = 1; i <= num; i++) {
            soma += i;
        }

        //soma += i; soma o valor atual de i ao total

        System.out.println("A soma de 1 até " + num + " é: " + soma);

        sc.close();
    }
}
