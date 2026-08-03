import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vitoria = 0;
        int empate = 0;
        int derrota = 0;
        System.out.print("Número de vitórias: ");
        vitoria = sc.nextInt();
        System.out.print("Número de empate: ");
        empate = sc.nextInt();
        System.out.print("Número de derrotas: ");
        derrota = sc.nextInt();
        int partidas = (vitoria + empate + derrota);
        int opcao = 0;
        do {
            System.out.println("\n--- CAMPEONATO DE FUTEBOL ---");
            System.out.println("1 - Mostrar pontos");
            System.out.println("2 - Calcular Aproveitamento");
            System.out.println("3 - Situação do time");
            System.out.println("4 - fechar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Número de pontos: " + calcularPontos(vitoria, empate, derrota));
                    break;
                case 2:
                    System.out.println("Aproveitamento do time: " + calcularAproveitamento(vitoria, empate, derrota, partidas) + "%");
                    break;
                case 3:
                    System.out.println("A situação do time é  " + verificarSituacao(calcularAproveitamento(vitoria, empate, derrota, partidas)));
                    break;
                case 4:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

    }
    public static double calcularPontos(float vit, float emp, float der) {
        double pontos = 0;
        float pv = vit * 3;
        float pe = emp * 1;
        float pd = der * 0;
        pontos = (pv + pe + pd);
        return pontos;
    }
    public static float calcularAproveitamento(float vit, float emp, float der, int part) {
        float porc = (float) calcularPontos(vit, emp, der);
        int exp = part * 3;
        porc = (porc* 100/exp  * 100)/100;
        return (porc);
    }
    public static String verificarSituacao(double porc) {
        if (porc >= 80) {
            return ("Excelente");
        } else if (porc >= 60) {
            return ("Boa");
        } else if (porc >= 40) {
            return ("Regular");
        } else {
            return ("Ruim");
        }
    }
}
