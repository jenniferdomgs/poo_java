import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int senha = leitor.nextInt();

        int senhaFixa = 2002;

        while(senha != senhaFixa) {
            System.out.println("Senha Invalida");
            senha = leitor.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}