import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to search
        System.out.print("Enter element to find: ");
        int target = sc.nextInt();

        // Find first occurrence
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i; // first occurrence found
                break;
            }
        }

        // Output result
        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index " + index);
        } else {
            System.out.println("Element not found in array.");
        }

        sc.close();
    }
}
