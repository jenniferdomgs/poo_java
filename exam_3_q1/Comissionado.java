public class Comissionado extends Funcionario {
    private double vendas;

    public Comissionado(String nome, double salarioBase, double vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + vendas * 0.10;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
