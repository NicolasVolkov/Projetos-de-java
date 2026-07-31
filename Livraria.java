import java.util.Scanner;
import java.util.ArrayList;

public class Livraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> emprestado = new ArrayList<>();
        lista.add("Dom Casmurro");
        lista.add("Torto arado");
        int registro = 0;
        int opcao = 0;
        String livro = " ";
        do {
         System.out.println("\n--- LIVRARIA ---");
         System.out.println("1 - Cadastrar livro");
         System.out.println("2 - Emprestar livro");
         System.out.println("3 - Devolver livro");
         System.out.println("4 - Listar livros disponíveis");
         System.out.println("5 - Fechar menu");
         System.out.print("Escolha: ");
         opcao = sc.nextInt();
         switch (opcao) {

          case 1: // soma
                System.out.println(lista);
                System.out.println("Qual livro você deseja cadastrar? ");
                livro = sc.nextLine();
                for (int i = 0; i < lista.size();i++ ) {
                    if (lista.get(i) == livro) {
                        i = lista.size();

                        registro = 1;
                }
                    if (registro == 1) {
                        System.out.println("Este livro já está cadastrado na livraria");
                    } else {
                        lista.add(livro);
                        System.out.println("Este livro foi cadastrado na livraria");
                    }
                System.out.print("");
                break;
          case 2: // emprestar livro
                System.out.println(lista);
                System.out.println("Qual livro você deseja pegar emprestado? ");
                livro = sc.nextLine();
                for (int i = 0; i < lista.size();i++ ) {
                    if (lista.get(i) == livro) {
                        i = lista.size();
                        lista.remove(livro);
                        emprestado.add(livro);
                        registro = 1;
                    }
                }
                if (registro == 1) {
                    System.out.println("Este livro foi emprestado");
                } else {
                    System.out.println("Este livro não foi encontrado na livraria");
                }
                break;

          case 3: // Devolver livro
                System.out.println(emprestado);
                System.out.println("Qual livro você deseja devolver? ");
                livro = sc.nextLine();
                for (int i = 0; i < emprestado.size();i++ ) {
                    if (lista.get(i) == livro) {
                        i = lista.size();
                        lista.add(livro);
                        emprestado.remove(livro);
                        registro = 1;
                    }
                }
                if (registro == 1) {
                    System.out.println("Este livro foi devolvido");
                } else {
                    System.out.println("Este livro não foi encontrado nos livros emprestados");
                }
                break;

          case 4: // Listar livros disponíveis
                System.out.println(lista);
                break;
          default:
                System.out.println("Opção inválida!");
         }
        } while (opcao != 5);
        sc.close();
    }
}
