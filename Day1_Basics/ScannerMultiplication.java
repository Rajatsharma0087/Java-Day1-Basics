import java.util.Scanner;

public class ScannerMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Addition result: " + result);

        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Subtraction result: " + result);

        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication result: " + result);

        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero not allowed");
            } else {
                result = num1 / num2;
                System.out.println("Division result: " + result);
            }

        } else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
