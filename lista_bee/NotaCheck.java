import java.util.Scanner;

public class NotaCheck {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1 = leitor.nextDouble();


        while(nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = leitor.nextDouble();
        }
        double nota2 = leitor.nextDouble();

        while(nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = leitor.nextDouble();
        }

        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f%n", media);
    }
}