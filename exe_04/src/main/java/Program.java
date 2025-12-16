import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;

        System.out.print("Digite um número: ");
        double n = sc.nextDouble();

        while (n != 0) {
            soma += n;
            quantidade++;
            System.out.print("Digite outro número: ");
            n = sc.nextDouble();
        }

        double media = soma / quantidade;

        System.out.printf("A média é: %.2f" , media);

        sc.close();

    }
}


/* 4 - Média de vários números
Peça ao usuário vários números. O programa deve continuar lendo números até que o usuário digite 0.
Ao final, calcule e mostre a média dos números digitados (não considere o zero).

Resposta escrita :
Criar uma variável para guardar a soma dos números.
Criar uma variável para contar quantos números foram digitados.
Pedir um número ao usuário.
Enquanto o número for diferente de zero:
Somar o número à soma total.
Aumentar o contador.
Pedir outro número.
Ao final, dividir a soma pela quantidade para obter a média.
Mostrar a média.*/