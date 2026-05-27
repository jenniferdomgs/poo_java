public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Musica caju = new Musica("Caju", "Lineker", 3);
        playlist.inserir(caju);
        playlist.inserir("Beautyfull and yound", "Lana Del Rey", 5);
    }
}