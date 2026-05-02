/*
Leia dois números inteiros e um caractere representando uma operação (+,-,*,/). Calcule e imprima o resultado.

[EXEMPLO 1]
- Entrada: 10 2 *
- Saída: 20

[EXEMPLO 2]
- Entrada: 10 0 /
- Saída: Erro: Divisão por zero
*/

import java.util.Scanner;

public class operacao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt(), num2 = leitor.nextInt();
        char caractere = leitor.next().charAt(0);
        int operacao = 0;

        if(caractere == '*'){
            operacao = num1 * num2;
            System.out.println(operacao);
        } else if(caractere == '+') {
            operacao = num1 + num2;
            System.out.println(operacao);
        } else if(caractere == '-') {
            operacao = num1 - num2;
            System.out.println(operacao);
        } else {
            if(caractere == '/' && num2 != 0){
                operacao = num1 / num2;
                System.out.println(operacao);
            } else {
                System.out.println("Erro! Divisão por zero.");
            }
        }
    }
}