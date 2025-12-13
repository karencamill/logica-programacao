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


/* 4 - Soma dos números até N > Solicite um número inteiro N e calcule a soma de todos os números de 1 até N.

Soma dos números até N — Resposta
Ler um número inteiro NUM informado pelo usuário.
Criar uma variável para acumular a soma, começando em 0.
Repetir um processo que começa em 1 e vai até NUM, adicionando cada número à soma.
Ao final, exibir o valor total somado.
*/


