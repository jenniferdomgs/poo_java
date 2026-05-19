import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            int[] numeros = new int[n];

            for (int i = 0; i < n; i++) {
                numeros[i] = leitor.nextInt();
            }

            // instancia o obejto
            MenorePclass buscador = new MenorePclass();

            buscador.encontrarMenor(numeros);

            System.out.println("Menor valor: " + buscador.getMenorValor());
            System.out.println("Posicao: " + buscador.getPosicao());
        }

        leitor.close();
    }
}

public class MenorePclass {
    private int menorValor;
    private int posicao;

    // método que recebe array e faz a busca
    public void encontrarMenor(int[] numeros) {
        // inicia com o primeiro elemento
        this.menorValor = numeros[0];
        this.posicao = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < this.menorValor) {
                this.menorValor = numeros[i];
                this.posicao = i;
            }
        }
    }

    // método p/ ler o menor valor
    public int getMenorValor() {
        return this.menorValor;
    }

    // método p/ ler a posição
    public int getPosicao() {
        return this.posicao;
    }
}