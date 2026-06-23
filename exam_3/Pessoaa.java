public class Pessoaa {
    protected String nome;
    protected String cpf;

    public Pessoaa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String exibirDados() {
        return "Nome: " + this.nome + " CPF: " + this.cpf;
    }
}
