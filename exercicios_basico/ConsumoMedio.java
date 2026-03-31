import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int X = leitor.nextInt();
        double Y = leitor.nextDouble();

        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l%n", consumoMedio);
    }
}