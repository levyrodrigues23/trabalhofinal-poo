public abstract class Planta {

    private String nomePopular;
    private String bioma;
    private ClassificacaoBotanica classificacao;


    public Planta(String nomePopular, String bioma, ClassificacaoBotanica classificacao) {
        this.nomePopular = nomePopular;
        this.bioma = bioma;
        this.classificacao = classificacao;
    }

    public String getNomePopular() {

        return nomePopular;
    }

    public String getBioma() {

        return bioma;
    }

    public ClassificacaoBotanica getClassificacao() {

        return classificacao;
    }

    public abstract void exibirFicha();
}
