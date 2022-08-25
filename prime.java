import java.util.*;
public class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n==2){
                System.out.println("it's prime");
            }else{
                boolean isprime=true;
                for (int i=2; i<=n-1; i++){
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
}
