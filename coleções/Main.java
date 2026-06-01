import java.util.List;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Musica caju = new Musica("Caju", "Lineker", 180);
        playlist.inserir(caju);
        playlist.inserir("Young and Beautiful", "Lana Del Rey", 235);
        playlist.inserir("Halo", "Beyoncé", 260);

        System.out.println("Playlist:");
        List<Musica> listaDeMusicas = playlist.getMusicas();

        for (int i = 0; i < listaDeMusicas.size(); i++) {
            Musica m = listaDeMusicas.get(i);
            System.out.println((i + 1) + ". " + m.getTitulo() + " - " + m.getArtista() + " (" + m.getDuracao() + "s)");
        }

        System.out.println("\nDuração total: " + playlist.duracaoTotal() + " segundos\n");

        Musica maisLonga = playlist.musicaMaisLonga();
        System.out.println("Música mais longa:");
        System.out.println(maisLonga.getTitulo() + " - " + maisLonga.getArtista() + " (" + maisLonga.getDuracao() + "s)");
    }
}