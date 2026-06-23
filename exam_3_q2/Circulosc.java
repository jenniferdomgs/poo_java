public class Circulosc extends Forma3 {
    private double raio;

    public Circulosc(double raio) {
        this.raio = raio;
    }
    @Override
    public double area() {
        return 3.14159265359 * (raio * raio);
    }

    @Override
    public double perimetro() {
        return 2 * 3.14159265359 * raio;
    }
}
