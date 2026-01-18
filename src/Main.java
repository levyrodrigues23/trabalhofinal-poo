import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CatalogoBotanico catalogo = new CatalogoBotanico();

        System.out.println("=== sistema de classificação botânica ===\n");

        System.out.print("A planta é vascular(possui raiz, folhas e caule)? (s/n): ");
        boolean vascular = sc.nextLine().equalsIgnoreCase("s");

        ClassificacaoBotanica classificacaoFinal;

        if (!vascular) {

            classificacaoFinal = ClassificacaoBotanica.BRIOFITA;
        } else {
            System.out.print("A planta possui sementes? (s/n): ");
            boolean sementes = sc.nextLine().equalsIgnoreCase("s");

            if (!sementes) {
                classificacaoFinal = ClassificacaoBotanica.PTERIDOFITA;
            } else {
                System.out.print("As plantas produzem frutos? (s/n): ");
                boolean frutos = sc.nextLine().equalsIgnoreCase("s");

                if (!frutos) {
                    classificacaoFinal = ClassificacaoBotanica.GIMNOSPERMA;
                } else{
                    System.out.print("As plantas contém espinhos? (s/n): ");
                    boolean espinhos = sc.nextLine().equalsIgnoreCase("s");
                    if (!espinhos) {
                        classificacaoFinal = ClassificacaoBotanica.ANGIOSPERMA;
                    } else{
                        classificacaoFinal = ClassificacaoBotanica.ANGIOSPERMA_ESPINHO;
                    }

                    }
                }
            }

        if(classificacaoFinal == ClassificacaoBotanica.BRIOFITA){
            System.out.println("\n--- Plantas que pertencem a classificacao " + classificacaoFinal.toString() + " ---");
        } else if(classificacaoFinal == ClassificacaoBotanica.PTERIDOFITA){
            System.out.println("\n--- Plantas que pertencem a classificacao " + classificacaoFinal.toString() + " ---");
        } else if(classificacaoFinal == ClassificacaoBotanica.ANGIOSPERMA){
            System.out.println("\n--- Plantas que pertencem a classificacao " + classificacaoFinal.toString() + " ---");
        } else if(classificacaoFinal == ClassificacaoBotanica.ANGIOSPERMA_ESPINHO) {
            System.out.println("--- Plantas que pertencem a classificacao  " + classificacaoFinal.toString() + " ---");
        } else{
            System.out.println("--- Plantas que pertencem a classificação GIMNOSPERMAS ---");
        }

        boolean encontrou = false;

        for (Planta planta : catalogo.getPlantas()) {
            if (planta.getClassificacao() == classificacaoFinal) {
                planta.exibirFicha();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma planta encontrada para essa classificação.");
        }

        sc.close();
    }
}
