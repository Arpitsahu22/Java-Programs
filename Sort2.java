public class Sort2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,0};
        countingSort(arr, 8);  // max element = 8

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void countingSort(int[] arr, int max) {
        int[] count = new int[max + 1];

        // Count frequency using while loop
        int i = 0;
        while (i < arr.length) {
            count[arr[i]]++;
            i++;
        }

        // Rebuild sorted array using while loop
        int index = 0;
        int num = 0;

        while (num <= max) {
            while (count[num] > 0) {
                arr[index] = num;
                index++;
                count[num]--;
            }
            num++;
        }
    }
}
