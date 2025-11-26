public class Musica extends ItemMidia {

    private String artista;

    public Musica(String titulo, int anoLancamento, double duracao, String artista) {
        super(titulo, anoLancamento, duracao);
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando a música: " + getTitulo() +
                " do " + artista + ". Tempo: " + getDuracao() + " minutos.");
    }

    @Override
    public void receberAvaliacao(int nota) {
        System.out.println("A música " + getTitulo() + " recebeu " + nota + " estrelas.");
    }
}
