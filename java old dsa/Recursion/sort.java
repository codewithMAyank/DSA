
//time complexity o(n)
//space complexity o(n)
public class sort {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            //base case
            return true;
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrr = {1, 2, 7, 4, 5};

        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arrr,0)); // false
        // Output: true
    }
}
