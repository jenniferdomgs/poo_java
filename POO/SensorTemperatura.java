public class SensorTemperatura {
    private double temperaturaAtual;
    private double menorTemperatura;
    private double maiorTemperatura;
    private int qtddeMedidas;

    public SensorTemperatura(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        this.qtddeMedidas += 1;
    }

    public void registrar(double temperatura) {
        this.temperaturaAtual = temperatura;
        if(this.temperaturaAtual < this.menorTemperatura) {
            this.menorTemperatura = temperaturaAtual;
        } else if(this.temperaturaAtual > this.maiorTemperatura) {
            this.maiorTemperatura = this.temperaturaAtual;
        }
    }

    public double getTemperaturaAtual() {
        return this.temperaturaAtual;
    }

    public double getMenorTemperatura() {
        return this.menorTemperatura;
    }

    public double getMaiorTemperatura() {
        return this.maiorTemperatura;
    }

    public double getMedia() {
        return (this.maiorTemperatura + this.menorTemperatura) / 2; // não vi sentido em colocar a temperatura atual então coloquei só a menor e a maior
    }

    public int getQtddeMedidas() {
        return this.qtddeMedidas;
    }
}

// algo está errado na menor, não está sendo calculada

class Teste {
    public static void main(String[] args) {
        SensorTemperatura novoSensor = new SensorTemperatura(37);
        novoSensor.registrar(34);
        novoSensor.registrar(23);
        novoSensor.registrar(37);
        novoSensor.registrar(17);
        novoSensor.registrar(45);
        System.out.println(novoSensor.getMedia());
        System.out.println(novoSensor.getMaiorTemperatura());
        System.out.println(novoSensor.getMenorTemperatura());
        System.out.println(novoSensor.getQtddeMedidas());
    }
}