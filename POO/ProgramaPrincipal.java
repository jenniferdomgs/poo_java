// TESTES com as classes da pasta POO

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // PESSOA
        Pessoa3 pessoa1 = new Pessoa3();

        pessoa1.setNome("Jennifer");
        pessoa1.setIdade(20);
        pessoa1.setAltura(1.67);
        pessoa1.setPeso(60.0);

        System.out.println("Nome: " + pessoa1.getNome() + " | Idade: " + pessoa1.getIdade() + " | Peso: " + pessoa1.getPeso() + " | Altura: " + pessoa1.getAltura());

        Pessoa3 pessoa2 = new Pessoa3("Karoline", 20, 60.0, 1.67);

        System.out.println(pessoa2.getNome());

        System.out.println("IMC de " + pessoa1.getNome() + ": " + pessoa1.calcularImc());
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());


        // CIRCULO
        Circulo novoCirculo = new Circulo();

        novoCirculo.setRaio(78);

        System.out.println("Raio: " + novoCirculo.getRaio() + " Area: " + novoCirculo.calcularArea() + " Circunferência: " + novoCirculo.calcularCircunferencia());


        // DISCIPLINA
        Disciplina novaDisciplina = new Disciplina("POO", 58, 40);
        System.out.println(novaDisciplina.calcularMediaParcial());
        System.out.println(novaDisciplina.calcularMediaFinal());
        System.out.println(novaDisciplina.Aprovado());
        novaDisciplina.setNotaProvaFinal(100);


        // LANCHE
        Lanche novoLanche = new Lanche(1, 2);
        System.out.println(novoLanche.toString());
    }

}