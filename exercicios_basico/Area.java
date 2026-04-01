import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        double areaTrianguloRet = (A * C) / 2;
        double areaCirculo = (C * C) * 3.14159;
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRet);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}