import java.util.Scanner;
public class ativ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        System.out.println("Número de linhas: " + m.length);
        System.out.println("Número de colunas: " + m[0].length);
        System.out.println("Matriz nula:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) { // Faz com que cada um dos elementos tenham o valor 0
                 m[i][j] = 0;
                System.out.print(m[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Matriz identidade:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if ( i == j ) { // Verifica se a posição de linha e de coluna são iguais
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
                System.out.print(m[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
