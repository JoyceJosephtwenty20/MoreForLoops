import javax.swing.*;
import java.util.Scanner;

public class MoreForLops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /// even and odd numbers
        // First Loop - Even Numbers

        //  first Loop - Odd Numbers
        System.out.println("\nOdd Numbers:");
        for (int x = 1; x <= 20; x = x + 1) {
            if (x % 2 == 0) {
            } else {
                System.out.print(" " + x);
            }
        }
        System.out.println("\nEven Numbers:");
        for (int x = 1; x <= 20; x = x + 1) {
            if (x % 2 == 0) {
                System.out.print(" " + x);
            }
        }
        // Second loop END - END OF EVEN ODD Number loop
        // Below String Reverse
        System.out.println("\nPlease input a message to reverse: ");
        String origString = input.nextLine();
        String revString = ""; // place - holder for saving reversed value.
        int len = origString.length();

        for (int inp = len - 1; inp >= 0; inp--)
            revString = revString + origString.charAt(inp);
        System.out.println("Here is the reversed message:) " + revString);

        /// END of REVERSE String
        /// Factors of Number
        System.out.println("Please input a number to find all factors: ");
        int factNumber = input.nextInt();
        for(int f = 1; f <= factNumber; ++f) {
            if (factNumber % f == 0) {
                System.out.print(" " + f);
            }
        }
        // End of Factor Calculation
        // Function Calculate Factorial

        System.out.println("\nPlease input a number to find the factorial:");
        int stop, fa = 1;
        int findFactorial = input.nextInt();

        for(stop = 1;stop <= findFactorial;stop++) {
            fa = fa*stop;
        }
        System.out.println("Factorial value of " + findFactorial + " is: " + fa);

    }

}