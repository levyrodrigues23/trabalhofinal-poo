public class Gimnosperma extends Especie {
    private TipoFolhaGimnosperma tipoFolha;
    private boolean produzCone;

    public Gimnosperma(String nomePopular, String bioma, ClassificacaoBotanica classificacao,
                       TipoFolhaGimnosperma tipoFolha, boolean produzCone) {
        super(nomePopular, bioma, classificacao);
        this.tipoFolha = tipoFolha;
        this.produzCone = produzCone;
    }

    public TipoFolhaGimnosperma getTipoFolha() {
        return tipoFolha;
    }

    public boolean isProduzCone() {
        return produzCone;
    }

    @Override
    public void exibirFicha() {
        System.out.println(
                "Planta: " + getNomePopular() +
                        " | Bioma: " + getBioma() +
                        " | Classificação: " + getClassificacao() +
                        " | Tipo de folha: " + tipoFolha +
                        " | Produz cone: " + (produzCone ? "Sim" : "Não")
        );
    }
}