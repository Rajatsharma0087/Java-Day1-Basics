package Day4_Methods;

import java.util.Scanner;

public class PrintFactorial {
public static int factorial(int n) {
    
    if(n < 0) {
        return -1;
    }
    int fact = 1;
    for(int i=n; i>=1; i--) {
           fact *=i; 
    }
    return fact;
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number");
    int n = sc.nextInt();

    int result = factorial(n);

    if (result == -1) {
        System.out.println("Invalid number");
    } else {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    sc.close();
    
}

}

