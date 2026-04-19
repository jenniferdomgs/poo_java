import java.util.Scanner;

public class TrocaVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] N = new int[20];

        for(int i = 0; i < 20; i++) {
            N[i] = leitor.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }

        for(int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        leitor.close();
    }
}