import java.util.Scanner;

public class Dama {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            int X1 = leitor.nextInt();
            int Y1 = leitor.nextInt();
            int X2 = leitor.nextInt();
            int Y2 = leitor.nextInt();

            if(X1 == 0 && X2 == 0 && Y1 == 0 && Y2 == 0) {
                break;
            }

            if(X1 == X2 && Y1 == Y2) {
                System.out.println("0");
            } else if (X1 == X2 || Y1 == Y2 || Math.abs(X1 - X2) == Math.abs(Y1 - Y2)) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
        leitor.close();
    }
}