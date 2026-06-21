public class PrincipalH {
    public static void main(String[] args) {
       Aluno aluno = new Aluno("123450", "Ana", "12345678", 20);
       aluno.imprimirInfo();

       Quadrado quad = new Quadrado(4, 2);
       System.out.println(quad.calcArea());
    }
}
