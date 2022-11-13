public class palindromee {
    public static boolean nice(String Str) {
        for (int i = 0 ; i<Str.length()/2;i++){
            int n = Str.length();
            if (Str.charAt(i) == Str.charAt(n-i-1)){
                // not palindrome with !=
                return true;
            }
            
        }
        return false;
        
    }
    public static void main(String[] args) {
        String Str = "racecer";
        System.out.println(nice(Str));
    }
}
