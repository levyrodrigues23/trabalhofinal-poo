public class Angiosperma extends Especie{
    boolean temEspinho;
    private TipoPlanta seParece;

    public Angiosperma(String nomePopular, String bioma, ClassificacaoBotanica classificacao,  boolean temEspinho, TipoPlanta seParece ) {
        super(nomePopular, bioma, classificacao);
        this.temEspinho = temEspinho;
        this.seParece = seParece;
    }


    public TipoPlanta getTipoPlanta(){
        return seParece;
    }


    @Override
    public void exibirFicha() {
        System.out.println(
                "Planta: " + getNomePopular() + " | Bioma: " + getBioma() + " | Classificação: " + getClassificacao() + "  | se parece com:  " + getTipoPlanta()
        );
    }
}
