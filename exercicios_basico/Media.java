import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota:");
        double nota3 = leitor.nextDouble();

        // pesos
        int pesoN1 = 2;
        int pesoN2 = 3;
        int pesoN3 = 5;

        double media = ((nota1 * pesoN1) + (nota2 * pesoN2) + (nota3 * pesoN3)) / (pesoN1 + pesoN2 + pesoN3);
        System.out.println("MEDIA: " + media);
    }
}