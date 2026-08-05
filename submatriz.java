import java.util.Scanner;
public class submatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[][] n = new int[3][3];
        int[][] r = new int[3][3];
        System.out.println("\nNúmero de linhas: " + m.length);
        System.out.println("Número de colunas: " + m[0].length);
        System.out.println("Digite os valores da primeira tabela");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("");
                m[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Digite os valores da segunda tabela");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("");
                n[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\nMatriz 1:"); // a matriz é demonstrada
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2:"); // a matriz é demonstrada
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Subtração das Matrizes:");
        for (int i = 0; i < r.length; i++) { // faz a subtração e demonstra a matriz
            for (int j = 0; j < r[i].length; j++) {
                r[i][j] = m[i][j] - n[i][j];
                System.out.print(r[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
