import java.util.Scanner;

public class Main {
    public static void (String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("For me to prove that I solved this excersise
    posed by ye, you must must give me an int that could possibly
    equate to three.");

    int m = scanner.nextInt();

    if (m > 5 || m <= 0) {
        System.out.println("You can't do that - that's an illegal move.");
        }
    else {
        for (int i = 1; i < m; i++) {
            System.out.println(" "); 
            for (int j = (m*2 - 1), k = (i - m); j >= 0; j--) {
                if (k > 0) {
                    System.out.print(k);
                    if (j >= m) k++;
                    else k--;
                }
                else {
                    System.out.print(" ");
                    if (j >= m) k++;
                    else k--;
                }

            }

}
