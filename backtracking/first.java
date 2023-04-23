package backtracking;

public class first {
    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() > 0) {
                System.out.print(ans + " ");
            } else {
                System.out.println("null");
            }
            return;
        }
        // Yes answer
        findSubsets(str, ans + str.charAt(i), i + 1);
        // No answer
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
