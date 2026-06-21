public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double calcArea() {
        return base * altura;
    }

    public double calcDiagonal() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
