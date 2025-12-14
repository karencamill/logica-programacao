import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        if (media >= 7.0){
            System.out.println("A sua média é: " + media + " Aprovado, PARABÉNS!!!");
        }
        else {
            System.out.println("A sua média é: " + media + " Reprovado.");
        }

        sc.close();

    }
}
