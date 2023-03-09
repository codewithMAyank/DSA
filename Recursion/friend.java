public class friend {
    public static void main(String[] args) {
        int n = 4; // total number of friends
        int count = countWays(n);
        System.out.println("Total number of ways: " + count);
    }

    public static int countWays(int n) {
        // base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // recursive case
        int ways = countWays(n - 1) + (n - 1) * countWays(n - 2);
        return ways;
    }
}
