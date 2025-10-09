public class TargetCheck {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 5, 6};
        int target = 6;

        boolean result = isTargetPresent(arr, target);
        System.out.println(result); // Output: true
    }

    // Method to check if target exists in array
    public static boolean isTargetPresent(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true; // target found
            }
        }
        return false; // target not found
    }
}
