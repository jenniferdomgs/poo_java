public class Pessoa implements Imprimivel {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " anos");
    }
}
