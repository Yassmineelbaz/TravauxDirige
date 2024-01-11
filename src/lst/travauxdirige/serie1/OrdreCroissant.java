package lst.travauxdirige.serie1;
import java.util.Scanner;

public class OrdreCroissant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        scanner.close();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Les variables dans l'ordre croissant sont : " + a + ", " + b);
    }
}
