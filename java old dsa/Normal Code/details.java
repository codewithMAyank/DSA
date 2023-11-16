import java.util.*;
public class details {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.print("enter your detail-->");
                int n = sc.nextInt();
                if (n % 10 ==0){
                    System.out.print("entered wrong detail");
                    break;
                }
                System.out.println(n);
            }
            while (true);
        }
    }
}
