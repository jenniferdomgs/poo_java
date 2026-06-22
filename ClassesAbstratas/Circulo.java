public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }


    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
