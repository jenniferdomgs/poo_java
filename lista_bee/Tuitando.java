import java.util.Scanner;

public class Tuitando {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String T = leitor.nextLine();

        if(T.length() > 140) {
            System.out.println("MUTE");
        } else {
            System.out.println("TWEET");
        }

    }
}