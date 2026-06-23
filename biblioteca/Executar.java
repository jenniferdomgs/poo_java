import java.util.ArrayList;
import java.util.List;

public class Executar {
    public static void main(String[] args) {
        List<Emprestavel> emprestimos = new ArrayList<>();
        Livroo l1 = new Livroo("Verity", 123);
        Livroo l2 = new Livroo("O acordo", 564);
        Revista r1 = new Revista("Pop", 456);
        Revista r2 = new Revista("Kiss", 521);
        emprestimos.add(l1);
        emprestimos.add(l2);
        emprestimos.add(r1);
        emprestimos.add(r2);

        for(Emprestavel e: emprestimos) {
            System.out.println(e.exibirDados());
            System.out.println(e.diasEmprestimo());
        }

        List<Livro> livros = new ArrayList<>();

        Autor novoAutor = new Autor("Coleen Hoover", "inglesa");
        Autor novoAutor2 = new Autor("Elle Kenedy", "francesa");

    }
}
