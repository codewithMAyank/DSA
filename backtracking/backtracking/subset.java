package backtracking;
public class subset {
    public static void findSubset(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0){
                System.out.println("Empty String");
                return;
            }else{
                System.out.println(ans);
                return;
            }
        }

        // Recursion
        // Include current character (yes choice)
        findSubset(str, ans + str.charAt(i), i + 1);
        // Exclude current character (no choice)
        findSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
