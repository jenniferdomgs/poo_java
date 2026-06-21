public class Aluno extends Pessoa3 {
    private String matricula;

    public Aluno(String matricula, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Matrícula: " + matricula);
    }
}
