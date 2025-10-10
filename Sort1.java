public class Sort1 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0,1,2,0,1,0};
        countingSort(arr, 10);  // max element = 8

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int[] arr, int max) {
        int[] count = new int[max + 1];

        // Count frequency
        for (int num : arr)
            count[num]++;

        // Rebuild array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]--> 0)
                arr[index++] = i;
        }
    }
}
