import java.util.*;

public class series {
    public static void main(String[] args) {
        // Iterate from 1 to 5
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of numbers to be printed in series:");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print the numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print a new line
            System.out.println();
        }
    }
}