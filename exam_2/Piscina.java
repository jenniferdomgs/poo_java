public class Piscina {
    private int capMax;
    private double pesoMin;
    private double pesoMax;

    private int[] pesos;
    private int quantidade;
    private int somaPesos;

    public Piscina(int capMax, double pesoMin, double pesoMax) {
        this.capMax = capMax;
        this.pesoMax = pesoMax;
        this.pesoMin = pesoMin;

        this.pesos = new int[capMax];
        this.quantidade = 0;
        this.somaPesos = 0;
    }

    public boolean entrar(int peso) {
        if (isCheia()) {
            return false;
        }

        if (peso >= pesoMin && peso <= pesoMax) {
            pesos[quantidade] = peso;
            quantidade++;
            somaPesos += peso;
            return true;
        }

        return false;
    }

    public void sair() {
        if (quantidade > 0) {
            quantidade--;

            somaPesos -= pesos[quantidade];

            pesos[quantidade] = 0;
        }
    }

    public boolean isCheia() {
        return quantidade >= capMax;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int pesoTotal() {
        return somaPesos;
    }
}