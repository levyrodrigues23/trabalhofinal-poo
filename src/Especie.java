public class Especie extends Planta {

    public Especie(String nomePopular, String bioma, ClassificacaoBotanica classificacao) {
        super(nomePopular, bioma, classificacao);
    }

    @Override
    public void exibirFicha() {
        System.out.println(
                "Planta: " + getNomePopular() + " | Bioma: " + getBioma() + " | Classificação: " + getClassificacao()
        );
    }
}
