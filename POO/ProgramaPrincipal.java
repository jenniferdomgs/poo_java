// TESTES com classes

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // criar uma pessoa -> instanciar (nova)
        // tipo(classe) var = new classe()

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Jennifer");
        pessoa1.setIdade(20);
        pessoa1.setAltura(1.67);
        pessoa1.setPeso(60.0);

        System.out.println("Nome: " + pessoa1.getNome() + " | Idade: " + pessoa1.getIdade() + " | Peso: " + pessoa1.getPeso() + " | Altura: " + pessoa1.getAltura());

        Pessoa pessoa2 = new Pessoa("Karoline", 20, 60.0, 1.67);

        System.out.println(pessoa2.getNome());

        System.out.println("IMC de " + pessoa1.getNome() + ": " + pessoa1.calcularImc());
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());



        Circulo novoCirculo = new Circulo();

        novoCirculo.setRaio(78);

        System.out.println("Raio: " + novoCirculo.getRaio() + " Area: " + novoCirculo.calcularArea() + " Circunferência: " + novoCirculo.calcularCircunferencia());


        Disciplina novaDisciplina = new Disciplina("POO", 58, 40);
        System.out.println(novaDisciplina.calcularMediaParcial());
        System.out.println(novaDisciplina.calcularMediaFinal());
        System.out.println(novaDisciplina.Aprovado());
        novaDisciplina.setNotaProvaFinal(100);


        Lanche novoLanche = new Lanche(1, 2);
        System.out.println(novoLanche.calcularTotal());
        System.out.println(novoLanche.toString());
    }

}