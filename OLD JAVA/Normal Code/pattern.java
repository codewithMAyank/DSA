public class pattern {
    private static int i = 0;

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
        for (i=1; i<=6; i++){
            if (i==5);
            System.out.println(i);
        }
        System.out.println("out of the cupboard");
    }
}
