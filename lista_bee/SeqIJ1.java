public class SeqIJ1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        while(j >= 0) {
            System.out.println("I=" + i + " " + "J=" + j);
            j -= 5;
            i += 3;
        }
    }
}