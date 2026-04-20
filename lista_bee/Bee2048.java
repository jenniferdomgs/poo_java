import java.util.Scanner;

public class Bee2048 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        while (N-- > 0) {
            int[][] board = new int[4][4];
            boolean tem2048 = false;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    board[i][j] = leitor.nextInt();
                    // se tem 2048, acabou
                    if (board[i][j] == 2048) {
                        tem2048 = true;
                    }
                }
            }

            // se já alcançou 2048, encerra a verificação para o caso
            if (tem2048) {
                System.out.println("NONE");
                continue;
            }

            boolean down = false, left = false, right = false, up = false;

            // verifica possíveis movimentos para cada peça não nula
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (board[i][j] > 0) {

                        // DOWN -> não tá na última linha e a peça abaixo é 0 ou igual
                        if (i < 3 && (board[i+1][j] == 0 || board[i+1][j] == board[i][j])) down = true;

                        // LEFT -> não tá na primeira esquerda é 0 ou igual
                        if (j > 0 && (board[i][j-1] == 0 || board[i][j-1] == board[i][j])) left = true;

                        // RIGHT -> não tá na última coluna e a peça a direita é 0 ou igual
                        if (j < 3 && (board[i][j+1] == 0 || board[i][j+1] == board[i][j])) right = true;

                        // UP -> não tá na primeira linha e a peça acima é 0 ou igual
                        if (i > 0 && (board[i-1][j] == 0 || board[i-1][j] == board[i][j])) up = true;
                    }
                }
            }

            if (!down && !left && !right && !up) {
                System.out.println("NONE");
            } else {
                StringBuilder sb = new StringBuilder();
                if (down) sb.append("DOWN ");
                if (left) sb.append("LEFT ");
                if (right) sb.append("RIGHT ");
                if (up) sb.append("UP ");

                // remove espeaço extra no final
                System.out.println(sb.toString().trim());
            }
        }

        leitor.close();
    }
}