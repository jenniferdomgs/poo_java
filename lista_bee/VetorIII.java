import java.util.Scanner;

public class VetorIII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int T = leitor.nextInt();
        int[] N = new int[1000];
        int valor = 0;

        for(int i = 0; i < 1000; i++) {
            N[i] = valor;
            System.out.println("N[" + i + "] = " + N[i]);
            valor++;

            if(valor == T) {
                valor = 0;
            }
        }
        leitor.close();
    }
}