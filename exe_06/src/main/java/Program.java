import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int maior = sc.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();

            if (n > maior){
                maior = n;
            }
        }

        System.out.println();
        System.out.println("O maior número é: " + maior);

        sc.close();

    }
}

/* 6 - Maior número > Peça ao usuário 5 números inteiros e informe qual foi o maior número digitado.

Números divisíveis por 3 — Resposta (forma escrita)

Primeiro, o programa pede ao usuário que digite um número inteiro N.
Em seguida, é criado um contador iniciando em 1.

O programa então repete um processo enquanto o contador for menor ou igual a N.
Em cada repetição, o valor atual do contador é analisado para verificar se ele é divisível por 3.

Se o resto da divisão do número por 3 for igual a zero, esse número é exibido na tela, pois ele é divisível por 3.
Após a verificação, o contador é incrementado em uma unidade.

Esse processo continua até que o contador ultrapasse o valor de N.
Ao final da repetição, todos os números divisíveis por 3 no intervalo de 1 até N terão sido mostrados.
*/
