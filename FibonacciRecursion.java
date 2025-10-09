import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // base case
        } else if (n == 1) {
            return 1;  // base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // recursive case
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
