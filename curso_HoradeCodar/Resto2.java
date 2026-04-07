import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        int cont = 1;

        while(cont <= 10000) {
            cont += 1;
            if(cont % N == 2) {
                System.out.println(cont);
            }
        }
    }
}