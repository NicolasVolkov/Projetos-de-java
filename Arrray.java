import java.util.Scanner;
import java.util.ArrayList;

public class Arrray {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números:");
        int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número: ");
            int num = sc.nextInt();
            lista.add(num);
         }
        
        System.out.println(lista);
        int soma = 0;
        for (int i = 0; i < lista.size();i++ ) {
           System.out.print(lista.get(i));
            soma = soma + lista.get(i);
            if (i < lista.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+soma);
        sc.close();
    }
}
