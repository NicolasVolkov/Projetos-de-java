import java.util.Scanner;
public class aprov {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int frequencia = 0;
    float media = 0;
    System.out.print("Digite a sua média: ");
    media = sc.nextFloat();
    System.out.print("Digite sua frequência: ");
    frequencia = sc.nextInt();
    if (media >= 7.0 && frequencia >= 75) {
        System.out.println("Aprovado!!");
    } else if ( frequencia < 75) {
        System.out.println("Reprovado por falta...");
    } else {
        System.out.println("Reprovado por nota...");
    }
    sc.close();
}
}