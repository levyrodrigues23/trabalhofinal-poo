public class Pteridofita extends Especie {
    private CrescimentoPteridofita tipoCrescimento;
    private boolean necessitaSombra;

    public Pteridofita(String nomePopular, String bioma, ClassificacaoBotanica classificacao,
                       CrescimentoPteridofita tipoCrescimento, boolean necessitaSombra) {
        super(nomePopular, bioma, classificacao);
        this.tipoCrescimento = tipoCrescimento;
        this.necessitaSombra = necessitaSombra;
    }

    public CrescimentoPteridofita getTipoCrescimento() {
        return tipoCrescimento;
    }

    public boolean isNecessitaSombra() {
        return necessitaSombra;
    }

    @Override
    public void exibirFicha() {
        System.out.println(
                "Planta: " + getNomePopular() +
                        " | Bioma: " + getBioma() +
                        " | Classificação: " + getClassificacao() +
                        " | Crescimento: " + tipoCrescimento +
                        " | Necessita sombra: " + (necessitaSombra ? "Sim" : "Não")
        );
    }
}