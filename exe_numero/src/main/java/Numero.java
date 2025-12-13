import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("O número é igual a zero");
        }
        else if (num > 0) {
            System.out.println("O número é positivo");
        }
        else {
            System.out.println("O número é negativo");
        }

        sc.close();
    }
}

/* 2 - Número positivo, negativo ou zero > Solicite um número e indique se ele é positivo, negativo ou igual a zero.

Número positivo, negativo ou zero — Resposta
Ler um número.
Se o número for igual a zero, exibir “zero”
Se o número for maior que zero, exibir “positivo”.
Se for menor que zero, exibir “negativo”.
*/


