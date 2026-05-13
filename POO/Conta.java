public class Conta {
    private String numero;
    private String titular;
    private double saldo; // saldo deve ser positivo

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor, Conta destino) {

    }
}
