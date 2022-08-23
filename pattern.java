public class pattern {
    public static void main(String[] args) {
        for (int line=1; line<=4;line++){
            System.out.println("****");
        }
        int n = 123456;
        int rev = 0;
        while (n > 0){
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}
