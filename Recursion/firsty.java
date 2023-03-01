public class firsty {
// static given value
//decresing order
    public static void printDec(int n) {
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printINC(int n) {
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        printINC(n-1);
        System.out.print(n+" ");
    }
// main order
    
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printINC(n);
    }
}
