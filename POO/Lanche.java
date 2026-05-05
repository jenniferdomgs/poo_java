import java.util.Locale;
import java.util.Scanner;

class Lanche {
    private int codigo;
    private int qtdde;

    public Lanche(int codigo, int qtdde) {
        this.codigo = codigo;
        this.qtdde = qtdde;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setQtdde(int qtdde){
        this.qtdde = qtdde;
    }

    public int getQtdde() {
        return this.qtdde;
    }

    public double calcularTotal() {
        switch (codigo) {
            case 1:
                return 4.00 * qtdde;
            case 2:
                return 4.50 * qtdde;
            case 3:
                return 5.00 * qtdde;
            case 4:
                return 2.00 * qtdde;
            case 5:
                return 1.50 * qtdde;
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("Total: R$ %.2f", calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
