public class CelsiusToFahrenheit implements Conversor {
    @Override
    public double converter(double valor) {
        return (valor * 1.8) + 32;
    }
}
