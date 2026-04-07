public class Pares {
    public static void main(String[] args) {
        int cont = 0;
        while(cont <= 100) {
            cont += 1;
            if(cont % 2 == 0) {
                System.out.println(cont);
            }
        }
    }
}