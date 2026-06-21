public class Pessoa3 {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa3(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void imprimirInfo() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade + " anos");
    }
}
