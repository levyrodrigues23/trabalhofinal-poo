import java.util.ArrayList;
import java.util.List;

public class CatalogoBotanico {

    private List<Planta> plantas;

    public CatalogoBotanico() {
        plantas = new ArrayList<>();
        popularCatalogo();
    }

    private void popularCatalogo() {
        // --- BRIÓFITAS (Plantas sem vasos condutores, dependem de muita umidade) ---
        plantas.add(new Especie("Musgo-de-Turfeira (Sphagnum)", "Brejos úmidos", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Musgo-Cabelo-de-Vênus", "Matas de galeria", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Hepática-folhosa", "Troncos de árvores úmidos", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Hepática-de-crista", "Solo sombreado", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Musgo-bola", "Rochas úmidas", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Antócero-liso", "Margens de riachos", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Musgo-tapete", "Folhiço de floresta", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Musgo", "Brejos de altitude", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Hepática", "Brejos de altitude", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Antócero", "Áreas úmidas", ClassificacaoBotanica.BRIOFITA));

        // --- PTERIDÓFITAS (Têm vasos, mas não têm sementes. Reprodução por esporos) ---
        plantas.add(new Especie("Renda-portuguesa", "Cultivo/Ornamental", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Chifre-de-veado", "Epífita (em árvores)", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Selaginela (Musgo-da-ressurreição)", "Rochas da Caatinga", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Cavalinha", "Zonas ricas em água", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Licopódio", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Samambaia-paulistinha", "Encostas sombreadas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Avencão", "Matas ciliares", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Samambaia-de-metro", "Cultivo/Suspenso", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Samambaia-prata", "Interiores de florestas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Samambaia", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Avenca", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Xaxim", "Brejos", ClassificacaoBotanica.PTERIDOFITA));

        // --- GIMNOSPERMAS (Têm vasos e sementes, mas a semente é 'nua', sem fruto) ---
        plantas.add(new Especie("Araucária (Pinheiro-do-Paraná)", "Serras de altitude (Clima frio)", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Cica (Sagu-de-jardim)", "Cultivo/Jardins", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Ginkgo biloba", "Cultivo (Uso medicinal)", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Pinheiro-negro", "Áreas de reflorestamento", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Junípero", "Cultivo/Ornamental", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Pinheiro-manso", "Zonas temperadas de cultivo", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Cedro-do-Líbano", "Cultivo especializado", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Teixo", "Jardins botânicos", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Podocarpo", "Cercas vivas/Jardins", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Pinheiro", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Cipreste", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Tuia", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA));

        // ========== ANGIOSPERMAS ==========

        // --- PALMEIRAS (Sem espinhos no tronco) ---
        plantas.add(new Angiosperma("Carnaúba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Babaçu", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Buriti", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Coqueiro", "Litoral", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Macaúba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Licuri", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Dendê", "Litoral", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));
        plantas.add(new Angiosperma("Inajá", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA, false, TipoPlanta.PALMEIRA));

        // --- ERVAS/MATO (Cultivos e plantas herbáceas) ---
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

        // --- ÁRVORES "ARMADAS" DA CAATINGA (Com Espinhos) ---
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

        // --- CACTOS E BROMÉLIAS (Sempre com Espinhos) ---
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

        // --- ÁRVORES LISAS (Sem Espinhos) ---
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

