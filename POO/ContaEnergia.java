public class ContaEnergia {
    private String titular;
    private double consumoKwh;
    private double tarifaKwh;
    private boolean tarifaSocial;

    public ContaEnergia(String titular, double consumoKwh, double tarifaKwh) {
        this.titular = titular;
        this.consumoKwh = 0;
        this.tarifaKwh = 0.50;
    }

    public ContaEnergia(String titular, double consumoKwh, double tarifaKwh, boolean tarifaSocial) {
        this.titular = titular;
        this.consumoKwh = 0;
        this.tarifaKwh = 0.50;
        this.tarifaSocial = tarifaSocial;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getConsumoKwh(){
        return this.consumoKwh;
    }

    public void setConsumoKwh(double consumoKwh){
        if(consumoKwh > 0){
            this.consumoKwh = consumoKwh;
        } else {
            this.consumoKwh = 0;
        }
    }

    public double getTarifaKwh() {
        return this.tarifaKwh;
    }

    public void setTarifaKwh(double tarifaKwh){
        if(tarifaKwh > 0) {
            this.tarifaKwh = tarifaKwh;
        } else {
            this.tarifaKwh = 0.50;
        }
    }


    public boolean getTarifaSocial() {
        return this.tarifaSocial;
    }

    public void setTarifaSocial(boolean tarifaSocial) {
        this.tarifaSocial = tarifaSocial;
    }

    public double calcularValor() {
        double valor = this.consumoKwh * this.tarifaKwh;
        if(this.tarifaSocial) {
            valor = valor - ((25 * valor) / 100);
        }
        return valor;
    }

    public void adicionarConsumo(double valor) {
        this.consumoKwh += valor;
    }

   public String resumo() {
        return("Titular: " + this.titular + " | " + "Consumo: " + this.consumoKwh + " | " + "Valor: R$ " + calcularValor());
   }
}

// fiz algo errado que fez com que as saidas ficassem 0.0 para consumo e valor e não consegui identificar o erro :/
class Principal {
    public static void main(String[] args) {
        ContaEnergia teste = new ContaEnergia("Jennifer", 8456.56, 3.5, true);
        System.out.println(teste.resumo());
    }
}