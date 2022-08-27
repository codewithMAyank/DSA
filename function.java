import java.util.*;
public class function {
    public static void printhello() {
        System.out.println("hello_world_of_functions");
    }
    public static void printelse() {
        System.out.println("mind_your_own_business");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter_your_age -->");
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
