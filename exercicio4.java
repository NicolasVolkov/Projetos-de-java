import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filmnome = "";
        int filmdata = 0;
        String filmgen = "";
        System.out.print("Nome do filme: ");
        filmnome = sc.nextLine();
        System.out.print("Gênero do filme: ");
        filmgen = sc.nextLine();
        System.out.print("Data do filme: ");
        filmdata = sc.nextInt();
        int opcao = 0;
        do {
            System.out.println("\n--- INFO DO FILME ---");
            System.out.println("1 - Mostrar filme");
            System.out.println("2 - Calcular idade do filme");
            System.out.println("3 - Classificação do filme");
            System.out.println("4 - fechar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    mostrarFilme(filmnome, filmdata, filmgen);
                    break;
                case 2:
                    System.out.println("Idade do filme: " + calcularIdadeFilme(filmdata) + " anos");
                    break;
                case 3:
                    System.out.println("O filme é um  " + classificarFilme(filmdata));
                    break;
                case 4:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 4);
    }
    public static void mostrarFilme(String nome, int data, String gen){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Data de lançamento do filme: " + data);
        System.out.println("Gênero do filme: " + gen);
    }
    public static int calcularIdadeFilme(int data){
        int idade = 0;
        idade = (2026 - data);
        return(idade);
    }
    public static String classificarFilme(int data ){
        int idade = calcularIdadeFilme(data);
        if (idade <= 2) {
            return("lançamento");
        } else if(idade <= 10){
            return("filme recente");
        } else {
            return("clássico");
        }

    }
}
