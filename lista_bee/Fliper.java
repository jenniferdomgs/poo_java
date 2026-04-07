import java.util.Scanner;

public class Fliper {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int p = leitor.nextInt();
        int r = leitor.nextInt();

        if(p == 0) {
            System.out.println("C");
        } else {
            if(r == 0) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }

        leitor.close();
    }
}