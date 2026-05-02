/*
Leia 5 números inteiros e informe quantos deles são:
- Positivos
- Negativos
- Zero
*/

import java.util.Scanner;

public class contarNum {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int P = 0;
            int N = 0;
            int Z = 0;
            int num;

            for(int i = 0; i < 5; i++) {
                num = leitor.nextInt();
                if(num == 0){
                    Z += 1;
                } else if(num > 0){
                    P += 1;
                } else {
                    N += 1;
                }
            }

            System.out.println("Positivos: " + P + " Negativos: " + N + " Zeros: " + Z);

    }
}