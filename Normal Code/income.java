import java.util.*;
public class income {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int income= sc.nextInt();
            int tax;
            if (income<500000){
                tax = 0;
            }
            else if (income>500000 && income<2000000){
                tax = (int)(income * 0.2);
            } else {
                tax = (int)(income * 0.55);
            }
            System.out.println("yout tax is:" + tax);
        }
    }
}
