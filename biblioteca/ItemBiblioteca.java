public abstract class ItemBiblioteca {
    private String titulo;
    private int codigo;

    public ItemBiblioteca(String titulo, int codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
}
