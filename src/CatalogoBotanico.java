import java.util.ArrayList;
import java.util.List;

public class CatalogoBotanico {

    private List<Planta> plantas;

    public CatalogoBotanico() {
        plantas = new ArrayList<>();
        popularCatalogo();
    }

    private void popularCatalogo() {

        plantas.add(new Especie("Musgo", "Brejos de altitude", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Hepática", "Brejos de altitude", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Antócero", "Áreas úmidas", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Samambaia", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Avenca", "Serras úmidas", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Xaxim", "Brejos", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Pinheiro", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Cipreste", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Tuia", "Cultivo", ClassificacaoBotanica.GIMNOSPERMA));
        plantas.add(new Especie("Carnaúba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Babaçu", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Buriti", "Mata de Cocais", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Coqueiro", "Litoral", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Bananeira", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Milho", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Arroz", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Capim-elefante", "Agricultura", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Juazeiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Umbuzeiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Angico", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Aroeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Catingueira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Jurema-preta", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pereiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Imburana", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pau-branco", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Marmeleiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Mandacaru", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Xique-xique", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Facheiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Coroa-de-frade", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Palma-forrageira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Cajueiro", "Litoral", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Mangue-vermelho", "Manguezal", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Mangue-branco", "Manguezal", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Mangue-preto", "Manguezal", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Algodão-da-praia", "Restinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pitombeira", "Interior", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Jenipapo", "Interior", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Quixabeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Oiticica", "Interior", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Cumaru", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Sabiá", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Barriguda", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Baraúna", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Murici", "Interior", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pequi", "Interior", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Canafístula", "Interior", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Espada-de-São-Jorge", "Cultivo/Nordeste", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Comigo-ninguém-pode", "Cultivo/Nordeste", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Palma de Licuri", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Faveleiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Quixabeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Oiticica", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Cumaru", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Jericó", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Licuri", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Aroeira-vermelha", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Barriguda", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Samambaia-do-Ceará", "Brejos", ClassificacaoBotanica.PTERIDOFITA));
        plantas.add(new Especie("Musgo-do-Ceará", "Brejos", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Hepática-do-Ceará", "Brejos", ClassificacaoBotanica.BRIOFITA));
        plantas.add(new Especie("Umarizeiro (Umarí)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Genipap", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Catingueira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Wilco (Geoffroea spinosa)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pepper tree (árvore de pimenta)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Umbuzeiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Cashew (Cajueiro)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pitombeira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Passiflora cincinnata (Maracujá da Caatinga)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pau-ferro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Ipê-amarelo-do-serrado", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Ipê-roxo", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Manipuça", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Mandacaru-branco", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Coroa-de-frade-maior", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Cereus-albicaulis", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Macaúba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Licuri", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Aroeira-do-sertão", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pau-d’arco-roxo", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Zephyranthes sylvestris (Cebola‑de‑calango)", "Semiárido/Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA)); // endêmica do Ceará :contentReference[oaicite:2]{index=2}
        plantas.add(new Especie("Amburana‑de‑cheiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // Amburana cearensis :contentReference[oaicite:3]{index=3}
        plantas.add(new Especie("Manipuça", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Guajiru", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Visgueiro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Sabiá", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pau‑ferro", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Arrojadoa rhodantha", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Brasiliopuntia brasiliensis", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Discocactus bahiensis", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Epiphyllum phyllanthus", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Harrisia adscendens", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Melocactus oreas", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Tacinga palmadora", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Pereskia aculeata", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Oiti", "Caatinga/Matas", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Ipê‑amarelo‑do‑serrado", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Ipê‑roxo", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Annona glabra (Araticum‑do‑brejo)", "Brejo de altitude", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Ximenia americana (Umbu‑cajá)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Cnidoscolus bahianus (Manem‑branco)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Lippia microphylla (Capim‑limão selvagem)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA));
        plantas.add(new Especie("Macambira", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA));
        plantas.add(new Especie("Anisacanto", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // Anisacanthus brasiliensis :contentReference[oaicite:1]{index=1}
        plantas.add(new Especie("Cnidoscolus pahlii", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // coletado em levantamentos florísticos
        plantas.add(new Especie("Boerhavia coccinia", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // herbácea pesquisada em flora da Caatinga :contentReference[oaicite:2]{index=2}
        plantas.add(new Especie("Cordia globosa", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // espécies de flora da Caatinga :contentReference[oaicite:3]{index=3}
        plantas.add(new Especie("Cardiospermum corindum", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // espécie visitada por polinizadores em levantamentos :contentReference[oaicite:4]{index=4}
        plantas.add(new Especie("Mutamba", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // Guazuma ulmifolia
        plantas.add(new Especie("Catanduva", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // arbusto/árvore regional
        plantas.add(new Especie("Pajeú", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // Triplaris gardneriana
        plantas.add(new Especie("Pau‑Mocó", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // Luetzelburgia auriculata
        plantas.add(new Especie("Palmeira Licuri‑branca", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA)); // variante regional da palma de licuri
        plantas.add(new Especie("Cereus peruvianus (Cacto Peruviano)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // presente em áreas secas :contentReference[oaicite:5]{index=5}
        plantas.add(new Especie("Echinocereus spp.", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // cactos diversos da flora semiárida
        plantas.add(new Especie("Portulaca oleracea (Beldroega)", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // espécie comum em áreas abertas
        plantas.add(new Especie("Bauhinia cheilantha", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // trepadeira típica da região
        plantas.add(new Especie("Euphorbia spp.", "Caatinga", ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA)); // gênero com espécies da caatinga


    }

    public List<Planta> getPlantas() {
        return plantas;
    }
}
