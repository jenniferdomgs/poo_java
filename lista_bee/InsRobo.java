import java.util.Scanner;

public class InsRobo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();

        for(int teste = 0; teste < T; teste++) {
            int N = leitor.nextInt();
            int[] movimentos = new int[N];
            int posicao = 0;

            for(int i = 0; i < N; i++) {
                String comando = leitor.next();
                if(comando.equals("LEFT")) {
                    movimentos[i] = -1;
                } else if(comando.equals("RIGHT")) {
                    movimentos[i] = 1;
            } else if(comando.equals("SAME")) {
                    leitor.next();

                    int indice = leitor.nextInt() - 1;
                    movimentos[i] = movimentos[indice];
                }
                posicao += movimentos[i];
            }
            System.out.println(posicao);
        }
        leitor.close();
    }
}