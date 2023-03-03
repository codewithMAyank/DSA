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

    // increasing number
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

    // main order
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printINC(n);
        System.out.println(fact(n));
        printINCadd(n);
    }
}
