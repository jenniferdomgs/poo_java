import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        if (leitor.hasNextInt()) {
            int t = leitor.nextInt();

            for (int teste = 0; teste < t; teste++) {
                int n = leitor.nextInt();

                // instancia do objeto
                InsRoboclass robo = new InsRoboclass(n);

                for (int i = 0; i < n; i++) {
                    String comando = leitor.next();

                    if (comando.equals("LEFT")) {
                        robo.moverEsquerda();
                    } else if (comando.equals("RIGHT")) {
                        robo.moverDireita();
                    } else if (comando.equals("SAME")) {
                        leitor.next();
                        int indice = leitor.nextInt(); // número do passo
                        robo.repetirPasso(indice);
                    }
                }

                System.out.println(robo.getPosicaoFinal());
            }
        }

        leitor.close();
    }
}

public class InsRoboclass {
    private int posicao;
    private int[] historicoMovimentos;
    private int passoAtual;

    // inicializa o robô
    public InsRoboclass(int quantidadeComandos) {
        this.posicao = 0;
        this.passoAtual = 0;
        this.historicoMovimentos = new int[quantidadeComandos];
    }

    // -1: mover para esquerda
    public void moverEsquerda() {
        this.historicoMovimentos[this.passoAtual] = -1;
        this.posicao += -1;
        this.passoAtual++;
    }

    // +1: mover para direita
    public void moverDireita() {
        this.historicoMovimentos[this.passoAtual] = 1;
        this.posicao += 1;
        this.passoAtual++;
    }

    // repetir um movimento passado
    public void repetirPasso(int indiceAntigo) {
        int movimentoRepetido = this.historicoMovimentos[indiceAntigo - 1];

        this.historicoMovimentos[this.passoAtual] = movimentoRepetido;
        this.posicao += movimentoRepetido;
        this.passoAtual++;
    }

    // método p acessar a posição final
    public int getPosicaoFinal() {
        return this.posicao;
    }
}