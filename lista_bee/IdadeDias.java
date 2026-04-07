import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idadeD = leitor.nextInt();

        int ano = idadeD / 365;
        int mes = (idadeD % 365) / 30;
        int dias = (idadeD % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}