import java.util.Scanner;

public class VetorII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int num = leitor.nextInt();
        numeros[0] = num;

        System.out.println("N[0] = " + numeros[0]);

        for(int i = 1; i < 10; i++) {
            numeros[i] = numeros[i - 1] * 2;

            System.out.println("N[" + i + "] = " + numeros[i]);
        }
    }
}