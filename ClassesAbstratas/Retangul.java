public class Retangul extends Forma {
    private double base;
    private double altura;

    public Retangul(double base, double altura) {
        super("Retângulo");
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
