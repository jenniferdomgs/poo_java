import java.util.Scanner;
import java.util.Locale;

public class SalarioBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // padrão de ponto
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = leitor.next();

        System.out.print("Salário: ");
        float salario = leitor.nextFloat();

        System.out.print("Vendas do mês: ");
        float vendasMes = leitor.nextFloat();

        double comissao = (15 * vendasMes) / 100;

        double total = comissao + salario;

        System.out.printf("TOTAL: R$ %.2f%n", total);

    }
}