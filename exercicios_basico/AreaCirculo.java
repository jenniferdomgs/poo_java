import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // padrão de ponto
        Scanner leitor = new Scanner(System.in);

        double pi = 3.14159;

        double raio = leitor.nextDouble();

        double area = pi * (raio * raio);

        System.out.printf("A=%.4f%n", area); // numero decimal com 4 casas

        leitor.close();
    }
}