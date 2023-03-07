public class occurance {
    
    public static int lastOccurrence(int[] arr, int target) {
        return lastOccurrence(arr, target, arr.length - 1);
    }
    
    private static int lastOccurrence(int[] arr, int target, int endIndex) {
        if (endIndex < 0) {
            return -1; // base case: target not found
        }
        if (arr[endIndex] == target) {
            return endIndex; // base case: target found
        }
        return lastOccurrence(arr, target, endIndex - 1); // recursive case
    }
    
    public static int firstOccurrence(int[] arr, int target) {
        return firstOccurrence(arr, target, 0);
    }
    
    private static int firstOccurrence(int[] arr, int target, int startIndex) {
        if (startIndex >= arr.length) {
            return -1; // base case: target not found
        }
        if (arr[startIndex] == target) {
            return startIndex; // base case: target found
        }
        return firstOccurrence(arr, target, startIndex + 1); // recursive case
    }

    // counting tiles
    public static int countWaysToTile(int n) {
        if (n <= 1) {
            return 1;
        }
        return countWaysToTile(n-1) + countWaysToTile(n-2);
    }
    
    
    public static void main(String[] args) {
        System.out.println(countWaysToTile(5));
        int[] arr = {5,5,5,5};
        int target = 5;
        int firstIdx = firstOccurrence(arr, target);
        int lastIdx = lastOccurrence(arr, target);
        if (firstIdx != -1) {
            System.out.println("First occurrence of " + target + " is at index " + firstIdx);
        } else {
            System.out.println(target + " not found in the array.");
        }
        if (lastIdx != -1) {
            System.out.println("Last occurrence of " + target + " is at index " + lastIdx);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
