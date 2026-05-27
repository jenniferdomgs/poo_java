public class CofreDigital {
    private String proprietario;
    private double saldo;
    private int quantidadeOp;
    private String historico;

    public CofreDigital(String proprietario, double saldo) {
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getProprietario() {
        return this.proprietario;
    }

   public void setSaldo(double saldo) {
        this.saldo = saldo;
   }

   public double getSaldo() {
        return this.saldo;
   }

   public void depositar(double valor) {
        if(valor != 0 & valor > 0) {
            this.saldo += valor;
            this.quantidadeOp += 1;
       }
   }

   public boolean sacar(double valor) {
        if(this.saldo > valor) {
            this.saldo -= valor;
            this.quantidadeOp += 1;
            return true;
        } else {
            return false;
        }
   }

   public int getQuantidadeOp() {
        return this.quantidadeOp;
   }

}