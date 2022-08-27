import java.util.*;
public class function {
    public static void printhello() {
        System.out.println("hello world of functions");
    }
    public static void printelse() {
        System.out.println("mind your ass");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if (age<=17) {
                printhello();
            }
            else {
                printelse();
            }
        }
    }
        
}
