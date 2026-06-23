import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Rodar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Forma3> formas = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            System.out.println("Digite o tipo da forma (C: Circulo | R: Retangulo): ");
            char forma = leitor.next().charAt(0);
            if(forma == 'C' || forma == 'c') {
                System.out.println("Digite o raio: ");
                double raio = leitor.nextDouble();
                formas.add(new Circulosc(raio));
            } else if(forma == 'R' || forma == 'r') {
                System.out.println("Digite a largura: ");
                double largura = leitor.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = leitor.nextDouble();
                formas.add(new Retangulosc(largura, altura));
            } else {
                System.out.println("Erro! Opção inválida.");
                i--;
            }

        }

        double areaT = 0;
        double perimetroT = 0;


        for(Forma3 f: formas) {
            areaT += f.area();
            perimetroT += f.perimetro();
        }

        System.out.printf("Area total = %.2f\n", areaT);
        System.out.printf("Perimetro total = %.2f", perimetroT);
    }
}
