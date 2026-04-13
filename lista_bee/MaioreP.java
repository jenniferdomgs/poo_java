import java.util.Scanner;

public class MaioreP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0;
        int index = 0;

        for(int i = 1; i <= 100; i++) {
            int N = leitor.nextInt();
            if(N > maior) {
                maior = N;
                index = i;
            }
        }

        System.out.println(maior);
        System.out.println(index);
    }
}