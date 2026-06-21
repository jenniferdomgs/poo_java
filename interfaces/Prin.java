import java.util.List;
import java.util.ArrayList;

public class Prin {
    public static void main(String[] args) {
        // Testes interface

        Gato g = new Gato();
        g.fazerSom();
        g.mover();
        Cachorro c = new Cachorro();
        c.fazerSom();
        c.mover();


        List<Imprimivel> listaDeImprimiveis = new ArrayList<>();
        Pessoa p1 = new Pessoa("Ana", 20);
        Pessoa p2 = new Pessoa("João", 25);
        Livro l1 = new Livro("Verity", "Coollen Hoover");
        Livro l2 = new Livro("O acordo", "Elle Kenedy");

        listaDeImprimiveis.add(p1);
        listaDeImprimiveis.add(p2);
        listaDeImprimiveis.add(l1);
        listaDeImprimiveis.add(l2);

        for (Imprimivel i: listaDeImprimiveis) {
            i.imprimir();
        }

        Conversor converteTemp = new CelsiusToFahrenheit();
        Conversor converteDist = new KmToMilhas();

        double tempC = 30.0;
        double distKm = 150.0;

        System.out.println(tempC + " graus Celsius equivale a " + converteTemp.converter(tempC));
        System.out.println(distKm + " km equivale a " + converteDist.converter(distKm));

    }
}
