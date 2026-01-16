import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CatalogoBotanico catalogo = new CatalogoBotanico();

        System.out.println("=== sistema de classificação botânica ===\n");

        System.out.print("A planta possui vasos condutores (raiz e caule)? (s/n): ");
        boolean vasos = sc.nextLine().equalsIgnoreCase("s");

        ClassificacaoBotanica classificacaoFinal;

        if (!vasos) {
            classificacaoFinal = ClassificacaoBotanica.BRIOFITA;
        } else {
            System.out.print("A planta possui sementes? (s/n): ");
            boolean sementes = sc.nextLine().equalsIgnoreCase("s");

            if (!sementes) {
                classificacaoFinal = ClassificacaoBotanica.PTERIDOFITA;
            } else {
                System.out.print("As sementes ficam protegidas por frutos? (s/n): ");
                boolean frutos = sc.nextLine().equalsIgnoreCase("s");

                if (!frutos) {
                    classificacaoFinal = ClassificacaoBotanica.GIMNOSPERMA;
                } else {
                    System.out.print("Quantos cotilédones a semente possui? (1 ou 2): ");
                    int cotiledones = Integer.parseInt(sc.nextLine());

                    if (cotiledones == 1) {
                        classificacaoFinal = ClassificacaoBotanica.ANGIOSPERMA_MONOCOTILEDONEA;
                    } else {
                        classificacaoFinal = ClassificacaoBotanica.ANGIOSPERMA_DICOTILEDONEA;
                    }
                }
            }
        }

        System.out.println("\n--- Plantas que se encaixam na classificação ---");
        boolean encontrou = false;

        for (Planta p : catalogo.getPlantas()) {
            if (p.getClassificacao() == classificacaoFinal) {
                p.exibirFicha();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma planta encontrada para essa classificação.");
        }

        sc.close();
    }
}
