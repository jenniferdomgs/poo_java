public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double area();

    public void mostrarNome() {
        System.out.println("Forma: " + nome);
    }
}
