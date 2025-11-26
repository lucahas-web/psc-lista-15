public abstract class ItemMidia implements Avaliavel {

    private String titulo;
    private int anoLancamento;
    private double duracao; 

    public ItemMidia(String titulo, int anoLancamento, double duracao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        setDuracao(duracao);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Erro: A duração deve ser positiva.");
        }
    }

    public abstract void reproduzir();
}
