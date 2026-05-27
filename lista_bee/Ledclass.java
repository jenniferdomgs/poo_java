import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        if (leitor.hasNextInt()) {
            int testes = leitor.nextInt();

            // instancia o objeto
            Ledclass calculadora = new Ledclass();

            for (int i = 0; i < testes; i++) {
                String valor = leitor.next();

                int totalLeds = calculadora.calcularLeds(valor);

                System.out.println(totalLeds + " leds");
            }
        }

        leitor.close();
    }
}

public class Ledclass {
    private final int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    public int calcularLeds(String valor) {
        int contLeds = 0;

        for (int j = 0; j < valor.length(); j++) {
            // pega o caractere e converte para int
            int digito = valor.charAt(j) - '0';

            // soma dos leds
            contLeds += ledsPorDigito[digito];
        }

        return contLeds;
    }
}