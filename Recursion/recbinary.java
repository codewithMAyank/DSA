public class recbinary {
    
    public static void generateStrings(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        
        if (s.length() > 0 && s.charAt(s.length()-1) == '1') {
            generateStrings(n-1, s + "0");
        } else {
            generateStrings(n-1, s + "0");
            generateStrings(n-1, s + "1");
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        generateStrings(n, "");
    }
}
