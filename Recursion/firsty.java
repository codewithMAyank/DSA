public class firsty {
    // static given value
    // decreasing order
    public static void printDec(int n) {
        // base case
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    // increasing order
    public static void printINC(int n) {
        // base case
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        printINC(n-1);
        System.out.print(n+" ");
    }

    // factorial n
    public static int fact(int n) {
        // base case
        if (n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    // sum number
    public static int printINCadd(int n) {
        // base case
        if (n == 1){
            System.out.print(n+" ");
            return 1;
        }
        int Snm1 = printINCadd(n-1);
        int Sn = n + Snm1;
        System.out.print(Sn+" ");
        return Sn;
    }

        // fibonacci number
        public static int fib(int n) {
            // base case
            if (n <= 1) {
                return n;
            }
            return fib(n - 1) + fib(n - 2);
        }

    // main order
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printINC(n);
        System.out.println(fact(n));
        System.out.println(printINCadd(n));
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}
