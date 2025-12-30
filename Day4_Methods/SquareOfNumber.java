package Day4_Methods;

import java.util.Scanner;

public class SquareOfNumber {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = square(num);

        System.out.println("Square of " + num + " is: " + result);

        sc.close();
    }
}
