public class Acumulador {
    int contador;

    public Acumulador(int contador) {
        this.contador = contador;
    }

    public int getValor() {
        return this.contador;
    }

    public void inserir(int valor) {
        this.contador += valor;
    }

    public void retirar(int valor) {
        this.contador -= valor;
    }
}

class Principal {
    public static void println(Object o){
        System.out.println(o);
    }

    public static void main(String[] args){
        Acumulador acumulador = new Acumulador(10);
        println(acumulador.getValor());   // 10
        acumulador.inserir(2);
        acumulador.retirar(1);
        println(acumulador.getValor());  // 11
    }
}



