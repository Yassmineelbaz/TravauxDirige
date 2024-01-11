package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int variable1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int variable2 = scanner.nextInt();

        System.out.print("Entrez la troisième variable : ");
        int variable3 = scanner.nextInt();

        scanner.close();

        int maximum = trouverMaximum(variable1, variable2, variable3);

        System.out.println("Le maximum des trois variables est : " + maximum);
    }

    private static int trouverMaximum(int a, int b, int c) {
$        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
}
