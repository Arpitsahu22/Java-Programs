package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        mergeSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }

        // Create two subarrays a and b
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Fill subarray a
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }

        // Fill subarray b
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i + a.length];
        }

        // Recursive sort calls
        mergeSort(a);
        mergeSort(b);

        // Merge sorted subarrays into original
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        // Copy remaining elements (if any)
        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }
}
