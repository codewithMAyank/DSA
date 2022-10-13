import java.util.*;
public class inputarray {
    public static void main(String[] args) {
        int[] num= new int[100];
        try (Scanner sc = new Scanner(System.in)) {
            num[0]= sc.nextInt();
            num[1]= sc.nextInt();
            num[2]= sc.nextInt();
        }
        System.out.println("physics marks="+ num[0]);
        System.out.println("maths marks="+ num[1]);
        System.out.println("chemistry marks="+ num[2]);
    }
}
