import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(
                    i + " x " + N + " = " + (N * i));
        }
    }
}