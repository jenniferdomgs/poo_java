import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // scanner serve para ler oq o usuário digita

        System.out.print("Digite um número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = leitor.nextInt();

        int resultado = num1 + num2;

        System.out.println("Resultado: " + resultado);

        leitor.close(); // fechando o scanner
    }
}