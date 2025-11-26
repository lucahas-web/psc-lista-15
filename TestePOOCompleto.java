import java.util.ArrayList;
import java.util.List;

public class TestePOOCompleto {
    public static void main(String[] args) {

        Filme filme = new Filme("Interestelar", 2014, 169, "Christopher Nolan");
        Musica musica = new Musica("Numb", 2003, 3.05, "Linkin Park");

        List<ItemMidia> listaMidia = new ArrayList<>();
        listaMidia.add(filme);
        listaMidia.add(musica);

        System.out.println("=== Teste 1: Polimorfismo com Classe Abstrata ===");
        for (ItemMidia item : listaMidia) {
            item.reproduzir();
        }

        System.out.println("\n=== Teste 2: Polimorfismo com Interface ===");

        Avaliavel avaliavel;

        avaliavel = filme;
        avaliavel.receberAvaliacao(10);

        avaliavel = musica;
        avaliavel.receberAvaliacao(9);

        System.out.println("\n=== Teste 3: Validação de Encapsulamento ===");

        System.out.println("Tentando definir duração negativa no filme...");
        filme.setDuracao(-50);

        System.out.println("Duração atual do filme: " + filme.getDuracao());
    }
}
