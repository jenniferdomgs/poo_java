/*
Leia vários pares de números inteiros (X e Y). Para cada par, calcule a soma de todos os números pares entre eles
(Inclusive, se forem pares).
O programa deve parar quando X for igual a Y.
*/

import java.util.Scanner;

public class somaPares {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        while(true){
            int x = leitor.nextInt(), y = leitor.nextInt();
            if(x == y){
                break;
            } else {
                int soma = 0;
                for(int i = x; i <= y; i++){
                    if(i % 2 == 0){
                        soma += i;
                    }
                }
                System.out.println(soma);
            }
        }
        leitor.close();
    }
}