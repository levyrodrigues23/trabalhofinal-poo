public class Briofita extends Especie {
    private SubstratoBriofita substrato;
    private boolean necessitaAguaPermanente;

    public Briofita(String nomePopular, String bioma, ClassificacaoBotanica classificacao,
                    SubstratoBriofita substrato, boolean necessitaAguaPermanente) {
        super(nomePopular, bioma, classificacao);
        this.substrato = substrato;
        this.necessitaAguaPermanente = necessitaAguaPermanente;
    }

    public SubstratoBriofita getSubstrato() {
        return substrato;
    }

    public boolean isNecessitaAguaPermanente() {
        return necessitaAguaPermanente;
    }

    @Override
    public void exibirFicha() {
        System.out.println(
                "Planta: " + getNomePopular() +
                        " | Bioma: " + getBioma() +
                        " | Classificação: " + getClassificacao() +
                        " | Substrato: " + substrato +
                        " | Água permanente: " + (necessitaAguaPermanente ? "Sim" : "Não")
        );
    }
}