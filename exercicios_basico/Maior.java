import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = leitor.nextInt();

        System.out.print("Digite o primeiro número: ");
        int b = leitor.nextInt();

        System.out.print("Digite o primeiro número: ");
        int c = leitor.nextInt();

        int maior = (a + b + Math.abs(a - b)) / 2;

        int maior1 = (maior + c + Math.abs(maior - c)) / 2;

        System.out.printf("%d eh o maior", maior1);

    }
}