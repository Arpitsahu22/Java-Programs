import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input index to delete
        System.out.print("\nEnter index of element to delete (0 to " + (n - 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the left from pos
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // reduce array size

            // Display new array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
