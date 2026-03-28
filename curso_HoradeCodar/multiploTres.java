public class multiploTres {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int num : numeros) {
            if(num % 3 == 0) {
                System.out.println("O número: " + num + " é múltiplo de 3");
            } else {
                System.out.println("O número: " + num + " não é múltiplo de 3");
            }
        }
    }
}