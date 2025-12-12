import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número positivo: ");
        int num = sc.nextInt();
        
        /* int i = num; Cria a variável i e começa ela valendo o número digitado pelo usuário.
        Se o usuário digitou 7, então i começa como 7.*/

        /* i >= 0; Enquanto i for maior ou igual a 0, o loop continua.
        Quando i chegar a -1, a condição será falsa e o loop para.*/ 

        /* i--; A cada repetição, diminui 1 de i. É o que faz a contagem regressiva acontecer.*/

        for (int i = num; i >= 0; i-- ){
            System.out.println(i);
        }

        sc.close();
    }
}

