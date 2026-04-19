import java.util.Scanner;

public class Evergreen {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        leitor.nextLine();

        for(int i = 0; i < N; i++) {
            String l1 = leitor.nextLine();
            String l2 = leitor.nextLine();
            StringBuilder nome = new StringBuilder();

            for(int j = 0; j < l1.length(); j += 2) {
                nome.append(l1.substring(j, Math.min(j + 2, l1.length())));
                if(j < l2.length()) {
                    nome.append(l2.substring(j, Math.min(j + 2, l2.length())));
                }
            }
            System.out.println(nome.toString());
        }
        leitor.close();
    }
}