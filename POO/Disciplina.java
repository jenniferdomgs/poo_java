public class Disciplina {
    private String nome;
    private double nota1;
    private double nota2;
    private double notaFinal;

    public Disciplina(String nome, double nota1, double nota2, double notaFinal) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaFinal = notaFinal;
    }


    public double mediaParcial(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

}
