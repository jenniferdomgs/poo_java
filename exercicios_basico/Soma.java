import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        int resultado = num1 + num2;

        System.out.println("X = " + resultado);

        leitor.close();
    }
}