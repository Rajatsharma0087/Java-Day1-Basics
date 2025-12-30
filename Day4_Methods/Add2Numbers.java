package Day4_Methods;

import java.util.Scanner;

public class Add2Numbers {
    public static int calculateSum(int a, int b) {
        return a +b ;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 numbers is: "+ sum);
        sc.close();
    }

    
}
