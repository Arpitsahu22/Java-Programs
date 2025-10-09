import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate sum
    static int sum(int n) {
        if (n == 1) {   // Base case
            return 1;
        }
        return n + sum(n - 1); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = sum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }

        sc.close();
    }
}
