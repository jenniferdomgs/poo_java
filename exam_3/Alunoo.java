public class Alunoo extends Pessoaa {
    private String matricula;
    private String curso;

    public Alunoo(String nome, String cpf, String matricula, String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String exibirDados() {
        return "Nome: " + this.nome + " | CPF: " + this.cpf + " | Matrícula: " + this.matricula + " | Curso: " + this.curso;
    }
}
