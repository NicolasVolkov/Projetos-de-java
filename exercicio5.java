import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Julião";
        int aguametro = 30;
        int opcao = 0;
        do {
            System.out.println("\n--- CONSUMO DE ÁGUA ---");
            System.out.println("1 - Mostrar consumo");
            System.out.println("2 - Calcular valor de conta");
            System.out.println("3 - Classificação do consumo ");
            System.out.println("4 - fechar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    mostrarConsumo(nome, aguametro);
                    break;
                case 2:
                    System.out.println("Valor da conta: " + calcularValorConta(aguametro) + " reais");
                    break;
                case 3:
                    System.out.println("é um consumo  " + classificarConsumo(aguametro));
                    break;
                case 4:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 4);

    }
    public static void mostrarConsumo(String nome, double metro){
        System.out.println("Nome do morador: " + nome);
        System.out.println("Consumo de água em metros quadrados: " + metro+"m³");
    }
    public static double calcularValorConta( double agua) {
        double conta = 0;
        conta = 4.50 * agua;
        return(conta);
    }
    public static String classificarConsumo(int agua){
        if ( agua <= 10) {
            return("Baixo");
        } else if(agua <= 20){
            return("Médio");
        } else {
            return("Alto");
        }

    }
}
