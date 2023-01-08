import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if (age<=17) {
                System.out.println("not attemd");
            }
            if (age>=18) {
                System.out.println("attend");
            }
            else {
                System.out.println("get out");
            }
        }
    }
    
}
