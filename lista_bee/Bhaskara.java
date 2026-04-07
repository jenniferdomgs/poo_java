import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        double delta = Math.pow(B, 2) - (4 * A * C);

        if(A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        leitor.close();
    }
}