public class binomial {
    public static int factorial(int n) {
        int f = 1;
        for (int i=1;i<=n;n++){
            f = f*i;
        }
        return f;//factorial
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
