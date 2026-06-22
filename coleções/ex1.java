import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex1 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 1000000; i++) {
            long inicio = System.nanoTime();
            arrayList.add(i);
            linkedList.add(i);
            long fim = System.nanoTime();
            System.out.println((fim - inicio) / 1000000.0);
        }
    }
}