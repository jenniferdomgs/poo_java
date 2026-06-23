public class Retangulosc extends Forma3 {
    private double largura;
    private double altura;


    public Retangulosc(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return altura * largura;
    }

    @Override
    public double perimetro() {
        return 2 * (altura + largura);
    }
}
