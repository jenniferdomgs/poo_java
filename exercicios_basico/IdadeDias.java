import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        int idadeDias = idade * 365;

        System.out.printf("%d anos é equivalente a aproximadamente %d dias", idade, idadeDias);
    }
}