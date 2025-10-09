import java.util.Scanner;

public class BinarySearch1 {

    // Method to perform binary search
    public int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate middle index

            // If the element is found at the middle
            if (array[mid] == element) {
                return mid; // Return the index
            }
            // If the element is greater than the middle element, search in the right half
            else if (array[mid] < element) {
                low = mid + 1;
            }
            // If the element is smaller than the middle element, search in the left half
            else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        BinarySearch1 searcher = new BinarySearch1();

        // Create a sorted array
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter vthe element to search: ");
        int targetElement = input.nextInt();
        input.close();

        int resultIndex = searcher.binarySearch(sortedArray, targetElement);

        if (resultIndex != -1) {
            System.out.println("Element " + targetElement + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}
