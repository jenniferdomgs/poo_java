public class Revista extends ItemBiblioteca implements Emprestavel {
    public Revista(String titulo, int codigo) {
        super(titulo, codigo);
    }

    @Override
    public int diasEmprestimo() {
        return 7;
    }

    @Override
    public String exibirDados() {
        return "Título: " + this.getTitulo() + " | Código: " + this.getCodigo() + " | Dias de empréstimo: " + this.diasEmprestimo();
    }
}
