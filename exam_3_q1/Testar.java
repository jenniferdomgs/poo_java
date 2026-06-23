import java.util.ArrayList;
import java.util.List;

public class Testar {
    public static void main(String[] args) {
        List<Funcionario> listadeFunc = new ArrayList<Funcionario>();

        Comissionado F1 = new Comissionado("Ana", 1518.0, 1000.0);
        Assalariado F2 = new Assalariado("Carla", 1518.0);
        Comissionado F3 = new Comissionado("Bruno", 3000.0, 100.0);

        listadeFunc.add(F1);
        listadeFunc.add(F2);
        listadeFunc.add(F3);

        for(Funcionario f: listadeFunc) {
            System.out.println(f);
        }


        double maiorSalario = 0.0;
        String funcMaiorSalario = "";
        String tipo = "";
        for(Funcionario salario: listadeFunc) {
            if(salario.calcularSalario() >= maiorSalario) {
                maiorSalario = salario.calcularSalario();
                funcMaiorSalario = salario.getNome();
            }
            if(salario.calcularSalario() > salario.salarioBase) {
                tipo = "Comissionado";
            }
            tipo = "Assalariado";
        }

        System.out.println("Maior salário: " + funcMaiorSalario + " (" + tipo + ")");
    }
}
