import java.util.*;
public class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean isprime=true;
            for (int i=2; i<=n; i++){
                if (n % i ==0){
                    isprime=false;
                }
            }
            if (isprime == true){
                System.out.println("its prime number");
            } else {
                System.out.println("its not prime");
            }
        }
    }
}
