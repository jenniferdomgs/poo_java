public class Professor extends Pessoaa {
    private String siape;
    private String areaAtuacao;

    public Professor(String nome, String cpf, String siape, String areaAtuacao) {
        super(nome, cpf);
        this.siape = siape;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String exibirDados() {
        return "Nome: " + this.nome + " | CPF: " + this.cpf + " | Siape: " + this.siape + " | Area de atuação: " + this.areaAtuacao;
    }
}
