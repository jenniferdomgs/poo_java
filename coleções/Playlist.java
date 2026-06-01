import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
    
    public void inserir(Musica musica) {
        this.musicas.add(musica);
    }

    public void inserir(String titulo, String artista, int duracao) {
        Musica musica = new Musica(titulo, artista, duracao);
        inserir(musica);
    }

    public int duracaoTotal() {
        int total = 0;
        for(Musica musica: musicas) {
            total += musica.getDuracao();
        }
        return total;
    }

    public Musica musicaMaisLonga() {
        Musica maisLonga = musicas.getFirst();
        for(Musica musica: musicas) {
            if(musica.getDuracao() > maisLonga.getDuracao()) {
                maisLonga = musica;
            }
        }
        return maisLonga;
    }

    public void remover(String titulo) {
        musicas.removeIf(musica -> musica.getTitulo().equals(titulo));
    }
}