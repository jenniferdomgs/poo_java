public class somaPares_Impares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int somaPar = 0;
        int somaImpar = 0;

        for(int num : numeros) {
            if(num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }
        }

        System.out.println("Soma pares: " + somaPar);
        System.out.println("Soma impares: " + somaImpar);
    }

}