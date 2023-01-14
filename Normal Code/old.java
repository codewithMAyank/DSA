import java.util.Scanner;

public class old {
    public static void main(String[] args) {
        System.out.println("hello world again");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input number :->");
            int age = sc.nextInt();
            System.out.println(age);
        }
    }
}
