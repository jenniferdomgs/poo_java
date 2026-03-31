import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double R1;
        double R2;


        if(A != 0 ) {

            System.out.println("R1 = ");
            System.out.println("R2 = ");
        } else {
            System.out.println("Impossivel calcular");
        }

    }
    // -b +- raiz de b^2 - (4 * ac) / (2a)
}