public class Lampada {
    private boolean acesa;
    private int potencia;

    public Lampada(int potencia) {
        this.potencia = potencia;
    }
    public Lampada(boolean acesa, int potencia) {
        this.acesa = acesa;
        this.potencia = potencia;
    }

    public void acender() {
        this.acesa = true;
    }

    public void apagar() {
        this.acesa = false;
    }

    public boolean estaAcesa() {
        return this.acesa;
    }

    public int getPotencia(int potencia) {
        return this.potencia;
    }
}

