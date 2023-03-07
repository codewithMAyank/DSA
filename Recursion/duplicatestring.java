public class duplicatestring {

    public static String removeDuplicates(String str) {
        // Base case
        if (str.length() == 1) {
            return str;
        }
        
        // Recursive case
        char firstChar = str.charAt(0);
        String remaining = removeDuplicates(str.substring(1));
        
        // Remove duplicates of the first character
        if (remaining.charAt(0) == firstChar) {
            return remaining.substring(1);
        }
        
        // Concatenate the first character with the remaining string
        return firstChar + remaining;
    }

    public static void main(String[] args) {
        String str = "hello world";
        String result = removeDuplicates(str);
        System.out.println(result); // Output: helo wrd
    }
}
