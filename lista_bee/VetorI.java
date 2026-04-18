import java.util.Scanner;

public class VetorI {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++) {
            numeros[i] = leitor.nextInt();

            if(numeros[i] <= 0) {
                numeros[i] = 1;
            }
            System.out.println("X[" + i + "] = " + numeros[i]);
        }
        leitor.close();
    }
}