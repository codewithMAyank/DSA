public class sortedarrayrecurssion {
    public static boolean isSorted(int[] arr) {
        // Call the recursive function with initial index 0
        return isSortedHelper(arr, 0);
    }

    // Recursive function to check if an array is sorted or not
    private static boolean isSortedHelper(int[] arr, int index) {
        // Base case: If the index is at the end of the array, return true
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next element, return false
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call with next index
        return isSortedHelper(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is array sorted? " + isSorted(arr)); // true

        int[] arr2 = {1, 3, 2, 4, 5};
        System.out.println("Is array sorted? " + isSorted(arr2)); // false
    }
}
