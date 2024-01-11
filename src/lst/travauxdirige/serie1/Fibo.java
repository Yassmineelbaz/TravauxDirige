package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Fibo {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez un entier positif n : ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Veuillez entrer un entier positif.");
            } else {
                long result = calculerFibonacci(n);
                System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + result);
            }

            scanner.close();
        }

        private static long calculerFibonacci(int n) {
            if (n <= 1) {
                return n;
            }

            long fibPrev = 0;
            long fibCurr = 1;

            for (int i = 2; i <= n; i++) {
                long temp = fibCurr;
                fibCurr = fibCurr + fibPrev;
                fibPrev = temp;
            }

            return fibCurr;
        }

}
