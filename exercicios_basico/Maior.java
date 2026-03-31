import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();

        int b = leitor.nextInt();

        int c = leitor.nextInt();

        int maior = (a + b + Math.abs(a - b)) / 2;

        int maior1 = (maior + c + Math.abs(maior - c)) / 2;

        System.out.println(maior1 + " eh o maior");

    }
}