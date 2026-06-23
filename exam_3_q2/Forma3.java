public abstract class Forma3 {
    public abstract double area();

    public abstract double perimetro();

    @Override
    public String toString() {
        return "[area=" + area() + ", perimetro=" + perimetro() + "]";
    }
}
