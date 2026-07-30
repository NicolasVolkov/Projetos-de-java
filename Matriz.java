import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        String simetrica = " é ";
        String antissimetrica = " é ";
        System.out.println("Número de linhas: " + m.length);
        System.out.println("Número de colunas: " + m[0].length);
        System.out.println("Digite os valores da tabela");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("");
                m[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matriz:"); // a matriz é demonstrada
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < m.length; i++) { // verifica o tipo de matriz digitada
            for (int j = 0; j < m[i].length; j++) {
               if (m[i][j] != m[j][i])  {
                   simetrica = " não é ";
               }
                if (m[i][j] != -(m[j][i]))  {
                    antissimetrica = " não é ";
                }
            }
            System.out.println();
        }
        System.out.println("A matriz"+ simetrica+ "simétrica.");
        System.out.println("A matriz"+ antissimetrica+ "antissimétrica.");
        sc.close();
    }
}







