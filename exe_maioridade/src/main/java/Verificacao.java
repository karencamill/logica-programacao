import java.util.Scanner;

public class Verificacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }

        sc.close();

    }
}


/*Verificação de maioridade — Resposta

Ler a idade.
Se a idade for maior ou igual a 18, exibir “maior de idade”.
Caso contrário, exibir “menor de idade”.
*/
