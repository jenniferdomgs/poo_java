import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int y = leitor.nextInt();

        int produto = x * y;

        System.out.println("PROD: " + produto);

        leitor.close();
    }
}