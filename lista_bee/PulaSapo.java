import java.util.Scanner;

public class PulaSapo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int puloMax = leitor.nextInt(); // altura máxima do pulo
        int contCanos = leitor.nextInt(); // quantidade de canos

        int[] canos = new int[contCanos];

        for (int i = 0; i < contCanos; i++) {
            canos[i] = leitor.nextInt();
        }

        boolean venceu = true;

        // compara o cano atual com o próximo
        for (int i = 0; i < contCanos - 1; i++) {
            int difer = Math.abs(canos[i] - canos[i + 1]);

            if (difer > puloMax) {
                venceu = false;
                break; // se a diferença for maior que o pulo ele perde
            }
        }

        if (venceu) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }

        leitor.close();
    }
}