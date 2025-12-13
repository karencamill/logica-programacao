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


/* 8 - Números pares até um limite > Solicite um número inteiro e exiba todos os números pares entre 0 e esse número.

Números pares até um limite — Resposta (escrita)
Ler um número inteiro informado pelo usuário.
Iniciar uma contagem começando em 0.
Repetir o processo até chegar ao número informado:
Verificar se o número atual é par.
Se for par, exibir esse número.
Avançar a contagem até atingir o limite informado.
Encerrar o processo ao final da contagem.
*/

