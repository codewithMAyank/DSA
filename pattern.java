public class pattern {
    public static void main(String[] args) {
        for (int line=1; line<=4;line++){
            System.out.println("****");
        }
        int n = 123456;
        while (n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}
