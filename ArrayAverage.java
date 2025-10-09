import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Average = sum / number of elements
        double avg = (double) sum / n;

        System.out.println("Average of array elements = " + avg);

        sc.close();

    }
}
