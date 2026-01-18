import java.util.ArrayList;
import java.util.List;

public class CatalogoBotanico {

    private List<Planta> plantas;

    public CatalogoBotanico() {
        plantas = new ArrayList<>();
        popularCatalogo();
    }

    private void popularCatalogo() {

        plantas.add(new Briofita("Musgo-de-Turfeira (Sphagnum)", "Brejos úmidos", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, true));
        plantas.add(new Briofita("Musgo-Cabelo-de-Vênus", "Matas de galeria", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.TRONCO, false));
        plantas.add(new Briofita("Hepática-folhosa", "Troncos de árvores úmidos", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.TRONCO, false));
        plantas.add(new Briofita("Hepática-de-crista", "Solo sombreado", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, false));
        plantas.add(new Briofita("Musgo-bola", "Rochas úmidas", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.ROCHA, false));
        plantas.add(new Briofita("Antócero-liso", "Margens de riachos", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, true));
        plantas.add(new Briofita("Musgo-tapete", "Folhiço de floresta", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, false));
        plantas.add(new Briofita("Musgo", "Brejos de altitude", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, true));
        plantas.add(new Briofita("Hepática", "Brejos de altitude", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, true));
        plantas.add(new Briofita("Antócero", "Áreas úmidas", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, true));
        plantas.add(new Briofita("Musgo-estrela", "Rochas de serra", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.ROCHA, false));
        plantas.add(new Briofita("Hepática-terrestre", "Solo de floresta", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.SOLO, false));
        plantas.add(new Briofita("Musgo-pendente", "Galhos de árvores", ClassificacaoBotanica.BRIOFITA, SubstratoBriofita.TRONCO, false));
        plantas.add(new Pteridofita("Renda-portuguesa", "Cultivo/Ornamental", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Chifre-de-veado", "Epífita (em árvores)", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.EPIFITA, true));
        plantas.add(new Pteridofita("Selaginela (Musgo-da-ressurreição)", "Rochas da Caatinga", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.RUPESTRE, false));
        plantas.add(new Pteridofita("Cavalinha", "Zonas ricas em água", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.AQUATICA, false));
        plantas.add(new Pteridofita("Licopódio", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Samambaia-paulistinha", "Encostas sombreadas", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Avencão", "Matas ciliares", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Samambaia-de-metro", "Cultivo/Suspenso", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.EPIFITA, true));
        plantas.add(new Pteridofita("Samambaia-prata", "Interiores de florestas", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Samambaia", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Avenca", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Xaxim", "Brejos", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Samambaia-açu", "Matas fechadas", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Samambaia-imperial", "Jardins sombreados", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Pteridofita("Nephrolepis (samambaia-paulista)", "Cultivo", ClassificacaoBotanica.PTERIDOFITA, CrescimentoPteridofita.TERRESTRE, true));
        plantas.add(new Gimnosperma("Araucária (Pinheiro-do-Paraná)", "Serras de altitude (Clima frio)", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Cica (Sagu-de-jardim)", "Cultivo/Jardins", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.COMPOSTA, false));
        plantas.add(new Gimnosperma("Ginkgo biloba", "Cultivo (Uso medicinal)", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.LEQUE, false));
        plantas.add(new Gimnosperma("Pinheiro-negro", "Áreas de reflorestamento", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Junípero", "Cultivo/Ornamental", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.ESCAMA, true));
        plantas.add(new Gimnosperma("Pinheiro-manso", "Zonas temperadas de cultivo", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Cedro-do-Líbano", "Cultivo especializado", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Teixo", "Jardins botânicos", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Podocarpo", "Cercas vivas/Jardins", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Pinheiro", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Cipreste", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.ESCAMA, true));
        plantas.add(new Gimnosperma("Tuia", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.ESCAMA, true));
        plantas.add(new Gimnosperma("Sequoia", "Cultivo especializado", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Gimnosperma("Pinheiro-do-brejo", "Áreas úmidas", ClassificacaoBotanica.GIMNOSPERMA, TipoFolhaGimnosperma.AGULHA, true));
        plantas.add(new Angiosperma("Carnaúba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Babaçu", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Buriti", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Coqueiro", "Litoral", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Macaúba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Licuri", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Dendê", "Litoral", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Inajá", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Milho", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Capim-elefante", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Bananeira", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Espada-de-São-Jorge", "Cultivo", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Capim-buffel", "Caatinga/Pasto", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Sorgo", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Feijão", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Mandioca", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Algodão-herbáceo", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Amendoim", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ERVA));
        plantas.add(new Angiosperma("Juazeiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Angico", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Catingueira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Jurema-preta", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Quixabeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Faveleiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Sabiá", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Barriguda", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Wilco (Geoffroea spinosa)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Ximenia americana (Umbu-cajá)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Pereiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Jurema-branca", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Mandacaru", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Mandacaru-branco", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Xique-xique", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Facheiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Coroa-de-frade", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Palma-forrageira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Macambira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Tacinga palmadora", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Cabeça-de-frade", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Quipá", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Rabo-de-raposa", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_ESPINHO, true, TipoPlanta.CACTO));
        plantas.add(new Angiosperma("Umbuzeiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Aroeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Pau-branco", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Marmeleiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Cajueiro", "Litoral", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Oiticica", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Ipê-roxo", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Baraúna", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Pitombeira", "Interior", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Maniçoba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Ipê-amarelo", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Craibeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Pau-d'arco", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Imburana-de-cheiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Cedro", "Mata úmida", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Jatobá", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Pau-ferro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Mulungu", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Tamboril", "Mata de várzea", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Mameleiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Munguba", "Beira de rio", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Cajarana", "Interior", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Cajá", "Interior", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Mangabeira", "Litoral/Tabuleiro", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Jacarandá", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
        plantas.add(new Angiosperma("Gonçalo-alves", "Mata seca", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.ARVORE));
    }

    public List<Planta> getPlantas() {
        return plantas;
    }
}


