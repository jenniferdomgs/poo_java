public class Disciplina {
    private String nome;
    private int nota1;
    private int nota2;
    private int notaProvaFinal;

    // Função construtora
    public Disciplina(String nome, int nota1, int nota2, int notaProvaFinal) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaProvaFinal = notaProvaFinal;
    }

    public Disciplina(String nome, int nota1, int nota2) {
        this(nome, nota1, nota2, 0);
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota1(){
        return this.nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota2(){
        return this.nota2;
    }

    public void setNotaProvaFinal(int notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }

    public int getNotaProvaFinal(){
        return this.notaProvaFinal;
    }

    public int calcularMediaParcial() {
        return (((nota1 * 2) + (nota2 * 3)) / 5);
    }

    public int calcularMediaFinal(){
        if(calcularMediaParcial() >= 60){
            return calcularMediaParcial();
        } else{
            return (calcularMediaParcial() + notaProvaFinal) / 2;
        }
    }

    public String Aprovado(){
        if(calcularMediaParcial() >= 60){
            return "Parabéns! Você foi aprovado na disciplina de " + nome;
        } else {
            return "Reprovado! Você precisará fazer a prova final.";
        }
    }
}
