import java.util.*;
public class input {
    public static void main(String args[] ) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println(name);
            int a = 10;
            int b = 5;
            System.out.println(a < b);
        }
    }
}