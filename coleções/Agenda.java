import java.util.ArrayList;

public class Agenda {
    private ArrayList<Tarefa> tarefas;

    // Exibir todas as tarefas
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    // Adicionar tarefas
    public void inserir(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    // Remover uma tarefa pela descrição
    public void remover(String descricao) { // meçhorar para fazer retornar true (se removeu) ou false (se não removeu)
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
       
    }

    // Exibir a tarefa de maior prioridade
    public Tarefa maiorPrioridade() {
        Tarefa tarefaMaiorP = tarefas.get(0);
        for(Tarefa tarefa: tarefas) {
            if(tarefa.getPrioridade() > tarefaMaiorP.getPrioridade()) {
                tarefaMaiorP = tarefa;
            }
        }
        return tarefaMaiorP;
    }

    // Contar quantas tarefas existem na agenda
    public int qtddeTarefas() {
        int qtddeTarefas = 0;
        for(int i = 0; i < tarefas.size(); i++) {
            qtddeTarefas += 1;
        }
        return qtddeTarefas;
    }
}

