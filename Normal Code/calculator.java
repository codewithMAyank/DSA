import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            System.out.print("Enter the operator (+, -, /, *, %): ");
            char operator = sc.next().charAt(0);
            double result;
            switch (operator) {
                case '+': result = a + b;
                          break;
                case '-': result = a - b;
                          break;
                case '*': result = a * b;
                          break;
                case '/': if (b == 0) {
                                System.out.println("Error: division by zero");
                                return;
                          }
                          result = a / b;
                          break;
                case '%': if (b == 0) {
                                System.out.println("Error: division by zero");
                                return;
                          }
                          result = a % b;
                          break;
                default: System.out.println("Error: invalid operator");
                         return;
            }
            System.out.println("Result: " + result);
        }
    }
}
