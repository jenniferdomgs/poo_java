public class ExemplosControle {
    public static void main(String[] args) {
        int idade = 18;
        // if -> começa condição
        // () -> contem condição a ser validada
        // {} -> corpo da condição
        // else -> corpo da condição adversa
        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade!");
        }

        double nota = 6.3;

        if(nota > 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        // else if é intermediário do if e else
        int hora = 14;

        if(hora < 12) {
            System.out.println("Bom dia!");
        } else if(hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        // pode-se usar mais de um else if!!

        // igualdade ==
        int a = 1;
        int b = 2;
        System.out.println("a é igual b: " + (a == b));

        // diferença !=
        System.out.println("a é diferente de b: " + (a != b));

        // maior que >    // menor que <    // maior ou igual que =>  // menor ou igual que =<

        // Operadores Lógicos
        // && -> and (True se as 2 forem True)
        // || -> or (True se alguma for True)
        // ! -> NOT (inverte valor)

        boolean temDinheiro = true;
        boolean temTempo = true;

        if(temDinheiro && temTempo) {
            System.out.println("Pode viajar!");
        } else {
            System.out.println("LISO!!!");
        }

        // LOOPS - While e For
        int cont = 1;

        while(cont <= 5) {
            System.out.println(cont);
            cont ++; // soma 1 a cada passagem pelo loop
        }

        for(int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }
    }
}