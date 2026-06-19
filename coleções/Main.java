// arquivo com anotações importantes sobre coleções

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Usuario obj1 = new Usuario("Olival");
        Usuario obj2 = new Usuario("Pedro");
        Usuario obj3 = new Usuario("Ana");
        Usuario obj4 = new Usuario("Thais");

        // coleções : LIST, SET e MAP
        // list : ARRAYLIST e LINKEDLIST
        // metodos: adicionar, remover, trocar posição
        // estrutura: fila
        List<Usuario> listadeUsers = new ArrayList<Usuario>();
        listadeUsers.add(obj1);
        listadeUsers.add(obj2);
        listadeUsers.add(obj3);
        listadeUsers.add(obj4);

        List<Usuario> listaDeObjetos = new LinkedList<>();
        listaDeObjetos.add(obj1);
        listaDeObjetos.add(obj2);
        listaDeObjetos.add(obj3);
        listaDeObjetos.add(obj4);

        // set : HASHSET e TREESET
        Set<Usuario> conjunto = new HashSet<Usuario>();

        // map : HASHMAP e TREEMAP
        Map<Usuario, Integer> mapa = new HashMap<>();

        mapa.put(obj1, 1);
        mapa.put(obj2, 2);
        mapa.put(obj3, 3);
        mapa.put(obj4, 4);


    }
}