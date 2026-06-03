public class Tarefa {
    private String descricao;
    private double prioridade;

    public Tarefa(String descricao, double prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrioridade() {
        return prioridade;
    }
    
    public void setPrioridade(double prioridade) {
        this.prioridade = prioridade;
    }
}


