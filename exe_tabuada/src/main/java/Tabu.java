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

/* Tabuada — Resposta (escrita)

Ler um número informado pelo usuário.
Iniciar um contador começando em 1.
Enquanto o contador for menor ou igual a 10:
Multiplicar o número informado pelo valor do contador.
Mostrar o resultado da multiplicação.
Aumentar o contador em 1.
Encerrar o processo após mostrar a multiplicação por 10.
*/

