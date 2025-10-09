public class ArraySearch {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int targetElement = 30;

        boolean found = isElementPresent(numbers, targetElement);

        if (found) {
            System.out.println("Element " + targetElement + " is present in the array.");
        } else {
            System.out.println("Element " + targetElement + " is not present in the array.");
        }

        targetElement = 60; // Test with an element not in the array
        found = isElementPresent(numbers, targetElement);

        if (found) {
            System.out.println("Element " + targetElement + " is present in the array.");
        } else {
            System.out.println("Element " + targetElement + " is not present in the array.");
        }
    }


    public static boolean isElementPresent(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true; // Element found
            }
        }
        return false; // Element not found after checking all elements
    }
}