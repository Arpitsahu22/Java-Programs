// Java program to check whether
// an element is present in array or not
import java.util.Arrays;
import java.util.stream.IntStream;

class presentelement
{
    // Method to check if the specified element
    // is present in the array or not
    private static boolean isElementPresent(int[] arr, int key)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        for (int element : arr) {
            if (element == key) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {

        // Get the array
        int arr[] = { 3, 5, 7, 2, 6, 10 };

        // Get the value to be checked
        int key = 7;

        // Check if this value is
        // present in the array or not
        boolean res = isElementPresent(arr, key);

        System.out.println("Is " + key
                + " present in the array: "
                + res);

    }
}