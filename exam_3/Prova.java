import java.util.ArrayList;
import java.util.List;

public class Prova {
    public static void main(String[] args) {
        List<Pessoaa> listPessoas = new ArrayList<>();
        Alunoo a1 = new Alunoo("Ana", "123456", "78910", "TADS");
        Alunoo a2 = new Alunoo("João", "1234567", "78911", "TADS");
        Professor p1 = new Professor("Lucena", "56841", "648910", "TI");
        Professor p2 = new Professor("Jorgiano", "0279633", "845697", "TI");
        listPessoas.add(a1);
        listPessoas.add(a2);
        listPessoas.add(p1);
        listPessoas.add(p2);

        for(Pessoaa p: listPessoas) {
            System.out.println(p.exibirDados());
        }

    }
}
