public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
        this.raio = 1.0;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double calcularArea() {
        return 3.14159 * (raio * raio);
    }

    public double calcularCircunferencia() {
        return 3.14159 * (raio * 2);
    }

}


