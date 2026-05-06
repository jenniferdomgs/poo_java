import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int cod = leitor.nextInt();
        int qtdde = leitor.nextInt();

        Lanche novoLanche = new Lanche(cod, qtdde);
        novoLanche.calcularTotal();
        System.out.println(novoLanche.toString());
    }
}