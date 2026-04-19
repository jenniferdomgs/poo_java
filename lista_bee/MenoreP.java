import java.util.Scanner;

public class MenoreP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int[] numeros = new int[N];

        numeros[0] = leitor.nextInt();
        int menor = numeros[0];
        int P = 0;

        for(int i = 1; i < N; i++) {
            numeros[i] = leitor.nextInt();
            if(numeros[i] < menor) {
                menor = numeros[i];
                P = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + P);

        leitor.close();
    }
}