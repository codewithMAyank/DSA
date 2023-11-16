package backtracking;

public class findpermutation {
    public static void ffindpermutation(String str , String ans) {
        //base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //recursion case
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            ffindpermutation(ros, ans+ch);
        }
    }
    public static void main(String[] args) {
         String str = "abc";
         ffindpermutation(str, "");
    }
}
