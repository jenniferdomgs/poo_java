public class Livroo extends ItemBiblioteca implements Emprestavel {
    public Livroo(String titulo, int codigo) {
        super(titulo, codigo);
    }

    @Override
    public int diasEmprestimo() {
        return 14;
    }

    @Override
    public String exibirDados() {
        return "Título: " + this.getTitulo() + " | Código: " + this.getCodigo() + " | Autor: ";
    }
}
