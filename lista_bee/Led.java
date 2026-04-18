import java.util.Scanner;

public class Led {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int testes = leitor.nextInt();

        // o indice do elemento é a quantidade leds (0=6 leds... 6=9 leds)
        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < testes; i++) {
            String valor = leitor.next();
            int contLeds = 0; // zera o cont para cada teste

            // percorrendo a string lida
            for (int j = 0; j < valor.length(); j++) {
                // pega o caractere
                char charAtual = valor.charAt(j);

                // e converte para int
                int digito = charAtual - '0';

                contLeds += ledsPorDigito[digito];
            }

            System.out.println(contLeds + " leds");
        }

        leitor.close();
    }
}