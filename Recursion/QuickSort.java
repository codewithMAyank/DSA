/*
 The QuickSort algorithm is a sorting algorithm that sorts an array of elements 
 by recursively partitioning the array into sub-arrays and sorting each sub-array.
 The algorithm works by selecting a pivot element, and partitioning the array into 
 two sub-arrays - one with elements less than the pivot, and one with elements greater than the pivot. 
 The two sub-arrays are then recursively sorted using the same process.
*/


public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partition the array
            int pi = partition(arr, low, high);

            // recursively sort the two sub-arrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i + 1] and arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
